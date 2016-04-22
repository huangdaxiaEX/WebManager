package com.cqut.util.jsonUtil;

import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * json工具类，json转换常用的工具方法
 * 
 * @author huangkai
 * 
 */
public class JsonUtil {

	public JsonUtil() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 对象转json String
	 * 
	 * @param o 
	 * @return
	 */
	public static String toJson(Object o){
		return JSONObject.fromObject(o).toString();
	}
	
	/**
	 * 对象转json String
	 * 
	 * @param o 
	 * @param isPrint 是否需要显示到控制台
	 * @return
	 */
	public static String toJson(Object o,boolean isPrint){
		String result = toJson(o);
		if(isPrint) {
			System.out.println(result);
		}
		return result;
	}
	
	/**
	 * list数组转json String
	 * 
	 * @param list
	 * @return
	 */
	public static String toJsonList(List<?> list){
		return JSONArray.fromObject(list).toString();
	}

	/**
	 * List数组转json String
	 * 
	 * @param list
	 * @param isPrint 是否需要显示到控制台
	 * @return
	 */
	public static String toJsonList(List<?> list,boolean isPrint){
		String result = toJsonList(list);
		if(isPrint)
			System.out.println(result);
		return result;
	}
	
	
	@SuppressWarnings("unchecked")
	public static <E>E toBean(String json,Class<E> clazz) {
	    JSONObject jsonObject = JSONObject.fromObject(json);
		E bean = (E)JSONObject.toBean(jsonObject,clazz);
		return bean;
	}
	
	@SuppressWarnings("unchecked")
	public static <E> E[] toBeanList(String json,Class<E> clazz) {
		JSONArray array = JSONArray.fromObject(json);
		E[] beans = (E[])JSONArray.toArray(array,clazz);
		return beans;
	}
	
	/**
	 * Map转json String
	 * 
	 * @param o
	 * @param map
	 * @return
	 */
	public static String toJson(Object o, Map<String,Object> map){
		JSONObject json = JSONObject.fromObject(o);
		json.accumulateAll(map);
		return json.toString();
	}
	
	/**
	 * Map转json String
	 * 
	 * @param o
	 * @param map
	 * @param isPrint 是否需要显示到控制台
	 * @return
	 */
	public static String toJson(Object o, Map<String,Object> map, boolean isPrint){
		String result = toJson(o, map);
		if(isPrint) {
			System.out.println(result);
		}
		return result;
	}
}
