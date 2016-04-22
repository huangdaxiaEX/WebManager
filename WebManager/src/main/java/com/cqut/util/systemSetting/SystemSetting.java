package com.cqut.util.systemSetting;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.stereotype.Component;

/**
 * 系统参数设定文件读取，现已成功加入Spring豪华注入午餐
 * 
 * @author huangkai
 * 
 */
@Component
public class SystemSetting {
	static Properties systemPram;
	static Map<String,String> propMap = new HashMap<String, String>();
	
	public SystemSetting() {
		// TODO Auto-generated constructor stub
		System.out.println("读取systemSetting配置信息");
		systemPram = new Properties();
		InputStream inStream = SystemSetting.class.getClassLoader()
				.getResourceAsStream("config/systemSetting.properties");
		if(inStream != null) {
			try{
				systemPram.load(inStream);
				Set<Object> Setkeyset = systemPram.keySet(); 
				for (Object object : Setkeyset) { 
					String propValue= systemPram.getProperty(object.toString()).toString(); 
					propMap.put(object.toString(), propValue); 
				} 
			} catch(IOException e){
				System.out.println("读取系统配置出错");
				e.printStackTrace();
			}
		} else {
			System.err.println("系统配置路径出错");
		}
	}
	
	/**
	 * 通过在文件中的key 去获取文件中对应的值
	 * 
	 * @param key 文件key
	 * @return
	 */
	public static String getSystemSettingPram(String key) {
		if(propMap.containsKey(key))
			return propMap.get(key);
		else {
			Object o = systemPram.getProperty(key);
			if(o != null){
				propMap.put(key, o.toString());
				return o.toString();
			} else {
				System.err.println("读取" + key + "出错");
				return null;
			}
		}
	}
}
