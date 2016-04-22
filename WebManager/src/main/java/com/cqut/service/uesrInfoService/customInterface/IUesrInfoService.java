package com.cqut.service.uesrInfoService.customInterface;

import java.util.*;
import java.util.Map.Entry;

import com.cqut.entity.uesrInfo.UesrInfo;

/**
 * Service方法接口
 * 
 * @author zzy
 * 
 */
public interface IUesrInfoService {

	//select
	public UesrInfo getByID(String ID);
	public List<UesrInfo> getByCondition(String condition);
	public int getCountByCondition(String condition);
	public Map<String,Object> findByID(String[] properties, String id);
	public List<Map<String,Object>> findByCondition(String[] properties, String condition);
	
	//update
	public int updateByID(UesrInfo uesrInfo, String ID);
	public int updateByCondition(UesrInfo uesrInfo, String condition);
	public int updatePropByID(Set<Entry<String, Object>> prop, String ID);
	public int updatePropByCondition(Set<Entry<String, Object>> prop, String condition);
	
	//delete
	public int deleteByID(String ID);
	public int deleteByCondition(String condition);
	public int deleteUesrInfoByIDs(String[] IDs);
	
	//save
	public int save(UesrInfo uesrInfo);
	public int saveUesrInfos(UesrInfo[] uesrInfos);
}