package com.cqut.controller.fileUploadController;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;


@Controller
@RequestMapping("/fileUploadController")
public class FileUploadController {

	public FileUploadController() {
		// TODO Auto-generated constructor stub
	}
	
	@RequestMapping(value = "/upload")
	@ResponseBody
	public String upload(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		MultipartHttpServletRequest mhsr = (MultipartHttpServletRequest) request; //转换请求为文件上传请求
		MultipartFile file = mhsr.getFile("upload");
		System.out.println(file.getContentType());//文件类型
		System.out.println(file.getSize()); // 获取文件大小
		System.out.println(file.getOriginalFilename()); // 获取文件名称
		if (!file.isEmpty()) {// 判断文件是否存在
			String path ="\\webapps\\"+file.getOriginalFilename();
			File localFile = new File(path);
			try {
				file.transferTo(localFile);//保存文件
			} catch (Exception e) {
				e.printStackTrace();
				return "文件上传失败!";
			}
		}
		return "文件上传成功!";
	}
}
