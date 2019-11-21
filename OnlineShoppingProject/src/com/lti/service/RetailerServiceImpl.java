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
		return null;
	}

	@Override
	public List<Retailer> findAllRetailers() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
