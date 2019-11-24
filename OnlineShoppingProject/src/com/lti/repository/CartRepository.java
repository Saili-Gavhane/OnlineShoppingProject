package com.lti.repository;

import java.util.List;

import com.lti.model.Cart;

public interface CartRepository{
	public Cart addCart(Cart c);
	public Cart updateCart(Cart c);
	public Cart findById(int id);
//	public Cart findByEmail(String email);
	public List<Cart> findAllCart();
}
