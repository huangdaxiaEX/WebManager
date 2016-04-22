package com.cqut.dao.crowdFundingDao;

import java.util.*;
import java.util.Map.Entry;
import org.apache.ibatis.annotations.Param;
import com.cqut.entity.crowdFunding.CrowdFunding;

/**
 * Dao
 * 
 * @author zzy
 * 
 */
public interface CrowdFundingDao {
	//select
	public CrowdFunding getByID(@Param("ID")String ID);
	public List<CrowdFunding> getByCondition(@Param("condition")String condition);
	public int getCountByCondition(@Param("condition")String condition);
	public Map<String,Object> findByID(@Param("properties")String[] properties, @Param("ID")String id);
	public List<Map<String,Object>> findByCondition(@Param("properties")String[] properties, @Param("condition")String condition);
	
	//update
	public int updateByID(@Param("entity")CrowdFunding crowdFunding, @Param("ID")String ID);
	public int updateByCondition(@Param("entity")CrowdFunding crowdFunding, @Param("condition")String condition);
	public int updatePropByID(@Param("prop")Set<Entry<String, Object>> prop, @Param("ID")String ID);
	public int updatePropByCondition(@Param("prop")Set<Entry<String, Object>> prop, @Param("condition")String condition);
	
	//delete
	public int deleteByID(@Param("ID")String ID);
	public int deleteByCondition(@Param("condition")String condition);
	public int deleteCrowdFundingByIDs(@Param("IDs")String[] IDs);
	
	//save
	public int save(CrowdFunding crowdFunding);
	public int saveCrowdFundings(@Param("entities")CrowdFunding[] crowdFundings);
}
