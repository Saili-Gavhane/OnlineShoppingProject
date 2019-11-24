package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.WishlistItems;
import com.lti.repository.WishlistItemsRepository;

@Service("wishlistItemsService")
public class WishlistItemsServiceImpl implements WishlistItemsService {

	@Autowired
	WishlistItemsRepository wishlistItemsRepository;

	@Override
	public WishlistItems addWishlistItems(WishlistItems wi) {
		return wishlistItemsRepository.addWishlistItems(wi);
	}

	@Override
	public WishlistItems updateWishlistItems(WishlistItems wi) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WishlistItems findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<WishlistItems> findAllWishlistItems() {
		// TODO Auto-generated method stub
		return null;
	}

}
