package com.cqut.service.crowdFundingService;

import org.springframework.stereotype.Service;
import java.util.*;
import java.util.Map.Entry;
import javax.annotation.Resource;

import com.cqut.service.crowdFundingService.customInterface.ICrowdFundingService;
import com.cqut.dao.crowdFundingDao.CrowdFundingDao;
import com.cqut.entity.crowdFunding.CrowdFunding;
import com.cqut.service.baseService.BaseService;

/**
 * Service
 * 
 * @author zzy
 * 
 */
@Service
public class CrowdFundingServiceImpl extends BaseService implements ICrowdFundingService{
	
	@Resource(name="crowdFundingDao")
	CrowdFundingDao crowdFundingDao ;

	//select
	@Override
	public CrowdFunding getByID(String ID){
		// TODO Auto-generated method stub
		return crowdFundingDao.getByID(ID);
	}
	
	@Override
	public List<CrowdFunding> getByCondition(String condition){
		// TODO Auto-generated method stub
		return crowdFundingDao.getByCondition(condition);
	}
	
	@Override
	public int getCountByCondition(String condition){
		// TODO Auto-generated method stub
		return crowdFundingDao.getCountByCondition(condition);
	}
	
	@Override
	public Map<String,Object> findByID(String[] properties, String id){
		// TODO Auto-generated method stub
		return crowdFundingDao.findByID(properties, id);
	}
	
	@Override
	public List<Map<String,Object>> findByCondition(String[] properties, String condition){
		// TODO Auto-generated method stub
		return crowdFundingDao.findByCondition(properties, condition);
	}
	
	//update
	@Override
	public int updateByID(CrowdFunding crowdFunding, String ID){
		// TODO Auto-generated method stub
		return crowdFundingDao.updateByID(crowdFunding, ID);
	}
	
	@Override
	public int updateByCondition(CrowdFunding crowdFunding, String condition){
		// TODO Auto-generated method stub
		return crowdFundingDao.updateByCondition(crowdFunding, condition);
	}
	
	@Override
	public int updatePropByID(Set<Entry<String, Object>> prop, String ID){
		// TODO Auto-generated method stub
		return crowdFundingDao.updatePropByID(prop, ID);
	}
	
	@Override
	public int updatePropByCondition(Set<Entry<String, Object>> prop, String condition){
		// TODO Auto-generated method stub
		return crowdFundingDao.updatePropByCondition(prop, condition);
	}
	
	//delete
	@Override
	public int deleteByID(String ID){
		// TODO Auto-generated method stub
		return crowdFundingDao.deleteByID(ID);
	}
	
	@Override
	public int deleteByCondition(String condition){
		// TODO Auto-generated method stub
		return crowdFundingDao.deleteByCondition(condition);
	}
	
	@Override
	public int deleteCrowdFundingByIDs(String[] IDs){
		// TODO Auto-generated method stub
		return crowdFundingDao.deleteCrowdFundingByIDs(IDs);
	}
	
	//save
	@Override
	public int save(CrowdFunding crowdFunding){
		// TODO Auto-generated method stub
		return crowdFundingDao.save(crowdFunding);
	}
	
	@Override
	public int saveCrowdFundings(CrowdFunding[] crowdFundings){
		// TODO Auto-generated method stub
		return crowdFundingDao.saveCrowdFundings(crowdFundings);
	}
	
}