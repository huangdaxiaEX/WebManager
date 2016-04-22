package com.cqut.dao.baseDao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface BaseSearchDao {
	/**
	 * 查询数据
	 * @param properties 要查询的实体
	 * @param baseEntity 对应 select xx from ‘baseEntity’ where ... 
	 * @param joinEntity 连接表的实体
	 * @param foreignEntity 外键所在的实体
	 * @param foreingKeySql 查询外键的语句
	 * @param condition 查询条件
	 * 
	 * @return 查询的Map结果集
	 */
	public List<Map<String,Object>> search(
			@Param("properties")String[] properties,
			@Param("baseEntity")String baseEntity,
			@Param("joinEntity")String joinEntity,
			@Param("foreignEntity")String[] foreignEntity, 
			@Param("foreingKey")List<String> foreingKeySql,
			@Param("condition")String condition);
	
	/**
	 * 查询数据条数
	 * @param primaryKey 去重过后的key
	 * @param baseEntity 对应 select xx from ‘baseEntity’ where ... 
	 * @param joinEntity 连接表的实体
	 * @param foreignEntity 外键所在的实体
	 * @param foreingKeySql 查询外键的语句
	 * @param condition 查询条件
	 * 
	 * @return 查询数据条数
	 */
	public int getCount(
			@Param("primaryKey")String primaryKey,
			@Param("baseEntity")String baseEntity,
			@Param("joinEntity")String joinEntity,
			@Param("foreignEntity")String[] foreignEntity,
			@Param("foreingKey")List<String> foreingKeySql,
			@Param("condition")String condition);
	
	/**
	 * 查询数据(MySQL)
	 * @param properties 要查询的实体
	 * @param baseEntity 对应 select xx from ‘baseEntity’ where ... 
	 * @param joinEntity 连接表的实体
	 * @param foreignEntity 外键所在的实体
	 * @param foreingKeySql 查询外键的语句
	 * @param condition 查询条件
	 * @param groupField 分组字段
	 * @param orderField 排序字段
	 * @param sortMode 排序规则 
	 * @param startIndex 起始数
	 * @param pageNum 页数
	 * 
	 * @return 查询的Map结果集
	 */
	public List<Map<String,Object>> searchInMySQL(
			@Param("properties")String[] properties, 
			@Param("baseEntity")String baseEntity,
			@Param("joinEntity")String joinEntity,
			@Param("foreignEntity")String[] foreignEntity, 
			@Param("foreingKey")List<String> foreingKeySql,
			@Param("condition")String condition,
			@Param("groupField")String groupField,
			@Param("orderField")String orderField,
			@Param("sortMode")String sortMode, 
			@Param("startIndex")int startIndex,
			@Param("pageNum")int pageNum);
	
	/**
	 * 查询数据(MySQL) 
	 * @param properties 要查询的实体
	 * @param baseEntity 对应 select xx from ‘baseEntity’ where ... 
	 * @param joinEntity 连接表的实体
	 * @param foreignEntity 外键所在的实体
	 * @param foreingKeySql 查询外键的语句
	 * @param condition 查询条件
	 * @param sortMode 排序规则 
	 * @param startIndex 起始数
	 * @param pageNum 页数
	 * 
	 * @return 查询的Map结果集
	 */
	public List<Map<String,Object>> searchInMysqlNoOrder(
			@Param("properties")String[] properties,
			@Param("baseEntity")String baseEntity,
			@Param("joinEntity")String joinEntity,
			@Param("foreignEntity")String[] foreignEntity,
			@Param("foreingKey")List<String> foreingKeySql,
			@Param("condition")String condition,
			@Param("sortMode")String sortMode, 
			@Param("startIndex")int startIndex,
			@Param("pageNum")int pageNum);
	
	/**
	 * 查询数据(Oracle)
	 * @param properties 要查询的实体
	 * @param baseEntity 对应 select xx from ‘baseEntity’ where ... 
	 * @param joinEntity 连接表的实体
	 * @param foreignEntity 外键所在的实体
	 * @param foreingKeySql 查询外键的语句
	 * @param condition 查询条件
	 * @param groupField 分组字段
	 * @param orderField 排序字段
	 * @param sortMode 排序规则 
	 * @param startIndex 起始数
	 * @param pageNum 页数
	 * 
	 * @return 查询的Map结果集
	 */
	public List<Map<String,Object>> searchInOracle(
			@Param("properties")String[] properties,
			@Param("baseEntity")String baseEntity,
			@Param("joinEntity")String joinEntity,
			@Param("foreignEntity")String[] foreignEntity,
			@Param("foreingKey")List<String> foreingKeySql,
			@Param("condition")String condition,
			@Param("groupField")String groupField,
			@Param("orderField")String orderField,
			@Param("sortMode")String sortMode, 
			@Param("startIndex")int startIndex,
			@Param("endIndex")int endIndex);
}
