package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.Brand;
import com.lti.repository.BrandRepository;

@Service("brandService")
public class BrandServiceImpl implements BrandService {

	@Autowired
	BrandRepository brandRepository;

	
	public Brand addBrand(Brand a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Brand updateBrand(Brand a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Brand findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Brand> findAllBrands() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
