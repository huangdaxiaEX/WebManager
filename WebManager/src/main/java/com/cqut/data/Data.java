package com.cqut.data;

import java.util.HashMap;
import java.util.Map;

public class Data {
	private String stateCode;
	public Map<String, Object> dataMap = new HashMap<String, Object>();

	private static final String ERRORMSG = "请求错误！";
	private static final String FAILEDMSG = "请求失败！";
	private static final String SUCCESSMSG = "请求成功！";
	
	public String getStateCode() {
		return stateCode;
	}
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	
	public void errorData() {
		dataMap.put("stateCode", "503");
		dataMap.put("msg", ERRORMSG);
	}
	
	public void successData() {
		dataMap.put("stateCode", "200");
		dataMap.put("msg", SUCCESSMSG);
	}
	
	public void failedData() {
		dataMap.put("stateCode", "500");
		dataMap.put("msg", FAILEDMSG);
	}
}
