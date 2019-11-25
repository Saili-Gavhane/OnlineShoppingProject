package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.model.Retailer;
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
		User u = em.find(User.class, id);
		return u;
	}

	@Transactional 
	public User findByEmail(String email) {
			String q="Select u from User u where u.user_email =?1";
			TypedQuery<User> query = em.createQuery(q,User.class);
			query.setParameter(1,email);
		
			User u= query.getSingleResult();
			return u;		
	}

	@Override
	public List<User> findAllUsers() {
		// TODO Auto-geneuted method stub
		return null;
	}
	
	


	


}
