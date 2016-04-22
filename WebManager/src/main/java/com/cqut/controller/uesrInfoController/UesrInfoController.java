package com.cqut.controller.uesrInfoController;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cqut.service.uesrInfoService.customInterface.IUesrInfoService;

/**
 * Controller
 * 
 * @author zzy
 * 
 */
@Controller
@RequestMapping("/uesrInfoController")
public class UesrInfoController {

	@Resource(name = "uesrInfoServiceImpl")
	IUesrInfoService uesrInfoService;

	/**
	 * 方法模板 请修改完成后 删除此方法
	 */
//  @RequestMapping(value = "/methodTemplate")
//	@ResponseBody
//	public void methodTemplate(String tagName){
//		System.out.println(uesrInfoService.getByID(tagName).toString());
//	}

}