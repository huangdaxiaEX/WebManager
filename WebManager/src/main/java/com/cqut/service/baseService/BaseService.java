package com.cqut.service.baseService;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cqut.dao.baseDao.BaseSearchDao;

@Service("baseService")
public abstract class BaseService{
	
	@Resource(name = "baseSearchDao")
	BaseSearchDao baseSearchDao;
	
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
			String[] properties,
			String baseEntity,
			String joinEntity,
			String[] foreignEntity, 
			List<String> foreingKeySql,
			String condition){
		return baseSearchDao.search(properties, baseEntity, joinEntity, foreignEntity, foreingKeySql, condition);
	}
	
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
			String primaryKey,
			String baseEntity,
			String joinEntity,
			String[] foreignEntity,
			List<String> foreingKeySql,
			String condition){
		return baseSearchDao.getCount(primaryKey, baseEntity, joinEntity, foreignEntity, foreingKeySql, condition);
	}
	
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
			String[] properties, 
			String baseEntity,
			String joinEntity,
			String[] foreignEntity, 
			List<String> foreingKeySql,
			String condition,
			String groupField,
			String orderField,
			String sortMode, 
			int startIndex,
			int pageNum){
		return baseSearchDao.searchInMySQL(properties, baseEntity, joinEntity, foreignEntity, foreingKeySql, condition, groupField, orderField, sortMode, startIndex, pageNum);
	}
	
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
			String[] properties,
			String baseEntity,
			String joinEntity,
			String[] foreignEntity,
			List<String> foreingKeySql,
			String condition,
			String sortMode, 
			int startIndex,
			int pageNum){
	return baseSearchDao.searchInMysqlNoOrder(properties, baseEntity, joinEntity, foreignEntity, foreingKeySql, condition, sortMode, startIndex, pageNum);	
	}
	
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
			String[] properties,
			String baseEntity,
			String joinEntity,
			String[] foreignEntity,
			List<String> foreingKeySql,
			String condition,
			String groupField,
			String orderField,
			String sortMode, 
			int startIndex,
			int endIndex){
		return baseSearchDao.searchInOracle(properties, baseEntity, joinEntity, foreignEntity, foreingKeySql, condition, groupField, orderField, sortMode, startIndex, endIndex);
	}
}
