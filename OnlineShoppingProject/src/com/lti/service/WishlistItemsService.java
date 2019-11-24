package com.lti.service;

import java.util.List;

import com.lti.model.WishlistItems;

public interface WishlistItemsService {

	public WishlistItems addWishlistItems(WishlistItems wi);
	public WishlistItems updateWishlistItems(WishlistItems wi);
	public WishlistItems findById(int id);
	//public Retailer findByEmail(String email);
	public List<WishlistItems> findAllWishlistItems();
}
