package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.model.User;
import com.lti.model.UserAddress;

@Repository("userAddressRepository")
public class UserAddressRepositoryImpl implements UserAddressRepository {

	@PersistenceContext
    EntityManager em;

	@Transactional
	public UserAddress addUser(UserAddress ua) {
		ua=em.merge(ua);
		em.persist(ua);
		return ua;
	}
	public UserAddress findByUser(User u) {
		System.out.println(u.getUser_id()+"-->"+u.getFirst_name());
		String q="Select ua from UserAddress ua where ua.user= (Select u from User u where u.user_id=?1)";
		TypedQuery<UserAddress> query = em.createQuery(q,UserAddress.class);
		query.setParameter(1,u.getUser_id());
	
		UserAddress u1= query.getSingleResult();
		return u1;
	}

	@Override
	public UserAddress updateUser(UserAddress ua) {
		// TODO Auto-geneuated method stub
		return null;
	}

	@Override
	public UserAddress findById(int id) {
		// TODO Auto-geneuated method stub
		return null;
	}

	@Override
	public List<UserAddress> findAllUserAddresses() {
		// TODO Auto-geneuated method stub
		return null;
	}
	

}

