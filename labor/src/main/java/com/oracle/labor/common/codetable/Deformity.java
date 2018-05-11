package com.oracle.labor.common.codetable;

import java.util.LinkedHashMap;
import java.util.Set;

import com.oracle.labor.common.config.IAppConfig;
import com.oracle.labor.common.util.DBCommon;


public class Deformity implements IAppConfig{
	private static LinkedHashMap<String,String> map = new LinkedHashMap<String,String>();
	public boolean init() {
		String sql = "select cd_id,cd_name from cdg_deformity order by cd_index ";
		DBCommon mydb = new DBCommon();
		String[][] data = mydb.select(sql);
		if(data!=null&&data.length>0){
			int length = data.length;
			for(int i=0;i<length;i++){
				map.put(data[i][0], data[i][1]);
			}
		}
		return true;
	}
	
	public static String getNameById(String id){
		if(id!=null){
			Object obj =  map.get(id);
			if(obj!=null){
				return obj.toString();
			}else{
				return null;
			}
		}else{
			return null;
		}
	}
	public static String getOption(){
		return getOption("");
	}
	public static String getOption(String code){
		StringBuffer rt = new StringBuffer("<option></option>");
		String name = "";
		Set<String> set = map.keySet();
		for(String id:set){
			name = map.get(id);

			if(code.equals(id)){
				rt.append("<option value='"+id+"' selected>"+name+"</option>");
			}else{
				rt.append("<option value='"+id+"'>"+name+"</option>");
			}
		}
		return rt.toString();
	}	
}
