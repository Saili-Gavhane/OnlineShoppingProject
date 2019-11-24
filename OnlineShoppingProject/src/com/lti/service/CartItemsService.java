package com.lti.service;

import java.util.List;

import com.lti.model.CartItems;

public interface CartItemsService {
	public CartItems addCartItems(CartItems ci);
	public CartItems updateCartItems(CartItems ci);
	public CartItems findById(int id);
//	public CartItems findByEmail(String email);
	public List<CartItems> findAllCartItems();
}
