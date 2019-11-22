package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.model.Admin;
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
		Retailer r = em.find(Retailer.class, id);
		return r;
	}

	@Override
	public List<Retailer> findAllRetailers() {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional                                          
	public Retailer findByEmail(String email) {
		String q="Select r from Retailer r where r.retailer_email =?1";
		TypedQuery<Retailer> query = em.createQuery(q,Retailer.class);
		query.setParameter(1,email);
		//query.setParameter(2,nbOfPage);
	
		Retailer u= query.getSingleResult();
		return u;		
	}

}
