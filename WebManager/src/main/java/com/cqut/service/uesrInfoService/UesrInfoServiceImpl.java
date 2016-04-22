package com.cqut.service.uesrInfoService;

import org.springframework.stereotype.Service;
import java.util.*;
import java.util.Map.Entry;
import javax.annotation.Resource;

import com.cqut.service.uesrInfoService.customInterface.IUesrInfoService;
import com.cqut.dao.uesrInfoDao.UesrInfoDao;
import com.cqut.entity.uesrInfo.UesrInfo;
import com.cqut.service.baseService.BaseService;

/**
 * Service
 * 
 * @author zzy
 * 
 */
@Service
public class UesrInfoServiceImpl extends BaseService implements IUesrInfoService{
	
	@Resource(name="uesrInfoDao")
	UesrInfoDao uesrInfoDao ;

	//select
	@Override
	public UesrInfo getByID(String ID){
		// TODO Auto-generated method stub
		return uesrInfoDao.getByID(ID);
	}
	
	@Override
	public List<UesrInfo> getByCondition(String condition){
		// TODO Auto-generated method stub
		return uesrInfoDao.getByCondition(condition);
	}
	
	@Override
	public int getCountByCondition(String condition){
		// TODO Auto-generated method stub
		return uesrInfoDao.getCountByCondition(condition);
	}
	
	@Override
	public Map<String,Object> findByID(String[] properties, String id){
		// TODO Auto-generated method stub
		return uesrInfoDao.findByID(properties, id);
	}
	
	@Override
	public List<Map<String,Object>> findByCondition(String[] properties, String condition){
		// TODO Auto-generated method stub
		return uesrInfoDao.findByCondition(properties, condition);
	}
	
	//update
	@Override
	public int updateByID(UesrInfo uesrInfo, String ID){
		// TODO Auto-generated method stub
		return uesrInfoDao.updateByID(uesrInfo, ID);
	}
	
	@Override
	public int updateByCondition(UesrInfo uesrInfo, String condition){
		// TODO Auto-generated method stub
		return uesrInfoDao.updateByCondition(uesrInfo, condition);
	}
	
	@Override
	public int updatePropByID(Set<Entry<String, Object>> prop, String ID){
		// TODO Auto-generated method stub
		return uesrInfoDao.updatePropByID(prop, ID);
	}
	
	@Override
	public int updatePropByCondition(Set<Entry<String, Object>> prop, String condition){
		// TODO Auto-generated method stub
		return uesrInfoDao.updatePropByCondition(prop, condition);
	}
	
	//delete
	@Override
	public int deleteByID(String ID){
		// TODO Auto-generated method stub
		return uesrInfoDao.deleteByID(ID);
	}
	
	@Override
	public int deleteByCondition(String condition){
		// TODO Auto-generated method stub
		return uesrInfoDao.deleteByCondition(condition);
	}
	
	@Override
	public int deleteUesrInfoByIDs(String[] IDs){
		// TODO Auto-generated method stub
		return uesrInfoDao.deleteUesrInfoByIDs(IDs);
	}
	
	//save
	@Override
	public int save(UesrInfo uesrInfo){
		// TODO Auto-generated method stub
		return uesrInfoDao.save(uesrInfo);
	}
	
	@Override
	public int saveUesrInfos(UesrInfo[] uesrInfos){
		// TODO Auto-generated method stub
		return uesrInfoDao.saveUesrInfos(uesrInfos);
	}
	
}