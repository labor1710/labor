package com.oracle.labor.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.oracle.labor.common.util.GenerateID;
import com.oracle.labor.dao.BipForeignlanguageMapper;
import com.oracle.labor.dao.BipMapper;
import com.oracle.labor.dao.BipSkillMapper;
import com.oracle.labor.dao.ZjGrqzdjbMapper;
import com.oracle.labor.dao.ZjGrqzdjjdbMapper;
import com.oracle.labor.dao.ZjGrqzgzbMapper;
import com.oracle.labor.po.Bip;
import com.oracle.labor.po.BipExample;
import com.oracle.labor.po.BipForeignlanguage;
import com.oracle.labor.po.BipForeignlanguageExample;
import com.oracle.labor.po.BipSkill;
import com.oracle.labor.po.BipSkillExample;
import com.oracle.labor.po.ZjGrqzdjb;
import com.oracle.labor.po.ZjGrqzdjbExample;
import com.oracle.labor.po.ZjGrqzdjjdb;
import com.oracle.labor.po.ZjGrqzdjjdbExample;
import com.oracle.labor.po.ZjGrqzgzb;
import com.oracle.labor.po.ZjGrqzgzbExample;

@Service
public class UserService {

	@Autowired
	BipMapper bipDao;
	@Autowired
	BipSkillMapper bipSkillDao;
	@Autowired
	BipForeignlanguageMapper bipForeignlanguageDao;
	@Autowired
	ZjGrqzdjbMapper zjGrqzdjbDao;
	@Autowired
	ZjGrqzgzbMapper zjGrqzgzbDao;
	@Autowired
	ZjGrqzdjjdbMapper zjGrqzdjjdbDao;
	@Transactional
	/**
	 * 存取用户及其所拥有的技能、语言、求职工种
	 * @param bip 用户
	 * @param list 技能
	 * @param list1 语言
	 * @param work 求职工种
	 */
	public void saveWithWork(Bip bip,List<BipSkill> list,List<BipForeignlanguage> list1,List<ZjGrqzgzb> work) {
		bipDao.insert(bip);
		if(!list.isEmpty()){
			for(int i=0;i<list.size();i++){
				bipSkillDao.insert(list.get(i));
			}
		}
		if(!list1.isEmpty()){
			for(int i=0;i<list1.size();i++){
				bipForeignlanguageDao.insert(list1.get(i));
			}
		}
		if(!work.isEmpty()){
			for(int i=0;i<work.size();i++){
				zjGrqzgzbDao.insert(work.get(i));
			}
		}
	}
	/**
	 * 存取用户及其所拥有的技能、语言、求职登记表，求职工种
	 * @param bip 用户
	 * @param list 技能
	 * @param list1 语言
	 * @param register 求职登记表
	 * @param kindOfWork 求职工种
	 */
	public void saveWithRegisterAndWork(Bip bip,List<BipSkill> list,List<BipForeignlanguage> list1,ZjGrqzdjb register,List<ZjGrqzgzb> kindOfWork) {
		bipDao.insert(bip);
		zjGrqzdjbDao.insert(register);
		if(!kindOfWork.isEmpty()){
			for(int i=0;i<kindOfWork.size();i++){
				zjGrqzgzbDao.insert(kindOfWork.get(i));
			}
		}
		if(!list.isEmpty()){
			for(int i=0;i<list.size();i++){
				bipSkillDao.insert(list.get(i));
			}
		}
		if(!list1.isEmpty()){
			for(int i=0;i<list1.size();i++){
				bipForeignlanguageDao.insert(list1.get(i));
			}
		}
	}
	/**
	 * 根据身份证号得到用户所有信息
	 * @param citizenid 身份证号
	 * @return 用户
	 */
	@Transactional(readOnly=true)
	public Bip getBipByCitizenid(String citizenid){
		BipExample bipExample=new BipExample();
		bipExample.createCriteria().andBipCitizenidEqualTo(citizenid);
		List<Bip> list=bipDao.selectByExample(bipExample);
		if(list.isEmpty()){
			return null;
		}
		return list.get(0);
	}
	/**
	 * 存取新的用户信息及其所拥有的技能、语言、求职工种，删除旧的用户信息
	 * @param bipId 旧的用户信息的主键
	 * @param bip 新用户
	 * @param list 技能
	 * @param list1 语言
	 * @param work 求职工种
	 */
	@Transactional
	public void deleteAndSaveWithWork(String bipId,Bip bip,List<BipSkill> list,List<BipForeignlanguage> list1,List<ZjGrqzgzb> work){
		//插入新的Bip
		bipDao.insert(bip);
		//将原本的个人所拥有的技能、语言的外键改为新的Bip的个人编号
		BipSkillExample bipSkillExample=new BipSkillExample();
		bipSkillExample.createCriteria().andBipIdEqualTo(bipId);
		BipSkill bipSkill=new BipSkill();
		bipSkill.setBipId(bip.getBipId());
		bipSkillDao.updateByExampleSelective(bipSkill,bipSkillExample);
		BipForeignlanguageExample bipForeignlanguageExample=new BipForeignlanguageExample();
		bipForeignlanguageExample.createCriteria().andBipIdEqualTo(bipId);
		BipForeignlanguage bipForeignlanguage=new BipForeignlanguage();
		bipForeignlanguage.setBipId(bip.getBipId());
		bipForeignlanguageDao.updateByExampleSelective(bipForeignlanguage, bipForeignlanguageExample);
		BipExample bipExample=new BipExample();
		//删除原本的Bip
		bipExample.createCriteria().andBipIdEqualTo(bipId);
		bipDao.deleteByExample(bipExample);
		if(!list.isEmpty()){
			for(int i=0;i<list.size();i++){
				bipSkillDao.insert(list.get(i));
			}
		}
		if(!list1.isEmpty()){
			for(int i=0;i<list1.size();i++){
				bipForeignlanguageDao.insert(list1.get(i));
			}
		}
		if(!work.isEmpty()){
			for(int i=0;i<work.size();i++){
				zjGrqzgzbDao.insert(work.get(i));
			}
		}
	}
	/**
	 * 存取新的用户信息及其所拥有的技能、语言、求职登记表、求职工种，删除旧的用户信息
	 * @param bipId 旧的用户信息的主键
	 * @param bip 新的用户
	 * @param list 技能
	 * @param list1 语言
	 * @param register 求职登记表
	 * @param work 求职工种
	 */
	@Transactional
	public void deleteAndSaveWithRegisterAndWork(String bipId,Bip bip,List<BipSkill> list,List<BipForeignlanguage> list1,ZjGrqzdjb register,List<ZjGrqzgzb> work){
		//插入新的Bip
		bipDao.insert(bip);
		//将原本的个人所拥有的技能、语言、求职登记表的外键改为新的Bip的个人编号
		BipSkillExample bipSkillExample=new BipSkillExample();
		bipSkillExample.createCriteria().andBipIdEqualTo(bipId);
		BipSkill bipSkill=new BipSkill();
		bipSkill.setBipId(bip.getBipId());
		bipSkillDao.updateByExampleSelective(bipSkill,bipSkillExample);
		BipForeignlanguageExample bipForeignlanguageExample=new BipForeignlanguageExample();
		bipForeignlanguageExample.createCriteria().andBipIdEqualTo(bipId);
		BipForeignlanguage bipForeignlanguage=new BipForeignlanguage();
		bipForeignlanguage.setBipId(bip.getBipId());
		bipForeignlanguageDao.updateByExampleSelective(bipForeignlanguage, bipForeignlanguageExample);
		ZjGrqzdjbExample zjGrqzdjbExample=new ZjGrqzdjbExample();
		zjGrqzdjbExample.createCriteria().andBipIdEqualTo(bipId);
		ZjGrqzdjb zjGrqzdjb=new ZjGrqzdjb();
		zjGrqzdjb.setBipId(bip.getBipId());
		zjGrqzdjbDao.updateByExampleSelective(zjGrqzdjb, zjGrqzdjbExample);
		//删除原本的Bip
		BipExample bipExample=new BipExample();
		bipExample.createCriteria().andBipIdEqualTo(bipId);
		bipDao.deleteByExample(bipExample);
		if(!list.isEmpty()){
			for(int i=0;i<list.size();i++){
				bipSkillDao.insert(list.get(i));
			}
		}
		if(!list1.isEmpty()){
			for(int i=0;i<list1.size();i++){
				bipForeignlanguageDao.insert(list1.get(i));
			}
		}
		zjGrqzdjbDao.insert(register);
		if(!work.isEmpty()){
			for(int i=0;i<work.size();i++){
				zjGrqzgzbDao.insert(work.get(i));
			}
		}
	}
	/**
	 * 存取用户的技能、语言、求职登记表、求职工种信息
	 * @param list 技能
	 * @param list1 语言
	 * @param register 求职登记表
	 * @param work 求职工种
	 */
	@Transactional
	public void saveSkillsAndLanguageAndRegisterAndWork(List<BipSkill> list,List<BipForeignlanguage> list1,ZjGrqzdjb register,List<ZjGrqzgzb> work){
		if(!list.isEmpty()){
			for(int i=0;i<list.size();i++){
				bipSkillDao.insert(list.get(i));
			}
		}
		if(!list1.isEmpty()){
			for(int i=0;i<list.size();i++){
				bipForeignlanguageDao.insert(list1.get(i));
			}
		}
		zjGrqzdjbDao.insert(register);
		if(!work.isEmpty()){
			for(int i=0;i<work.size();i++){
				zjGrqzgzbDao.insert(work.get(i));
			}
		}
	}
	/**
	 * 存取用户的技能、语言、求职工种信息
	 * @param list 技能
	 * @param list1 语言
	 * @param work 求职工种
	 */
	@Transactional
	public void saveSkillsAndLanguageAndWork(List<BipSkill> list,List<BipForeignlanguage> list1,List<ZjGrqzgzb> work){
		if(!list.isEmpty()){
			for(int i=0;i<list.size();i++){
				bipSkillDao.insert(list.get(i));
			}
		}
		if(!list1.isEmpty()){
			for(int i=0;i<list.size();i++){
				bipForeignlanguageDao.insert(list1.get(i));
			}
		}
		if(!work.isEmpty()){
			for(int i=0;i<work.size();i++){
				zjGrqzgzbDao.insert(work.get(i));
			}
		}
	}
	/**
	 * 检查数据库中是否存在此求职登记表
	 * @param register 求职登记表
	 * @return 布尔值，表示是否存在此求职登记表
	 */
	@Transactional(readOnly=true)
	public boolean checkRegister(ZjGrqzdjb register){
		ZjGrqzdjbExample zjGrqzdjbExample=new ZjGrqzdjbExample();
		zjGrqzdjbExample.createCriteria().andBipIdEqualTo(register.getBipId()).andDwxxEqualTo(register.getDwxx()).andDwjjlxEqualTo(register.getDwjjlx()).andDwhyEqualTo(register.getDwhy()).andGzdqEqualTo(register.getGzdq()).andSfcjpxEqualTo(register.getSfcjpx()).andSfjsdxEqualTo(register.getSfjsdx()).andSfjszyzdEqualTo(register.getSfjszyzd());
		List<ZjGrqzdjb> list=zjGrqzdjbDao.selectByExample(zjGrqzdjbExample);
		if(list.isEmpty()){
			return false;
		}
		return true;
	}
	/**
	 * 得到求职登记表的注册编号
	 * @param register 求职登记表
	 * @return 求职登记表的注册编号
	 */
	@Transactional(readOnly=true)
	public String getRegisterId(ZjGrqzdjb register){
		ZjGrqzdjbExample zjGrqzdjbExample=new ZjGrqzdjbExample();
		zjGrqzdjbExample.createCriteria().andBipIdEqualTo(register.getBipId()).andDwxxEqualTo(register.getDwxx()).andDwjjlxEqualTo(register.getDwjjlx()).andDwhyEqualTo(register.getDwhy()).andGzdqEqualTo(register.getGzdq()).andSfcjpxEqualTo(register.getSfcjpx()).andSfjsdxEqualTo(register.getSfjsdx()).andSfjszyzdEqualTo(register.getSfjszyzd());
		List<ZjGrqzdjb> list=zjGrqzdjbDao.selectByExample(zjGrqzdjbExample);
		return list.get(0).getQzbh();
	}
	/**
	 * 检查数据库中是否存在该求职工种
	 * @param kindOfWork 求职工种
	 * @return 布尔值，表示是否存在该求职工种
	 */
	@Transactional(readOnly=true)
	public boolean checkKindOfWork(ZjGrqzgzb kindOfWork){
		ZjGrqzgzbExample zjGrqzgzbExample=new ZjGrqzgzbExample();
		zjGrqzgzbExample.createCriteria().andGzEqualTo(kindOfWork.getGz()).andYgxsEqualTo(kindOfWork.getYgxs()).andZdyxEqualTo(kindOfWork.getZdyx()).andZgyxEqualTo(kindOfWork.getZgyx());
		List<ZjGrqzgzb> list=zjGrqzgzbDao.selectByExample(zjGrqzgzbExample);
		if(list.isEmpty()){
			return false;
		}
		return true;
	}
	@Transactional(readOnly=true)
	public List<ZjGrqzdjb> getRegister(String bipId){
		ZjGrqzdjbExample example=new ZjGrqzdjbExample();
		example.createCriteria().andBipIdEqualTo(bipId);
		List<ZjGrqzdjb> list=zjGrqzdjbDao.selectByExample(example);
		return list;
	}
	@Transactional(readOnly=true)
	public ZjGrqzdjjdb getFreezeTableByRegisterId(String RegisterId){
		ZjGrqzdjjdbExample example=new ZjGrqzdjjdbExample();
		List<ZjGrqzdjjdb> list=zjGrqzdjjdbDao.selectByExample(example);
		if(list.isEmpty()){
			return null;
		}
		return list.get(0);
	}
	@Transactional
	public void Freeze(String bipId,String reason){
		ZjGrqzdjbExample registerExample=new ZjGrqzdjbExample();
		registerExample.createCriteria().andBipIdEqualTo(bipId);
		ZjGrqzdjb register=new ZjGrqzdjb();
		register.setSfdj("是");
		zjGrqzdjbDao.updateByExampleSelective(register, registerExample);
		List<ZjGrqzdjb> list=zjGrqzdjbDao.selectByExample(registerExample);
		ZjGrqzdjjdb freezeTable=new ZjGrqzdjjdb();
		freezeTable.setQzbh(list.get(0).getQzbh());
		freezeTable.setGrdjjdbh(GenerateID.getGenerateId());
		Calendar c=Calendar.getInstance();
		c.setTime(new Date());
		StringBuffer sb=new StringBuffer();
		sb.append(c.get(Calendar.YEAR)).append(".").append(c.get(Calendar.MONTH)+1).append(".").append(c.get(Calendar.DATE));
		freezeTable.setDojsj(sb.toString());
		freezeTable.setDojyy(reason);
		ZjGrqzdjjdbExample example=new ZjGrqzdjjdbExample();
		example.createCriteria().andQzbhEqualTo(list.get(0).getQzbh());
		if(zjGrqzdjjdbDao.selectByExample(example)!=null){
			zjGrqzdjjdbDao.deleteByExample(example);
		}
		zjGrqzdjjdbDao.insert(freezeTable);
	}
	public void Thaw(String bipId,String reason){
		ZjGrqzdjbExample registerExample=new ZjGrqzdjbExample();
		registerExample.createCriteria().andBipIdEqualTo(bipId);
		ZjGrqzdjb register=new ZjGrqzdjb();
		register.setSfdj("否");
		zjGrqzdjbDao.updateByExampleSelective(register, registerExample);
		List<ZjGrqzdjb> list=zjGrqzdjbDao.selectByExample(registerExample);
		ZjGrqzdjjdb freezeTable=new ZjGrqzdjjdb();
		freezeTable.setGrdjjdbh(GenerateID.getGenerateId());
		Calendar c=Calendar.getInstance();
		c.setTime(new Date());
		StringBuffer sb=new StringBuffer();
		sb.append(c.get(Calendar.YEAR)).append(".").append(c.get(Calendar.MONTH)+1).append(".").append(c.get(Calendar.DATE));
		freezeTable.setDojsj(sb.toString());
		freezeTable.setDojyy(reason);
		ZjGrqzdjjdbExample freezeTableExample=new ZjGrqzdjjdbExample();
		freezeTableExample.createCriteria().andQzbhEqualTo(list.get(0).getQzbh());
		zjGrqzdjjdbDao.updateByExampleSelective(freezeTable, freezeTableExample);
	}
}
