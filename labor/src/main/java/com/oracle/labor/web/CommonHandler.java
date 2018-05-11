package com.oracle.labor.web;

import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.oracle.labor.common.codetable.ComputergradeOperation;
import com.oracle.labor.common.codetable.Deformity;
import com.oracle.labor.common.codetable.EducationallevelOperation;
import com.oracle.labor.common.codetable.EmploytypeOperation;
import com.oracle.labor.common.codetable.HealthstateOperation;
import com.oracle.labor.common.codetable.IndustryOperation;
import com.oracle.labor.common.codetable.LanguageOperation;
import com.oracle.labor.common.codetable.MarriageOperation;
import com.oracle.labor.common.codetable.NationOperation;
import com.oracle.labor.common.codetable.OrgtypeOperation;
import com.oracle.labor.common.codetable.PersonneltypeOperation;
import com.oracle.labor.common.codetable.PoliticsaspectOperation;
import com.oracle.labor.common.codetable.ProficiencyOperation;
import com.oracle.labor.common.codetable.QualificationOperation;
import com.oracle.labor.common.codetable.RegioncodeOperation;
import com.oracle.labor.common.codetable.RegtypeOperation;
import com.oracle.labor.common.codetable.RprtypeOperation;
import com.oracle.labor.common.codetable.SexOperation;
import com.oracle.labor.common.codetable.SpecialtyOperation;

