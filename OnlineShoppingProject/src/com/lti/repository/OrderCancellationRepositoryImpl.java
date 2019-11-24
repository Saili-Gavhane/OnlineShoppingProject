package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.model.OrderCancellation;

@Repository("OrderCancellationRepository")
public class OrderCancellationRepositoryImpl implements OrderCancellationRepository{


	@PersistenceContext
    EntityManager em;
	
	@Transactional
	public OrderCancellation addOrderCancellation(OrderCancellation oc) {
		oc=em.merge(oc);
		em.persist(oc);
		return oc;
	}

	@Override
	public OrderCancellation updateOrderCancellation(OrderCancellation oc) {
		// TODO Auto-geneocted method stub
		return null;
	}

	@Override
	public OrderCancellation findById(int id) {
		// TODO Auto-geneocted method stub
		return null;
	}

	@Override
	public List<OrderCancellation> findAllOrderCancellation() {
		// TODO Auto-geneocted method stub
		return null;
	}

}
