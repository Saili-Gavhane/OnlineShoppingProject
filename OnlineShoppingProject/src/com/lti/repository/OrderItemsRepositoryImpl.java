package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.model.OrderItems;

@Repository("OrderItemsRepository")
public class OrderItemsRepositoryImpl implements OrderItemsRepository {


	@PersistenceContext
    EntityManager em;
	@Transactional
	public OrderItems addOrderItems(OrderItems oi) {
		oi=em.merge(oi);
		em.persist(oi);
		return oi;
	}

	@Override
	public OrderItems updateOrderItems(OrderItems oi) {

		return null;
	}

	@Override
	public OrderItems findById(int id) {
		
		return null;
	}

	@Override
	public List<OrderItems> findAllOrderItems() {
		
		return null;
	}

}
