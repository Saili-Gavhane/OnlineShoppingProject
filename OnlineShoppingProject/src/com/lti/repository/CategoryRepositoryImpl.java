package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.model.Category;

@Repository("categoryRepository")
public class CategoryRepositoryImpl implements CategoryRepository {

	@PersistenceContext
    EntityManager em;
	
	@Transactional
	public Category addCategory(Category c) {
		c=em.merge(c);
		em.persist(c);
		return c;
	}

	@Override
	public Category updateCategory(Category c) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Transactional                                          
	public Category findByName(String name) {
		String q="Select c from Category c where c.category_name =?1";
		TypedQuery<Category> query = em.createQuery(q,Category.class);
		query.setParameter(1,name);
		//query.setParameter(2,nbOfPage);
	
		Category c= query.getSingleResult();
		return c;		
	}

	@Override
	public Category findById(int id) {
		Category c = em.find(Category.class, id);
		return c;
	}

	@Override
	public List<Category> findAllCategories() {
		// TODO Auto-generated method stub
		return null;
	}

}
