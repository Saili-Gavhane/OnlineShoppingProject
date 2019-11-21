package com.lti.service;

import java.util.List;

import com.lti.model.RetailerAddress;

public interface RetailerAddressService {
	public RetailerAddress addRetailerAddress(RetailerAddress a);
	public RetailerAddress updateRetailerAddress(RetailerAddress a);
	public RetailerAddress findById(int id);
	//public RetailerAddress findByEmail(String email);
	public List<RetailerAddress> findAllRetailerAddresss();

}
