package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
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
	public Admin findByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Admin> findAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

}
