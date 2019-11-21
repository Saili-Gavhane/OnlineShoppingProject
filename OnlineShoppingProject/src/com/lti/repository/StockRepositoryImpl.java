package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.model.Stock;
@Repository("stockRepository")
public class StockRepositoryImpl implements StockRepository {
	@PersistenceContext
	EntityManager em;
	
	@Transactional
	public Stock addStock(Stock s) {
		s=em.merge(s);
		em.persist(s);
		return s;
	}

	@Override
	public Stock updateStock(Stock s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Stock findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Stock> findAllStock() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
