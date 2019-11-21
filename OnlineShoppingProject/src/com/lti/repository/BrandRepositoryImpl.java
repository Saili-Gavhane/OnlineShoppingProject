package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.model.Brand;
@Repository("brandRepository")
public class BrandRepositoryImpl implements BrandRepository{

	@PersistenceContext
    EntityManager em;
	
	@Transactional
	public Brand addBrand(Brand b) {
		b=em.merge(b);
		em.persist(b);
		return b;
	}

	@Override
	public Brand updateBrand(Brand b) {
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
