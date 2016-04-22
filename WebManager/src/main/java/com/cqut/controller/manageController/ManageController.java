package com.cqut.controller.manageController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cqut.data.Data;
import com.cqut.entity.crowdFunding.CrowdFunding;
import com.cqut.entity.manage.Manage;
import com.cqut.service.manageService.customInterface.IManageService;
import com.cqut.util.jsonUtil.JsonUtil;

/**
 * Controller
 * 
 * @author zzy
 * 
 */
@Controller
@RequestMapping("/manageController")
public class ManageController {

	@Resource(name = "manageServiceImpl")
	IManageService manageService;

	/**
	 * 方法模板 请修改完成后 删除此方法
	 */
	@RequestMapping(value = "/getImageData")
	@ResponseBody
	public String getImageData() {
		Data data = new Data();
		List<Manage> list = manageService.getByCondition("");
		ArrayList<Object> dataList = new ArrayList<>();
		for (int j = 0; j < list.size(); j++){
			Map<String, Object> map = new HashMap<String, Object>();
			Manage manage = list.get(j);
			map.put("image", manage.getImageID());
			dataList.add(map);
		}
		data.successData();
		data.dataMap.put("data", dataList);

		return JsonUtil.toJson(data.dataMap);
	}	

}