package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.Retailer;
import com.lti.repository.RetailerRepository;

@Service("retailerService")
public class RetailerServiceImpl implements RetailerService {
	
	@Autowired
	RetailerRepository retailerRepository;

	@Override
	public Retailer addRetailer(Retailer a) {
		// TODO Auto-generated method stub
		return retailerRepository.addRetailer(a);
	}

	@Override
	public Retailer updateRetailer(Retailer a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Retailer findById(int id) {
		// TODO Auto-generated method stub
		return retailerRepository.findById(id);
	}

	@Override
	public List<Retailer> findAllRetailers() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Retailer login(Retailer r) {
		Retailer userToBeReturned=null;
		Retailer uDB= retailerRepository.findByEmail(r.getRetailer_email());
		
		if(uDB==null)
		{
			
		}
		else if(uDB.getRetailer_email().equals(r.getRetailer_email())&&(uDB.getRetailer_password().equals(r.getRetailer_password())))
		{
			userToBeReturned = uDB;
		}
		else
		{
			
		}
		return userToBeReturned;
	}

}
