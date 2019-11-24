package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.CartItems;
import com.lti.repository.CartItemsRepository;

@Service("cartItemsService")
public class CartItemsServiceImpl implements CartItemsService {
	@Autowired
	CartItemsRepository cartItemsRepository;

	@Override
	public CartItems addCartItems(CartItems ci) {
		return cartItemsRepository.addCartItems(ci);
	}

	@Override
	public CartItems updateCartItems(CartItems ci) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CartItems findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CartItems> findAllCartItems() {
		// TODO Auto-generated method stub
		return null;
	}

}
