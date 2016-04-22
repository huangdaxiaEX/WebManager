package com.cqut.dao.uesrInfoDao;

import java.util.*;
import java.util.Map.Entry;
import org.apache.ibatis.annotations.Param;
import com.cqut.entity.uesrInfo.UesrInfo;

/**
 * Dao
 * 
 * @author zzy
 * 
 */
public interface UesrInfoDao {
	//select
	public UesrInfo getByID(@Param("ID")String ID);
	public List<UesrInfo> getByCondition(@Param("condition")String condition);
	public int getCountByCondition(@Param("condition")String condition);
	public Map<String,Object> findByID(@Param("properties")String[] properties, @Param("ID")String id);
	public List<Map<String,Object>> findByCondition(@Param("properties")String[] properties, @Param("condition")String condition);
	
	//update
	public int updateByID(@Param("entity")UesrInfo uesrInfo, @Param("ID")String ID);
	public int updateByCondition(@Param("entity")UesrInfo uesrInfo, @Param("condition")String condition);
	public int updatePropByID(@Param("prop")Set<Entry<String, Object>> prop, @Param("ID")String ID);
	public int updatePropByCondition(@Param("prop")Set<Entry<String, Object>> prop, @Param("condition")String condition);
	
	//delete
	public int deleteByID(@Param("ID")String ID);
	public int deleteByCondition(@Param("condition")String condition);
	public int deleteUesrInfoByIDs(@Param("IDs")String[] IDs);
	
	//save
	public int save(UesrInfo uesrInfo);
	public int saveUesrInfos(@Param("entities")UesrInfo[] uesrInfos);
}
