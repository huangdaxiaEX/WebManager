package com.cqut.util.dateUtil;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


/**
 * 时间Date工具类，时间Date常用的工具方法
 * 
 * @author huangkai
 * 
 */
public class DateUtil {
	static Calendar calendar = new GregorianCalendar();
	
	public DateUtil() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 返回输入年月日的时间         
	 * 例如输入 2016, 1, 1   
	 * 输出  Fri Jan 01 22:47:24 CST 2016
	 * 
	 * @param year
	 * @param month
	 * @param day
	 * @return
	 */
	public static Date getDate(int year, int month, int date) {
		calendar.set(year, month - 1, date);
		return calendar.getTime();
	}
	
	/**
	 * 返回输入年月日时分秒的时间 
	 * 例如输入 2016, 1, 1,21,1,1 
	 * 输出 Fri Jan 01 21:01:01 CST 2016
	 * 
	 * @param year
	 * @param month
	 * @param day
	 * @param hourOfDay
	 * @param minute
	 * @param second
	 * @return
	 */
	public static Date getDate(int year, int month, int date, int hourOfDay, int minute, int second) {
		calendar.set(year, month - 1, date, hourOfDay, minute, second);
		return calendar.getTime();
	}
}
