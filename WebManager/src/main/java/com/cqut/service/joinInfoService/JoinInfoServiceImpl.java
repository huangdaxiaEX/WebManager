package com.cqut.service.joinInfoService;

import org.springframework.stereotype.Service;
import java.util.*;
import java.util.Map.Entry;
import javax.annotation.Resource;

import com.cqut.service.joinInfoService.customInterface.IJoinInfoService;
import com.cqut.dao.joinInfoDao.JoinInfoDao;
import com.cqut.entity.joinInfo.JoinInfo;
import com.cqut.service.baseService.BaseService;

/**
 * Service
 * 
 * @author zzy
 * 
 */
@Service
public class JoinInfoServiceImpl extends BaseService implements IJoinInfoService{
	
	@Resource(name="joinInfoDao")
	JoinInfoDao joinInfoDao ;

	//select
	@Override
	public JoinInfo getByID(String ID){
		// TODO Auto-generated method stub
		return joinInfoDao.getByID(ID);
	}
	
	@Override
	public List<JoinInfo> getByCondition(String condition){
		// TODO Auto-generated method stub
		return joinInfoDao.getByCondition(condition);
	}
	
	@Override
	public int getCountByCondition(String condition){
		// TODO Auto-generated method stub
		return joinInfoDao.getCountByCondition(condition);
	}
	
	@Override
	public Map<String,Object> findByID(String[] properties, String id){
		// TODO Auto-generated method stub
		return joinInfoDao.findByID(properties, id);
	}
	
	@Override
	public List<Map<String,Object>> findByCondition(String[] properties, String condition){
		// TODO Auto-generated method stub
		return joinInfoDao.findByCondition(properties, condition);
	}
	
	//update
	@Override
	public int updateByID(JoinInfo joinInfo, String ID){
		// TODO Auto-generated method stub
		return joinInfoDao.updateByID(joinInfo, ID);
	}
	
	@Override
	public int updateByCondition(JoinInfo joinInfo, String condition){
		// TODO Auto-generated method stub
		return joinInfoDao.updateByCondition(joinInfo, condition);
	}
	
	@Override
	public int updatePropByID(Set<Entry<String, Object>> prop, String ID){
		// TODO Auto-generated method stub
		return joinInfoDao.updatePropByID(prop, ID);
	}
	
	@Override
	public int updatePropByCondition(Set<Entry<String, Object>> prop, String condition){
		// TODO Auto-generated method stub
		return joinInfoDao.updatePropByCondition(prop, condition);
	}
	
	//delete
	@Override
	public int deleteByID(String ID){
		// TODO Auto-generated method stub
		return joinInfoDao.deleteByID(ID);
	}
	
	@Override
	public int deleteByCondition(String condition){
		// TODO Auto-generated method stub
		return joinInfoDao.deleteByCondition(condition);
	}
	
	@Override
	public int deleteJoinInfoByIDs(String[] IDs){
		// TODO Auto-generated method stub
		return joinInfoDao.deleteJoinInfoByIDs(IDs);
	}
	
	//save
	@Override
	public int save(JoinInfo joinInfo){
		// TODO Auto-generated method stub
		return joinInfoDao.save(joinInfo);
	}
	
	@Override
	public int saveJoinInfos(JoinInfo[] joinInfos){
		// TODO Auto-generated method stub
		return joinInfoDao.saveJoinInfos(joinInfos);
	}
	
}