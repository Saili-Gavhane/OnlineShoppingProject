package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.Cart;
import com.lti.repository.CartRepository;

@Service("cartService")
public class CartServiceImpl implements CartService {
	@Autowired
	CartRepository cartRepository;

	@Override
	public Cart addCart(Cart c) {
		return cartRepository.addCart(c);
	}

	@Override
	public Cart updateCart(Cart c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cart findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cart> findAllCart() {
		// TODO Auto-generated method stub
		return null;
	}

}
