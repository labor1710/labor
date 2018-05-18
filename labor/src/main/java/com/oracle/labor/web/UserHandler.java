package com.oracle.labor.web;

import java.util.Date;

import static org.hamcrest.CoreMatchers.instanceOf;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.oracle.labor.common.util.GenerateID;
import com.oracle.labor.po.Bip;
import com.oracle.labor.po.BipForeignlanguage;
import com.oracle.labor.po.BipSkill;
import com.oracle.labor.po.ZjGrqzdjb;
import com.oracle.labor.po.ZjGrqzdjjdb;
import com.oracle.labor.po.ZjGrqzgzb;
import com.oracle.labor.service.UserService;

@Controller
public class UserHandler {

	@Autowired
	UserService userService;
	
/*	@RequestMapping("/service/test/getUsers/{page}")
	public String getUsers(@PathVariable("page") Integer page,Map<String,Object> map) {
		
		PageInfo<LdlscUser> info=new PageInfo<LdlscUser>(userService.selectAll(page));
		map.put("pageInfo", info);
		return "service/test/userList";
	}*/
	
	@RequestMapping("/service/zj/save")
	public String save(Bip bip,@RequestParam(value="bipSZyjn",required=false)String[] skills,@RequestParam(value="bipSJsdj",required=false)String[] skillsGrade,@RequestParam(value="bipSYears",required=false)String[] skillsYear,@RequestParam(value="bip_fl_jywy",required=false)String[] languages,@RequestParam(value="bip_fl_slcd",required=false)String[] languageGrade,@RequestParam(value="init_wysm",required=false)String[] languageContext,ZjGrqzdjb register,
			@RequestParam("GZ")String[] kindOfWorks,@RequestParam("YGXS")String[] formOfWorks,@RequestParam("ZDYX")String[] lowestSalary,@RequestParam("ZGYX")String[] highestSalary) {
		List<ZjGrqzgzb> workList=new ArrayList<ZjGrqzgzb>();
		register.setSfdj("否");
		//生成登记日期
		Calendar c=Calendar.getInstance();
		c.setTime(new Date());
		StringBuffer sb=new StringBuffer();
		sb.append(c.get(Calendar.YEAR)).append(".").append(c.get(Calendar.MONTH)+1).append(".").append(c.get(Calendar.DATE));
		register.setDjsj(sb.toString());
		//生成工种序列
		for(int i=0;i<kindOfWorks.length;i++){
				ZjGrqzgzb work=new ZjGrqzgzb();
				work.setDjsj(sb.toString());
				work.setQzgzbh(GenerateID.getGenerateId());
				work.setYgxs(formOfWorks[i]);
				work.setGz(kindOfWorks[i]);
				work.setZdyx(lowestSalary[i]);
				work.setZgyx(highestSalary[i]);
				workList.add(work);
		}
		//生成登记有效期
		c.setTime(new Date(System.currentTimeMillis()+1000*60*60*24*15));
		StringBuffer sb1=new StringBuffer();
		sb1.append(c.get(Calendar.YEAR)).append(".").append(c.get(Calendar.MONTH)+1).append(".").append(c.get(Calendar.DATE));
		register.setDjyxq(sb1.toString()); 		
		register.setQzbh(GenerateID.getGenerateId());
		List<BipSkill> list=new ArrayList<BipSkill>();
		List<BipForeignlanguage> list1=new ArrayList<BipForeignlanguage>();
		Bip bip1=userService.getBipByCitizenid(bip.getBipCitizenid());
		//根据身份证号得登记人生日
		String birth=bip.getBipCitizenid().substring(6, 14);
		bip.setBipBirthday(birth);
		String generateID=GenerateID.getGenerateId();
		bip.setBipId(generateID);
		//数据库中未存在将要插入的用户
		if(bip1==null){
			register.setBipId(bip.getBipId());
			if(skills!=null){
				for(int i=0;i<skills.length;i++){
					BipSkill bipSkill=new BipSkill();
					bipSkill.setBipSId(GenerateID.getGenerateId());
					bipSkill.setBipId(generateID);
					bipSkill.setBipSZyjn(skills[i]);
					bipSkill.setBipSJsdj(skillsGrade[i]);
					bipSkill.setBipSYears(skillsYear[i]);
					list.add(bipSkill);
				}
			}
			if(languages!=null){
				for(int i=0;i<languages.length;i++){
					BipForeignlanguage bipForeignlanguage=new BipForeignlanguage();
					bipForeignlanguage.setBipFlId(GenerateID.getGenerateId());
					bipForeignlanguage.setBipFlJywy(languages[i]);
					bipForeignlanguage.setBipFlWysm(languageContext[i]);
					bipForeignlanguage.setBipId(generateID);
					bipForeignlanguage.setBipFlSlcd(languageGrade[i]);
					list1.add(bipForeignlanguage);
				}
			}
			//数据库中已存在相同的求职登记表
			if(userService.checkRegister(register)){
				List<ZjGrqzgzb> insertWork=new ArrayList<ZjGrqzgzb>();
	        	for(int i=0;i<workList.size();i++){
	        		if(!userService.checkKindOfWork(workList.get(i))){
	        			workList.get(i).setQzbh(userService.getRegisterId(register));
	        			insertWork.add(workList.get(i));
	        		}
	        	}
	            userService.saveWithWork(bip,list,list1,insertWork);
			}
			//数据库中不存在相同的求职登记表
	        if(!userService.checkRegister(register)){
	        	for(int i=0;i<workList.size();i++){
	        		workList.get(i).setQzbh(register.getQzbh());
	        	}
	        	userService.saveWithRegisterAndWork(bip,list,list1,register,workList);
	        }
		}
		//数据库中存在相同的用户，但部分数据不一致
		if(bip1!=null&&!bip1.equals(bip)){
		    register.setBipId(bip.getBipId());
		    if(skills!=null){
		    	  for(int i=0;i<skills.length;i++){
						BipSkill bipSkill=new BipSkill();
						bipSkill.setBipSId(GenerateID.getGenerateId());
						bipSkill.setBipId(generateID);
						bipSkill.setBipSZyjn(skills[i]);
						bipSkill.setBipSJsdj(skillsGrade[i]);
						bipSkill.setBipSYears(skillsYear[i]);
						list.add(bipSkill);
					}
		    }
		    if(languages!=null){
		    	for(int i=0;i<languages.length;i++){
					BipForeignlanguage bipForeignlanguage=new BipForeignlanguage();
					bipForeignlanguage.setBipFlId(GenerateID.getGenerateId());
					bipForeignlanguage.setBipFlJywy(languages[i]);
					bipForeignlanguage.setBipFlWysm(languageContext[i]);
					bipForeignlanguage.setBipId(generateID);
					bipForeignlanguage.setBipFlSlcd(languageGrade[i]);
					list1.add(bipForeignlanguage);
				}
		    }
			//数据库中已存在相同的求职登记表
            if(userService.checkRegister(register)){
            	List<ZjGrqzgzb> insertWork=new ArrayList<ZjGrqzgzb>();
	        	for(int i=0;i<workList.size();i++){
	        		if(!userService.checkKindOfWork(workList.get(i))){
	        			workList.get(i).setQzbh(userService.getRegisterId(register));
	        			insertWork.add(workList.get(i));
	        		}
	        	}
            	userService.deleteAndSaveWithWork(bip1.getBipId(),bip,list,list1,insertWork);
			}
            //数据库中不存在相同的求职登记表
            if(!userService.checkRegister(register)){
            	for(int i=0;i<workList.size();i++){
	        		workList.get(i).setQzbh(register.getQzbh());
	        	}
            	userService.deleteAndSaveWithRegisterAndWork(bip1.getBipId(), bip,list,list1,register,workList);
            }
			
		}
		//数据库存在相同的用户，且基本数据相同
		if(bip1!=null&&bip1.equals(bip)){
			register.setBipId(bip1.getBipId());
		    if(skills!=null){
		    	for(int i=0;i<skills.length;i++){
					BipSkill bipSkill=new BipSkill();
					bipSkill.setBipSId(GenerateID.getGenerateId());
					bipSkill.setBipId(bip1.getBipId());
					bipSkill.setBipSZyjn(skills[i]);
					bipSkill.setBipSJsdj(skillsGrade[i]);
					bipSkill.setBipSYears(skillsYear[i]);
					list.add(bipSkill);
				}
		    }
		    if(languages!=null){
		    	for(int i=0;i<languages.length;i++){
					BipForeignlanguage bipForeignlanguage=new BipForeignlanguage();
					bipForeignlanguage.setBipFlId(GenerateID.getGenerateId());
					bipForeignlanguage.setBipFlJywy(languages[i]);
					bipForeignlanguage.setBipFlWysm(languageContext[i]);
					bipForeignlanguage.setBipId(bip1.getBipId());
					bipForeignlanguage.setBipFlSlcd(languageGrade[i]);
					list1.add(bipForeignlanguage);
				}
		    }
			//数据库中已存在相同的求职登记表
			if(userService.checkRegister(register)){
				List<ZjGrqzgzb> insertWork=new ArrayList<ZjGrqzgzb>();
	        	for(int i=0;i<workList.size();i++){
	        		if(!userService.checkKindOfWork(workList.get(i))){
	        			workList.get(i).setQzbh(userService.getRegisterId(register));
	        			insertWork.add(workList.get(i));
	        		}
	        	}
	            userService.saveSkillsAndLanguageAndWork(list, list1, workList);;
			}
			//数据库中不存在相同的求职登记表
	        if(!userService.checkRegister(register)){
	        	for(int i=0;i<workList.size();i++){
	        		workList.get(i).setQzbh(register.getQzbh());
	        	}
	            userService.saveSkillsAndLanguageAndRegisterAndWork(list, list1, register, workList);
	        }
		}
		return "redirect:../../successAddUserInfo.jsp";
	}
	@ResponseBody
	@RequestMapping("/service/zj/getBipByCitizenid/{citizenid}")
	public Bip getBipByCitizenid(@PathVariable("citizenid")String citizenid){
		Bip bip=userService.getBipByCitizenid(citizenid);
		if(bip==null){
			return new Bip();
		}
		return bip;
	}
	@RequestMapping("/service/zj/getBipForFreezeAndThaw")
	public String getBipForFreezeAndThaw(@RequestParam("bip_citizenid")String citizenId,Map<String,Object> map){
		Bip bip=userService.getBipByCitizenid(citizenId);
		List<ZjGrqzdjb> list=userService.getRegister(bip.getBipId());
		ZjGrqzdjb returnRegister=list.get(0);
		map.put("bip", bip);
		map.put("register", returnRegister);
		return "service/zj/grqz/qzdjjd_2";
	}
	@RequestMapping("/service/zj/getBipAndFreezeInfo/{citizenid}")
	public String getBipAndFreezeInfo(@PathVariable("citizenid")String citizenId,Map<String,Object>map){
		System.out.println(citizenId);
		Bip bip=userService.getBipByCitizenid(citizenId);
		List<ZjGrqzdjb> list=userService.getRegister(bip.getBipId());
		ZjGrqzdjjdb freezeTable=userService.getFreezeTableByRegisterId(list.get(0).getQzbh());
		map.put("bip", bip);
		map.put("freezeTable",freezeTable);
		return "service/zj/grqz/qzdjjd_3";
	}
	@RequestMapping("/service/zj/FreezeOrThaw")
	public String FreezeOrThaw(@RequestParam("bipid")String bipId,@RequestParam("freezeReason")String reason,@RequestParam("operation")String operation){
		if(operation.equals("1")){
			userService.Thaw(bipId, reason);
		}else{
			userService.Freeze(bipId, reason);
		}
		return "redirect:../../successFrezeeOrThaw.jsp";
	}
}
