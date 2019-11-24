package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

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

