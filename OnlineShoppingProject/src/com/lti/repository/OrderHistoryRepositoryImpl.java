package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.model.OrderHistory;

@Repository("OrderHistoryRepository")
public class OrderHistoryRepositoryImpl implements OrderHistoryRepository{


	@PersistenceContext
    EntityManager em;
	@Transactional
	public OrderHistory addOrderHistory(OrderHistory oh) {
		oh=em.merge(oh);
		em.persist(oh);
		return oh;
	}

	@Override
	public OrderHistory updateOrderHistory(OrderHistory oh) {
		return null;
	}

	@Override
	public OrderHistory findById(int id) {
		
		return null;
	}

	@Override
	public List<OrderHistory> findAllOrderHistory() {
		
		return null;
	}

}
