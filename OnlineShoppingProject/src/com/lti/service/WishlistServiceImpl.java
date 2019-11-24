package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.Wishlist;
import com.lti.repository.WishlistRepository;

@Service("wishlistService")
public class WishlistServiceImpl implements WishlistService {

	@Autowired
	WishlistRepository wishlistRepository;

	@Override
	public Wishlist addWishlist(Wishlist w) {
		return wishlistRepository.addWishlist(w);
	}

	@Override
	public Wishlist updateWishlist(Wishlist w) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Wishlist findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Wishlist> findAllWishlist() {
		// TODO Auto-generated method stub
		return null;
	}

}
