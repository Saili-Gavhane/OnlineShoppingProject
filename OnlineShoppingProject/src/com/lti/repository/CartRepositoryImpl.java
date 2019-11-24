package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.lti.model.Cart;

@Repository("cartRepository")
public class CartRepositoryImpl implements CartRepository{
	@PersistenceContext
    EntityManager em;

	@Override
	public Cart addCart(Cart c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cart updateCart(Cart c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cart findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cart> findAllCart() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
