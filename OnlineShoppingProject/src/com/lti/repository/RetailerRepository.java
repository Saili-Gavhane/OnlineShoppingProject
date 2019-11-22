package com.lti.repository;

import java.util.List;

import com.lti.model.Retailer;

public interface RetailerRepository 
{
	public Retailer addRetailer(Retailer r);
	public Retailer updateRetailer(Retailer r);
	public Retailer findById(int id);
	public Retailer findByEmail(String email);
	public List<Retailer> findAllRetailers();
	
}
