package com.cqut.util.stringUtil;

/**
 * String工具类，定义String常用的工具方法
 * 
 * @author huangkai
 * 
 */
public class StringUtil {
	
	/**
	 * 将字符串首字目转换成大写
	 * 
	 * @param s	待转字符串
	 * @return
	 */
	public static String upcaseFirstChar(String s){
		if (s == null || s.equals("")) {
			return "";
		}
		
		StringBuilder sb = new StringBuilder(s);
		sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
		return sb.toString();
	}
	
	/**
	 * 将字符串首字目转换成小写
	 * 
	 * @param s 待转字符串
	 * @return
	 */
	public static String lowcaseFirstChar(String s){
		if (s == null || s.equals("")) {
			return "";
		}
		
		StringBuilder sb = new StringBuilder(s);
		sb.setCharAt(0, Character.toLowerCase(sb.charAt(0)));
		return sb.toString();
	}
	
	/**
	 * 将字符串全部字符转换成大写
	 * 
	 * @param s 待转字符串
	 * @return
	 */
	public static String upcaseAll(String s){
		if (s == null || s.equals("")) {
			return "";
		}
		StringBuffer sb = new StringBuffer();
		char[] c = s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (c[i] >= 97) {
				sb.append((c[i] + "").toUpperCase());
			} else {
				sb.append(c[i]);
			}
		}
		return sb.toString();
	}
	
	/**
	 * 将字符串全部字符转换成小写
	 * 
	 * @param s 待转字符串
	 * @return
	 */
	public static String lowcaseAll(String s){
		if (s == null || s.equals("")) {
			return "";
		}
		StringBuffer sb = new StringBuffer();
		char[] c = s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (c[i] < 97) {
				sb.append((c[i] + "").toLowerCase());
			} else {
				sb.append(c[i]);
			}
		}
		return sb.toString();
	}

	 /**
     * 返回文件的后缀名, 如果文件没有后缀名则返回 "".
     * 
     * @param fileName 文件名
     * @return
     */
    public static String getFileExtension(String fileName) {
        if(fileName == null || fileName.length() == 0) {
            return "";
        }
        int index = fileName.indexOf(".");
        return index < 0 ? "" : fileName.substring(index + 1);
    }
}
