package com.lti.service;

import java.util.List;

import com.lti.model.Wishlist;

public interface WishlistService {

	public Wishlist addWishlist(Wishlist w);
	public Wishlist updateWishlist(Wishlist w);
	public Wishlist findById(int id);
	//public Retailer findByEmail(String email);
	public List<Wishlist> findAllWishlist();
}
