package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.model.RetailerAddress;
@Repository("retailerAddressRepository")
public class RetailerAddressRepositoryImpl implements RetailerAddressRepository {

	@PersistenceContext
    EntityManager em;
	
	@Transactional
	public RetailerAddress addRetailerAddress(RetailerAddress ra) {
		ra=em.merge(ra);
		em.persist(ra);
		return ra;
	}

	@Override
	public RetailerAddress updateRetailerAddress(RetailerAddress ra) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RetailerAddress findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RetailerAddress> findAllRetailerAddress() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
