package com.cqut.service.joinInfoService.customInterface;

import java.util.*;
import java.util.Map.Entry;

import com.cqut.entity.joinInfo.JoinInfo;

/**
 * Service方法接口
 * 
 * @author zzy
 * 
 */
public interface IJoinInfoService {

	//select
	public JoinInfo getByID(String ID);
	public List<JoinInfo> getByCondition(String condition);
	public int getCountByCondition(String condition);
	public Map<String,Object> findByID(String[] properties, String id);
	public List<Map<String,Object>> findByCondition(String[] properties, String condition);
	
	//update
	public int updateByID(JoinInfo joinInfo, String ID);
	public int updateByCondition(JoinInfo joinInfo, String condition);
	public int updatePropByID(Set<Entry<String, Object>> prop, String ID);
	public int updatePropByCondition(Set<Entry<String, Object>> prop, String condition);
	
	//delete
	public int deleteByID(String ID);
	public int deleteByCondition(String condition);
	public int deleteJoinInfoByIDs(String[] IDs);
	
	//save
	public int save(JoinInfo joinInfo);
	public int saveJoinInfos(JoinInfo[] joinInfos);
}