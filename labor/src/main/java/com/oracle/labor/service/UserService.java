package com.oracle.labor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.oracle.labor.dao.BipForeignlanguageMapper;
import com.oracle.labor.dao.BipMapper;
import com.oracle.labor.dao.BipSkillMapper;
import com.oracle.labor.dao.LdlscUserMapper;
import com.oracle.labor.po.Bip;
import com.oracle.labor.po.BipExample;
import com.oracle.labor.po.BipForeignlanguage;
import com.oracle.labor.po.BipSkill;
import com.oracle.labor.po.LdlscUser;
import com.oracle.labor.po.LdlscUserExample;

@Service
public class UserService {

	@Autowired
	LdlscUserMapper userDao;
	@Autowired
	BipMapper bipDao;
	@Autowired
	BipSkillMapper bipSkillDao;
	@Transactional
	public void save(Bip bip,List<BipSkill> list) {
		bipDao.insert(bip);
		if(!list.isEmpty()){
			for(int i=0;i<list.size();i++){
				bipSkillDao.insert(list.get(i));
			}
		}
	}
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
	@Transactional
	public void deleteAndSave(String citizenid,Bip bip,List<BipSkill> list){
		BipExample bipExample=new BipExample();
		bipExample.createCriteria().andBipCitizenidEqualTo(citizenid);
		bipDao.deleteByExample(bipExample);
		bipDao.insert(bip);
		if(!list.isEmpty()){
			for(int i=0;i<list.size();i++){
				bipSkillDao.insert(list.get(i));
			}
		}
	}
	public void saveSkills(List<BipSkill> list){
		if(!list.isEmpty()){
			for(int i=0;i<list.size();i++){
				bipSkillDao.insert(list.get(i));
			}
		}
	}
}
