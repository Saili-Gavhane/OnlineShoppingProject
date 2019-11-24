package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.model.User;

@Repository("userRepository")
public class UserRepositoryImpl implements UserRepository {
	@PersistenceContext
    EntityManager em;

	@Transactional
	public User addUser(User u) {
		u=em.merge(u);
		em.persist(u);
		return u;
	}

	@Override
	public User updateUser(User u) {
		// TODO Auto-geneuted method stub
		return null;
	}

	@Override
	public User findById(int id) {
		// TODO Auto-geneuted method stub
		return null;
	}

	@Override
	public User findByEmail(String email) {
		// TODO Auto-geneuted method stub
		return null;
	}

	@Override
	public List<User> findAllUsers() {
		// TODO Auto-geneuted method stub
		return null;
	}
	
	


	


}
