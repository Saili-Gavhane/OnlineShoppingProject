package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.model.BankDetails;
@Repository("bankDetailsRepository")
public class BankDetailsRepositoryImpl implements BankDetailsRepository{

	@PersistenceContext
    EntityManager em;
	
	@Transactional
	public BankDetails addBankDetails(BankDetails b) {
		b = em.merge(b);
		em.persist(b);
		return b;
	}

	@Override
	public BankDetails updateBankDetails(BankDetails b) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BankDetails findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BankDetails> findAllBankDetails() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
