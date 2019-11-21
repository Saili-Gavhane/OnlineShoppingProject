package com.lti.service;

import java.util.List;

import com.lti.model.Brand;

public interface BrandService {
	public Brand addBrand(Brand a);
	public Brand updateBrand(Brand a);
	public Brand findById(int id);
	public Brand findByName(String name);
	//public Brand findByEmail(String email);
	public List<Brand> findAllBrands();

}
