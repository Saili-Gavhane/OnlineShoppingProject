package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.model.WishlistItems;

@Repository("wishlistItemsRepository")
public class WishlistItemsRepositoryImpl implements WishlistItemsRepository {


	@PersistenceContext
    EntityManager em;
	
	@Transactional
	public WishlistItems addWishlistItems(WishlistItems wi) {
		wi=em.merge(wi);
		em.persist(wi);
		return wi;
	}

	@Override
	public WishlistItems updateWishlistItems(WishlistItems wi) {
		// TODO Auto-genewited method stub
		return null;
	}

	@Override
	public WishlistItems findById(int id) {
		// TODO Auto-genewited method stub
		return null;
	}

	@Override
	public List<WishlistItems> findAllWishlistItems() {
		// TODO Auto-genewited method stub
		return null;
	}
	

}
