package com.cqut.controller.joinInfoController;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cqut.data.Data;
import com.cqut.entity.crowdFunding.CrowdFunding;
import com.cqut.entity.joinInfo.JoinInfo;
import com.cqut.service.crowdFundingService.customInterface.ICrowdFundingService;
import com.cqut.service.joinInfoService.customInterface.IJoinInfoService;
import com.cqut.util.dateUtil.DateUtil;
import com.cqut.util.jsonUtil.JsonUtil;
import com.cqut.util.primaryIDUtil.PrimaryIdUtil;

/**
 * Controller
 * 
 * @author zzy
 * 
 */
@Controller
@RequestMapping("/joinInfoController")
public class JoinInfoController {

	@Resource(name = "joinInfoServiceImpl")
	IJoinInfoService joinInfoService;
	
	@Resource(name = "crowdFundingServiceImpl")
	ICrowdFundingService crowdFundingService;

	/**
	 * 方法模板 请修改完成后 删除此方法
	 */
	@RequestMapping(value = "/getJoinData")
	@ResponseBody
	public String getJoinData(String userID){
		Data data = new Data();
		List<JoinInfo> list = joinInfoService.getByCondition("personid = '" + userID + "'");
		if (list.size() > 0) {
			ArrayList<Object> dataList = new ArrayList<>();
			for (int i = 0; i < list.size(); i++) {
				JoinInfo info = list.get(i);
				String entryID = String.valueOf(info.getEntryID());
				List<CrowdFunding> entrylist = crowdFundingService.getByCondition("entryid = '" + entryID + "'");
				if (entrylist.size() > 0) {
					Map<String, Object> map = new HashMap<String, Object>();
					CrowdFunding crowdFunding = entrylist.get(0);		
					map.put("title", crowdFunding.getEntryTitle());
					map.put("type", crowdFunding.getEntryType());
					map.put("price", crowdFunding.getEntryPrice());
					map.put("status", crowdFunding.getEntryStatus());
					map.put("price", crowdFunding.getDonePrice());
					map.put("process", crowdFunding.getProcess());
					System.out.println(crowdFunding.getPublishTime());
					map.put("publishTime", crowdFunding.getPublishTime());
					map.put("deadTime", crowdFunding.getDeadTime());
					String[] imgArr = crowdFunding.getImage().split(",");
					map.put("simg", imgArr[0]);
					map.put("bimg", imgArr[1]);
					map.put("donePerson", crowdFunding.getDonePerson());
					map.put("totalPerson", crowdFunding.getTotalPerson());
					dataList.add(map);
				}
			}
			data.successData();
			data.dataMap.put("data", dataList);
		}
		System.out.println(JsonUtil.toJson(data.dataMap));
		return JsonUtil.toJson(data.dataMap);
	}

	@RequestMapping(value = "/newJion")
	@ResponseBody
	public String newJion(long userID, long entryid){
		Data data = new Data();
		JoinInfo joinInfo = new JoinInfo();
		joinInfo.setEntryID(entryid);
		joinInfo.setPersonID(userID);
		joinInfo.setJoinInfoID(BigInteger.valueOf(Long.valueOf(PrimaryIdUtil.createPrimaryId())));
		Date date = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		joinInfo.setJoinTime(Timestamp.valueOf(df.format(date)));
		int code = joinInfoService.save(joinInfo);
		if (code > 0) {
			List<CrowdFunding> crowdList = crowdFundingService.getByCondition("entryid = '" + entryid +"'");
			//update
			for (int j = 0; j < crowdList.size(); j++){
				CrowdFunding crowdFunding = crowdList.get(j);
				long totalPerson = crowdFunding.getTotalPerson();
				long donePerson = crowdFunding.getDonePerson() + 1;
				crowdFunding.setDonePerson(donePerson);
				long totalPrice = Long.parseLong(crowdFunding.getEntryPrice());
				double avg = totalPrice / totalPerson;
				long donePrice = crowdFunding.getDonePrice();
				crowdFunding.setDonePrice((long)(donePrice + avg));
				int code2 = crowdFundingService.updateByCondition(crowdFunding, "");	
				if (code2 > 0) {
					data.successData();
				} else {
					data.failedData();
				}
			}
		} else {
			data.failedData();
		}
		return JsonUtil.toJson(data.dataMap);
	}
}