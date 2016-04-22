package com.cqut.util.pathUtil;

import com.cqut.util.systemSetting.SystemSetting;

/**
 * 文件路径工具类，获取文件路径常用的工具方法
 * 
 * @author huangkai
 * 
 */
public class PathUtil {
	static String imgUploadPath = SystemSetting.getSystemSettingPram("imgUploadPath");
	static String fileUploadPath = SystemSetting.getSystemSettingPram("fileUploadPath");
	static String filePath = SystemSetting.getSystemSettingPram("filePath");
	static String imgPath = SystemSetting.getSystemSettingPram("imgPath");
	static String uploadPath = SystemSetting.getSystemSettingPram("uploadPath");
	
	public PathUtil() {
		// TODO Auto-generated constructor stub
	}
	
	public static String getImgUploadPath(String fileName) {
		return imgUploadPath + fileName;
	}

	public static String getFileUploadPath(String fileName) {
		return fileUploadPath + fileName;
	}

	public static String getDownPath(String fileName) {
		return filePath +"\\" + fileName;
	}

	public static String getImgPath(String imgName){
		return imgPath + imgName;
	}
	
	public static String getuploadPath(){
		return uploadPath;
	}
}
