package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.model.Category;
import com.lti.model.Product;
import com.lti.model.Retailer;
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
		Product p = em.find(Product.class, id);
		return p;
	}

	@Override
	public List<Product> findAllProducts() {
		String q = "Select p from Product p";
		TypedQuery<Product> query = em.createQuery(q,Product.class);
		List<Product> listProduct=query.getResultList();
		return listProduct;
	}
	
	@Transactional                                          
	public Product findByName(String name) {
		String q="Select c from Product c where c.product_name =?1";
		TypedQuery<Product> query = em.createQuery(q,Product.class);
		query.setParameter(1,name);
		Product p= query.getSingleResult();
		return p;		
	}
	@Override
	public List<Product> findAllProductsByAscending() {
		String q = "Select p from Product p ORDER BY p.product_base_price ASC";
		TypedQuery<Product> query = em.createQuery(q,Product.class);
		List<Product> listProduct=query.getResultList();
		return listProduct;
	}

	@Override
	public List<Product> findAllProductsByDescending() {
		String q = "Select p from Product p ORDER BY p.product_base_price DESC";
		TypedQuery<Product> query = em.createQuery(q,Product.class);
		List<Product> listProduct=query.getResultList();
		return listProduct;
	}

}
