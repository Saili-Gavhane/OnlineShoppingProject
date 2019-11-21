package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.model.Product;
@Repository("productRepository")
public class ProductRepositoryImpl implements ProductRepository {
	
	@PersistenceContext
	EntityManager em;

	@Transactional
	public Product addProduct(Product p) {
		p=em.merge(p);
		em.persist(p);
		return p;
	}

	@Override
	public Product updateUser(Product p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> findAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

}
