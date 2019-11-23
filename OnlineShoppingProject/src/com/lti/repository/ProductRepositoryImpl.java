package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.model.Category;
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
		Product p = em.find(Product.class, id);
		return p;
	}

	@Override
	public List<Product> findAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Transactional                                          
	public Product findByName(String name) {
		String q="Select c from Product c where c.product_name =?1";
		TypedQuery<Product> query = em.createQuery(q,Product.class);
		query.setParameter(1,name);
		//query.setParameter(2,nbOfPage);
	
		Product c= query.getSingleResult();
		return c;		
	}

}
