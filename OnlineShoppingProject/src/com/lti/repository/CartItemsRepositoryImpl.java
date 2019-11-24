package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.model.CartItems;

@Repository("cartItemsRepository")
public class CartItemsRepositoryImpl implements CartItemsRepository{


	@PersistenceContext
    EntityManager em;
	
	@Transactional
	public CartItems addCartItems(CartItems ci) {
		ci=em.merge(ci);
		em.persist(ci);
		return ci;
	}

	@Override
	public CartItems updateCartItems(CartItems ci) {
		// TODO Auto-genecited method stub
		return null;
	}

	@Override
	public CartItems findById(int id) {
		// TODO Auto-genecited method stub
		return null;
	}

	@Override
	public List<CartItems> findAllCartItems() {
		// TODO Auto-genecited method stub
		return null;
	}

}
