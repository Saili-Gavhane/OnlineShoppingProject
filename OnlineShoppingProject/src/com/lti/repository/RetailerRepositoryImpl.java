package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.model.Retailer;
@Repository("retailerRepository")
public class RetailerRepositoryImpl implements RetailerRepository {

	@PersistenceContext
    EntityManager em;
	
	@Transactional
	public Retailer addRetailer(Retailer r) {
		r = em.merge(r);
		em.persist(r);
		return r;
	}

	@Override
	public Retailer updateRetailer(Retailer r) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Retailer findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Retailer findByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Retailer> findAllRetailers() {
		// TODO Auto-generated method stub
		return null;
	}

}
