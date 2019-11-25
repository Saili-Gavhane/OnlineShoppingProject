package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.Product;
import com.lti.repository.ProductRepository;

@Service("productService")
public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductRepository productRepository;

	@Override
	public Product addProduct(Product s) {
		return productRepository.addProduct(s);
		}

	@Override
	public Product updateProduct(Product s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product findById(int id) {
		return productRepository.findById(id);
	}

	

	@Override
	public List<Product> findAllProducts() {
		// TODO Auto-generated method stub
		return productRepository.findAllProducts();
	}
	
	public Product findByName(String name)
	{
		return productRepository.findByName(name);
	}

	@Override
	public List<Product> findAllProductsByDescending() {
		// TODO Auto-generated method stub
		return productRepository.findAllProductsByDescending();
	}

	@Override
	public List<Product> findAllProductsByAscending() {
		// TODO Auto-generated method stub
		return productRepository.findAllProductsByAscending();
	}
	
}
