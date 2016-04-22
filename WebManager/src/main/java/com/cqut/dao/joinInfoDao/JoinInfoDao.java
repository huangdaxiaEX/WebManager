package com.cqut.dao.joinInfoDao;

import java.util.*;
import java.util.Map.Entry;
import org.apache.ibatis.annotations.Param;
import com.cqut.entity.joinInfo.JoinInfo;

/**
 * Dao
 * 
 * @author zzy
 * 
 */
public interface JoinInfoDao {
	//select
	public JoinInfo getByID(@Param("ID")String ID);
	public List<JoinInfo> getByCondition(@Param("condition")String condition);
	public int getCountByCondition(@Param("condition")String condition);
	public Map<String,Object> findByID(@Param("properties")String[] properties, @Param("ID")String id);
	public List<Map<String,Object>> findByCondition(@Param("properties")String[] properties, @Param("condition")String condition);
	
	//update
	public int updateByID(@Param("entity")JoinInfo joinInfo, @Param("ID")String ID);
	public int updateByCondition(@Param("entity")JoinInfo joinInfo, @Param("condition")String condition);
	public int updatePropByID(@Param("prop")Set<Entry<String, Object>> prop, @Param("ID")String ID);
	public int updatePropByCondition(@Param("prop")Set<Entry<String, Object>> prop, @Param("condition")String condition);
	
	//delete
	public int deleteByID(@Param("ID")String ID);
	public int deleteByCondition(@Param("condition")String condition);
	public int deleteJoinInfoByIDs(@Param("IDs")String[] IDs);
	
	//save
	public int save(JoinInfo joinInfo);
	public int saveJoinInfos(@Param("entities")JoinInfo[] joinInfos);
}
