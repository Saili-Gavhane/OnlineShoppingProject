package com.lti.service;

import java.util.List;

import com.lti.model.Retailer;

public interface RetailerService {
	public Retailer addRetailer(Retailer a);
	public Retailer updateRetailer(Retailer a);
	public Retailer findById(int id);
	//public Retailer findByEmail(String email);
	public List<Retailer> findAllRetailers();
	public Retailer login(Retailer r);

}
