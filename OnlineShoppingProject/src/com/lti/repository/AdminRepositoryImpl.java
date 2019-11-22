package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.model.Admin;

@Repository("adminrepository")
public class AdminRepositoryImpl implements AdminRepository {
	@PersistenceContext
    EntityManager em;
	
	@Transactional
	public Admin addUser(Admin a) {
		em.persist(a);
		return a;
	}
	@Transactional                                          
	public Admin findByEmail(String email) {
		String q="Select a from Admin a where a.admin_email =?1";
		TypedQuery<Admin> query = em.createQuery(q,Admin.class);
		query.setParameter(1,email);
		//query.setParameter(2,nbOfPage);
	
		Admin u= query.getSingleResult();
		return u;		
	}

	@Override
	public Admin updateUser(Admin a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Admin findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Admin> findAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

}
