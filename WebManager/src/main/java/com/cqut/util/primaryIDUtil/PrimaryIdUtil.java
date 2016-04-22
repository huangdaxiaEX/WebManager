package com.cqut.util.primaryIDUtil;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * 主键生成工具类，定义主键常用的工具方法
 * 
 * @author zzy
 * 
 */
public class PrimaryIdUtil {
	private static final SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmssSSS");
	
	public PrimaryIdUtil() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 把当前时间 + 毫秒当作主键返回
	 * 
	 * @return
	 */
	public static synchronized String createPrimaryId(){
		return format.format(Calendar.getInstance().getTime());
	}
}
