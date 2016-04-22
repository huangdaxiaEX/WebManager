package com.cqut.controller.crowdFundingController;

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
import com.cqut.entity.uesrInfo.UesrInfo;
import com.cqut.service.crowdFundingService.customInterface.ICrowdFundingService;
import com.cqut.service.uesrInfoService.customInterface.IUesrInfoService;
import com.cqut.util.jsonUtil.JsonUtil;

/**
 * Controller
 * 
 * @author zzy
 * 
 */
@Controller
@RequestMapping("/crowdFundingController")
public class CrowdFundingController {

	@Resource(name = "crowdFundingServiceImpl")
	ICrowdFundingService crowdFundingService;

	@Resource(name = "uesrInfoServiceImpl")
	IUesrInfoService uesrInfoService;

	/**
	 * 方法模板 请修改完成后 删除此方法
	 */
	@RequestMapping(value = "/getPublishData")
	@ResponseBody
	public String getPublishData(String userID){
		Data data = new Data();
		List<CrowdFunding> list = crowdFundingService.getByCondition("publisherid = '" + userID + "'");
		if (list.size() > 0) {
			ArrayList<Object> dataList = new ArrayList<>();
			for (int i = 0; i < list.size(); i++) {
				CrowdFunding crowdFunding = list.get(i);
				dataList.add(this.mapData(crowdFunding));
				}
			data.successData();
			data.dataMap.put("data", dataList);
		}
		
		return JsonUtil.toJson(data.dataMap);
	}
	
	@RequestMapping(value = "/getSearchDataByUserName")
	@ResponseBody
	public String getSearchDataByUserName(String keyWord){
		Data data = new Data();
		List<UesrInfo> list = uesrInfoService.getByCondition("username like'%" + keyWord + "%'");
		if (list.size() > 0) {
			ArrayList<Object> dataList = new ArrayList<>();
			for (int i = 0; i < list.size(); i++) {
				UesrInfo info = list.get(i);
				long userid = info.getUserID();
				this.commonSearch("publisherid", userid, dataList);
			}
			data.successData();
			data.dataMap.put("data", dataList);
		}
		
		return JsonUtil.toJson(data.dataMap);
	}
	
	@RequestMapping(value = "/getSearchDataByEntryTitle")
	@ResponseBody
	public String getSearchDataByEntryTitle(String keyWord){
		Data data = new Data();
		List<CrowdFunding> crowdList = crowdFundingService.getByCondition("entrytitle like '%" + keyWord + "%'");
		ArrayList<Object> dataList = new ArrayList<>();
		for (int j = 0; j < crowdList.size(); j++){
			CrowdFunding crowdFunding = crowdList.get(j);
			dataList.add(this.mapData(crowdFunding));
		}
		data.successData();
		data.dataMap.put("data", dataList);

		return JsonUtil.toJson(data.dataMap);
	} 
	
	@RequestMapping(value = "/getSearchDataByEntryContent")
	@ResponseBody
	public String getSearchDataByEntryContent(String keyWord){
		Data data = new Data();
		List<CrowdFunding> crowdList = crowdFundingService.getByCondition("entrycontent like '%" + keyWord + "%'");
		ArrayList<Object> dataList = new ArrayList<>();
		for (int j = 0; j < crowdList.size(); j++){
			CrowdFunding crowdFunding = crowdList.get(j);
			dataList.add(this.mapData(crowdFunding));
		}
		data.successData();
		data.dataMap.put("data", dataList);

		return JsonUtil.toJson(data.dataMap);
	} 
	
	public void commonSearch(String column, Object key, ArrayList<Object> dataList) {
		List<CrowdFunding> crowdList = crowdFundingService.getByCondition(column + " = '" + key + "'");
		for (int j = 0; j < crowdList.size(); j++){
			CrowdFunding crowdFunding = crowdList.get(j);
			dataList.add(this.mapData(crowdFunding));
		}
	}

	@RequestMapping(value = "/getAllData")
	@ResponseBody
	public String getAllData() {
		return getData("");
	}	
	
	public String getData(String condition) {
		Data data = new Data();
		List<CrowdFunding> crowdList = crowdFundingService.getByCondition(condition);
		ArrayList<Object> dataList = new ArrayList<>();
		for (int j = 0; j < crowdList.size(); j++){
			CrowdFunding crowdFunding = crowdList.get(j);
			dataList.add(this.mapData(crowdFunding));
		}
		data.successData();
		data.dataMap.put("data", dataList);

		return JsonUtil.toJson(data.dataMap);
	}
	
	@RequestMapping(value = "/getDataByID")
	@ResponseBody
	public String getDataByID(String entryid) {
		String condition = "entryid = '" + entryid + "'";
		return getData(condition);
	}	
	
	public Map<String, Object> mapData(CrowdFunding crowdFunding) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("title", crowdFunding.getEntryTitle());
		map.put("type", crowdFunding.getEntryType());
		map.put("price", crowdFunding.getEntryPrice());
		map.put("status", crowdFunding.getEntryStatus());
		map.put("price", crowdFunding.getDonePrice());
		map.put("process", crowdFunding.getProcess());
		map.put("publishTime", crowdFunding.getPublishTime());
		map.put("deadTime", crowdFunding.getDeadTime());
		String[] imgArr = crowdFunding.getImage().split(",");
		map.put("simg", imgArr[0]);
		map.put("bimg", imgArr[1]);
		map.put("donePerson", crowdFunding.getDonePerson());
		map.put("totalPerson", crowdFunding.getTotalPerson());
		return map;
	}
	
	@RequestMapping(value = "/addPublish")
	@ResponseBody
	public String addPublish(String entryid) {
		String condition = "entryid = '" + entryid + "'";
		return getData(condition);
	}	
	
}