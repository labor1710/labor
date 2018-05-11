package com.oracle.labor.web;

import java.util.ArrayList;
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
import com.oracle.labor.po.LdlscUser;
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
	public String save(Bip bip,@RequestParam("bip_s_zyjn")String[] skills,@RequestParam("bip_s_jsdj")String[] skillsGrade,@RequestParam("bip_s_years")String[] skillsYear) {
		List<BipSkill> list=new ArrayList<BipSkill>();
		Bip bip1=userService.getBipByCitizenid(bip.getBipCitizenid());
		String birth=bip.getBipCitizenid().substring(6, 14);
		bip.setBipBirthday(birth);
		String generateID=GenerateID.getGenerateId();
		bip.setBipId(generateID);
		for(int i=0;i<skills.length;i++){
			BipSkill bipSkill=new BipSkill();
			bipSkill.setBipSId(GenerateID.getGenerateId());
			bipSkill.setBipId(generateID);
			bipSkill.setBipSZyjn(skills[i]);
			bipSkill.setBipSJsdj(skillsGrade[i]);
			bipSkill.setBipSYears(skillsYear[i]);
			list.add(bipSkill);
		}
		if(bip1==null||!bip1.equals(bip)){
			userService.save(bip,list);
		}
		if(bip!=null&&!bip1.equals(bip)){
			userService.deleteAndSave(bip.getBipCitizenid(), bip,list);
		}
		if(bip!=null&&bip.equals(bip)){
			userService.saveSkills(list);
		}
		return "redirect:getUsers/1";
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
	
}
