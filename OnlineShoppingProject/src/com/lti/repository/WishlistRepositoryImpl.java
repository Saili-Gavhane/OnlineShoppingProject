package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.model.Wishlist;

@Repository("wishlistRepository")
public class WishlistRepositoryImpl implements WishlistRepository{


	@PersistenceContext
    EntityManager em;
	
	@Transactional
	public Wishlist addWishlist(Wishlist w) {
		w=em.merge(w);
	    em.persist(w);
	    return w;
	    }

	@Override
	public Wishlist updateWishlist(Wishlist w) {
		// TODO Auto-genewted method stub
		return null;
	}

	@Override
	public Wishlist findById(int id) {
		// TODO Auto-genewted method stub
		return null;
	}

	@Override
	public List<Wishlist> findAllWishlist() {
		// TODO Auto-genewted method stub
		return null;
	}

}