@Controller
public class CommonHandler {
	//返回文本;
	@ResponseBody
	@RequestMapping(value="/service/language",produces="text/html;charset=UTF-8")
	public String getLanguage(String val) {
		String result=LanguageOperation.getOption(val);
		System.out.println(result);
		return result;
	}
	//返回民族
	@ResponseBody
	@RequestMapping(value="/service/zj/nation",produces="text/html;charset=utf-8")
	public String getNation(@RequestParam("code")String code){
		String result=NationOperation.getOption(code);
		result=result.replaceFirst("<option></option>","");
		return result;
	}
	@ResponseBody
	@RequestMapping(value="/service/zj/politicsAspect",produces="text/html;charset=utf-8")
	public String getPoliticsAspect(@RequestParam("code")String code){
		String result=PoliticsaspectOperation.getOption(code);
		result=result.replaceFirst("<option></option>","");
		return result;
	}
	@ResponseBody
	@RequestMapping(value="/service/zj/marriage",produces="text/html;charset=utf-8")
	public String getMarriage(@RequestParam("code")String code){
		String result=MarriageOperation.getOption(code);
		result=result.replaceFirst("<option></option>","");
		return result;
	}
	@ResponseBody
	@RequestMapping(value="/service/zj/rprtype",produces="text/html;charset=utf-8")
	public String getRprtype(@RequestParam("code")String code){
		String result=RprtypeOperation.getOption(code);
		result=result.replaceFirst("<option></option>","");
		return result;
		
	}
	@ResponseBody
	@RequestMapping(value="/service/zj/personnelType",produces="text/html;charset=utf-8")
	public String getPersonnelType(@RequestParam("code")String code){
		String result=PersonneltypeOperation.getOption(code);
		result=result.replaceFirst("<option></option>","");
		return result;
	}
	@ResponseBody
	@RequestMapping(value="/service/zj/healthState",produces="text/html;charset=utf-8")
	public String getHealthState(@RequestParam("code")String code){
		String result=HealthstateOperation.getOption(code);
		result=result.replaceFirst("<option></option>","");
		return result;
	}
	@ResponseBody
	@RequestMapping(value="/service/zj/deformity",produces="text/html;charset=utf-8")
	public String getDeformity(@RequestParam("code")String code){
		String result=Deformity.getOption(code);
		result=result.replaceFirst("<option></option>","");
		return result;
	}
	@ResponseBody
	@RequestMapping(value="/service/zj/getProvince",produces="text/html;charset=utf-8")
	public String getProvince(){
		String result=RegioncodeOperation.getProvince();
		result=result.replaceFirst("<option></option>","");
		return result;
	}
	@ResponseBody
	@RequestMapping(value="/service/zj/getProvince1",produces="text/html;charset=utf-8")
	public String getProvince1(@RequestParam("code")String code){
		String result=RegioncodeOperation.getSelectedRegion(code, "province");
		result=result.replaceFirst("<option></option>","");
		return result;
	}
	@ResponseBody
	@RequestMapping(value="/service/zj/getCity",produces="text/html;charset=utf-8")
	public String getCity(@RequestParam("code")String code){
		String result=RegioncodeOperation.getSelectedRegion(code, "city");
		result=result.replaceFirst("<option></option>","");
		return result;
	}
	@ResponseBody
	@RequestMapping(value="/service/zj/getVillage",produces="text/html;charset=utf-8")
	public String getVillage(@RequestParam("code")String code){
		String result=RegioncodeOperation.getSelectedRegion(code, "village");
		result=result.replaceFirst("<option></option>","");
		return result;
	}
	@ResponseBody
	@RequestMapping(value="/service/zj/getEducationalLevel",produces="text/html;charset=utf-8")
	public String getEducationalLevel(@RequestParam("code")String code){
		String result=EducationallevelOperation.getOption(code);
		result=result.replaceFirst("<option></option>","");
		return result;
	}
	@ResponseBody
	@RequestMapping(value="/common/getGwmc",produces="text/html;charset=utf-8")
	public String getGwmc(){
		String result=SpecialtyOperation.getGwmc();
		result=result.replaceFirst("<option></option>","");
		return result;
	}
	@ResponseBody
	@RequestMapping(value="/common/getGz1",produces="text/html;charset=utf-8")
	public String getGz1(@RequestParam("code")String code){
		String result=SpecialtyOperation.getSelectedGz(code, "gz1");
		result=result.replaceFirst("<option></option>","");
		return result;
	}
	@ResponseBody
	@RequestMapping(value="/common/getGz2",produces="text/html;charset=utf-8")
	public String getGz2(@RequestParam("code")String code){
		String result=SpecialtyOperation.getSelectedGz(code, "gz2");
		result=result.replaceFirst("<option></option>","");
		return result;
	}
	@ResponseBody
	@RequestMapping(value="/common/getGz3",produces="text/html;charset=utf-8")
	public String getGz3(@RequestParam("code")String code){
		String result=SpecialtyOperation.getSelectedGz(code, "gz3");
		result=result.replaceFirst("<option></option>","");
		if(result.equals(new String())){
			return null;
		}
		return result;
	}
	@ResponseBody
	@RequestMapping(value="/service/zj/getQualification",produces="text/html;charset=utf-8")
	public String getQualification(){
		String result=QualificationOperation.getOption();
		result=result.replaceFirst("<option></option>","");
		return result;
	}
	@ResponseBody
	@RequestMapping(value="/service/zj/getLanguage",produces="text/html;charset=utf-8")
	public String getLanguage(){
		String result=LanguageOperation.getOption();
		result=result.replaceFirst("<option></option>","");
		return result;
	}
	@ResponseBody
	@RequestMapping(value="/service/zj/getProficiency",produces="text/html;charset=utf-8")
	public String getProficiency(@RequestParam("code")String code){
		String result=ProficiencyOperation.getOption(code);
		result=result.replaceFirst("<option></option>","");
		return result;
	}
	@ResponseBody
	@RequestMapping(value="/service/zj/getComputergrade",produces="text/html;charset=utf-8")
	public String getComputergrade(@RequestParam("code")String code){
		String result=ComputergradeOperation.getOption(code);
		result=result.replaceFirst("<option></option>","");
		return result;
	}
	@ResponseBody
	@RequestMapping(value="/service/zj/getOrgtype",produces="text/html;charset=utf-8")
	public String getOrgtype(){
		String result=OrgtypeOperation.getOption();
		result=result.replaceFirst("<option></option>","");
		return result;
	}
	@ResponseBody
	@RequestMapping(value="/service/zj/getIndustry",produces="text/html;charset=utf-8")
	public String getIndustry(){
		String result=IndustryOperation.getOption();
		result=result.replaceFirst("<option></option>","");
		return result;
	}
	@ResponseBody
	@RequestMapping(value="/service/zj/getRegtype",produces="text/html;charset=utf-8")
	public String getRegtype(){
		String result=RegtypeOperation.getOption();
		result=result.replaceFirst("<option></option>","");
		return result;
	}
	@ResponseBody
	@RequestMapping(value="/service/zj/getEmploytype",produces="text/html;charset=utf-8")
	public String getEmploytype(){
		String result=EmploytypeOperation.getOption();
		result=result.replaceFirst("<option></option>","");
		return result;
	}
	@ResponseBody
	@RequestMapping(value="/service/zj/getSex",produces="text/html;charset=utf-8")
	public String getSex(@RequestParam("code")String code){
		String sex=code.substring(16,17);
		int sexNumber=Integer.parseInt(sex);
		if(sexNumber%2==0){
			return "<option value='2'>女</option>";
		}
		return "<option value='1'>男</option>";
	}
	@ResponseBody
	@RequestMapping(value="/service/zj/getSexById",produces="text/html;charset=utf-8")
	public String getSexById(@RequestParam("code")String code){
		String result=SexOperation.getOption(code);
		result=result.replaceFirst("<option></option>","");
		return result;
	}
	@ResponseBody
	@RequestMapping(value="/service/zj/getAge",produces="text/html;charset=utf-8")
	public String getAge(@RequestParam("code")String code){
		String year=code.substring(6,10);
		int yearNumber=Integer.parseInt(year);
		Calendar c=Calendar.getInstance();
		c.setTime(new Date(System.currentTimeMillis()));
		int age=c.get(Calendar.YEAR)-yearNumber;
		return String.valueOf(age);
	}
}
