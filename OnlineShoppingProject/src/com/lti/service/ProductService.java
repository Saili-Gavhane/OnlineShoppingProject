package com.lti.service;

import java.util.List;

import com.lti.model.Product;

public interface ProductService {
	public Product addProduct(Product a);
	public Product updateProduct(Product a);
	public Product findById(int id);
	//public Product findByEmail(String email);
	public List<Product> findAllProducts();
	public Product findByName(String name);

}
