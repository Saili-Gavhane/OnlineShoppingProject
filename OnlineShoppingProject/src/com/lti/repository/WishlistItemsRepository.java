package com.lti.repository;

import java.util.List;

import com.lti.model.WishlistItems;

public interface WishlistItemsRepository {
	public WishlistItems addWishlistItems(WishlistItems wi);
	public WishlistItems updateWishlistItems(WishlistItems wi);
	public WishlistItems findById(int id);
	//public Retailer findByEmail(String email);
	public List<WishlistItems> findAllWishlistItems();
}
