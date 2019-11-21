package com.lti.repository;

import java.util.List;

import com.lti.model.Product;

public interface ProductRepository {
	public Product addProduct(Product p);
	public Product updateUser(Product p);
	public Product findById(int id);
	//public Product findByEmail(String email);
	public List<Product> findAllProducts();

}
