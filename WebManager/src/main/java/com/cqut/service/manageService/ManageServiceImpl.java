package com.cqut.service.manageService;

import org.springframework.stereotype.Service;
import java.util.*;
import java.util.Map.Entry;
import javax.annotation.Resource;

import com.cqut.service.manageService.customInterface.IManageService;
import com.cqut.dao.manageDao.ManageDao;
import com.cqut.entity.manage.Manage;
import com.cqut.service.baseService.BaseService;

/**
 * Service
 * 
 * @author zzy
 * 
 */
@Service
public class ManageServiceImpl extends BaseService implements IManageService{
	
	@Resource(name="manageDao")
	ManageDao manageDao ;

	//select
	@Override
	public Manage getByID(String ID){
		// TODO Auto-generated method stub
		return manageDao.getByID(ID);
	}
	
	@Override
	public List<Manage> getByCondition(String condition){
		// TODO Auto-generated method stub
		return manageDao.getByCondition(condition);
	}
	
	@Override
	public int getCountByCondition(String condition){
		// TODO Auto-generated method stub
		return manageDao.getCountByCondition(condition);
	}
	
	@Override
	public Map<String,Object> findByID(String[] properties, String id){
		// TODO Auto-generated method stub
		return manageDao.findByID(properties, id);
	}
	
	@Override
	public List<Map<String,Object>> findByCondition(String[] properties, String condition){
		// TODO Auto-generated method stub
		return manageDao.findByCondition(properties, condition);
	}
	
	//update
	@Override
	public int updateByID(Manage manage, String ID){
		// TODO Auto-generated method stub
		return manageDao.updateByID(manage, ID);
	}
	
	@Override
	public int updateByCondition(Manage manage, String condition){
		// TODO Auto-generated method stub
		return manageDao.updateByCondition(manage, condition);
	}
	
	@Override
	public int updatePropByID(Set<Entry<String, Object>> prop, String ID){
		// TODO Auto-generated method stub
		return manageDao.updatePropByID(prop, ID);
	}
	
	@Override
	public int updatePropByCondition(Set<Entry<String, Object>> prop, String condition){
		// TODO Auto-generated method stub
		return manageDao.updatePropByCondition(prop, condition);
	}
	
	//delete
	@Override
	public int deleteByID(String ID){
		// TODO Auto-generated method stub
		return manageDao.deleteByID(ID);
	}
	
	@Override
	public int deleteByCondition(String condition){
		// TODO Auto-generated method stub
		return manageDao.deleteByCondition(condition);
	}
	
	@Override
	public int deleteManageByIDs(String[] IDs){
		// TODO Auto-generated method stub
		return manageDao.deleteManageByIDs(IDs);
	}
	
	//save
	@Override
	public int save(Manage manage){
		// TODO Auto-generated method stub
		return manageDao.save(manage);
	}
	
	@Override
	public int saveManages(Manage[] manages){
		// TODO Auto-generated method stub
		return manageDao.saveManages(manages);
	}
	
}