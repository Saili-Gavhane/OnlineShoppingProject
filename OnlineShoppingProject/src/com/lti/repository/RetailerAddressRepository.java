package com.lti.repository;

import java.util.List;

import com.lti.model.RetailerAddress;

public interface RetailerAddressRepository {
	public RetailerAddress addRetailerAddress(RetailerAddress ra);
	public RetailerAddress updateRetailerAddress(RetailerAddress ra);
	public RetailerAddress findById(int id);
	//public Retailer findByEmail(String email);
	public List<RetailerAddress> findAllRetailerAddress();

}
