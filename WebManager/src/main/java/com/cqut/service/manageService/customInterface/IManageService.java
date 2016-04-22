package com.cqut.service.manageService.customInterface;

import java.util.*;
import java.util.Map.Entry;

import com.cqut.entity.manage.Manage;

/**
 * Service方法接口
 * 
 * @author zzy
 * 
 */
public interface IManageService {

	//select
	public Manage getByID(String ID);
	public List<Manage> getByCondition(String condition);
	public int getCountByCondition(String condition);
	public Map<String,Object> findByID(String[] properties, String id);
	public List<Map<String,Object>> findByCondition(String[] properties, String condition);
	
	//update
	public int updateByID(Manage manage, String ID);
	public int updateByCondition(Manage manage, String condition);
	public int updatePropByID(Set<Entry<String, Object>> prop, String ID);
	public int updatePropByCondition(Set<Entry<String, Object>> prop, String condition);
	
	//delete
	public int deleteByID(String ID);
	public int deleteByCondition(String condition);
	public int deleteManageByIDs(String[] IDs);
	
	//save
	public int save(Manage manage);
	public int saveManages(Manage[] manages);
}