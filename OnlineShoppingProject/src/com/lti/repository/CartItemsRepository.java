package com.lti.repository;

import java.util.List;

import com.lti.model.CartItems;

public interface CartItemsRepository {
	public CartItems addCartItems(CartItems ci);
	public CartItems updateCartItems(CartItems ci);
	public CartItems findById(int id);
//	public CartItems findByEmail(String email);
	public List<CartItems> findAllCartItems();
}
