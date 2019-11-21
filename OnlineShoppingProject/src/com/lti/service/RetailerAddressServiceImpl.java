package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.RetailerAddress;
import com.lti.repository.RetailerAddressRepository;

@Service("retailerAddressService")
public class RetailerAddressServiceImpl implements RetailerAddressService{

	@Autowired
	RetailerAddressRepository retailerAddressrepository;

	@Override
	public RetailerAddress addRetailerAddress(RetailerAddress s) {
		return retailerAddressrepository.addRetailerAddress(s);
		}

	@Override
	public RetailerAddress updateRetailerAddress(RetailerAddress s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RetailerAddress findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public List<RetailerAddress> findAllRetailerAddresss() {
		// TODO Auto-generated method stub
		return null;
	}
	

	
}
