package com.cqut.dao.manageDao;

import java.util.*;
import java.util.Map.Entry;
import org.apache.ibatis.annotations.Param;
import com.cqut.entity.manage.Manage;

/**
 * Dao
 * 
 * @author zzy
 * 
 */
public interface ManageDao {
	//select
	public Manage getByID(@Param("ID")String ID);
	public List<Manage> getByCondition(@Param("condition")String condition);
	public int getCountByCondition(@Param("condition")String condition);
	public Map<String,Object> findByID(@Param("properties")String[] properties, @Param("ID")String id);
	public List<Map<String,Object>> findByCondition(@Param("properties")String[] properties, @Param("condition")String condition);
	
	//update
	public int updateByID(@Param("entity")Manage manage, @Param("ID")String ID);
	public int updateByCondition(@Param("entity")Manage manage, @Param("condition")String condition);
	public int updatePropByID(@Param("prop")Set<Entry<String, Object>> prop, @Param("ID")String ID);
	public int updatePropByCondition(@Param("prop")Set<Entry<String, Object>> prop, @Param("condition")String condition);
	
	//delete
	public int deleteByID(@Param("ID")String ID);
	public int deleteByCondition(@Param("condition")String condition);
	public int deleteManageByIDs(@Param("IDs")String[] IDs);
	
	//save
	public int save(Manage manage);
	public int saveManages(@Param("entities")Manage[] manages);
}
