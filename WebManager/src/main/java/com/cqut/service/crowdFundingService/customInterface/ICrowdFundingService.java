package com.cqut.service.crowdFundingService.customInterface;

import java.util.*;
import java.util.Map.Entry;

import com.cqut.entity.crowdFunding.CrowdFunding;

/**
 * Service方法接口
 * 
 * @author zzy
 * 
 */
public interface ICrowdFundingService {

	//select
	public CrowdFunding getByID(String ID);
	public List<CrowdFunding> getByCondition(String condition);
	public int getCountByCondition(String condition);
	public Map<String,Object> findByID(String[] properties, String id);
	public List<Map<String,Object>> findByCondition(String[] properties, String condition);
	
	//update
	public int updateByID(CrowdFunding crowdFunding, String ID);
	public int updateByCondition(CrowdFunding crowdFunding, String condition);
	public int updatePropByID(Set<Entry<String, Object>> prop, String ID);
	public int updatePropByCondition(Set<Entry<String, Object>> prop, String condition);
	
	//delete
	public int deleteByID(String ID);
	public int deleteByCondition(String condition);
	public int deleteCrowdFundingByIDs(String[] IDs);
	
	//save
	public int save(CrowdFunding crowdFunding);
	public int saveCrowdFundings(CrowdFunding[] crowdFundings);
}