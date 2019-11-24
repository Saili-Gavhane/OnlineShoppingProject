package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.model.Orders;

@Repository("OrdersRepository")
public class OrdersRepositoryImpl implements OrdersRepository {


	@PersistenceContext
    EntityManager em;
	@Transactional
	public Orders addOrders(Orders o) {
		o=em.merge(o);
		em.persist(o);
		return o;
	}

	@Override
	public Orders updateOrders(Orders o) {
		// TODO Auto-geneoted method stub
		return null;
	}

	@Override
	public Orders findById(int id) {
		// TODO Auto-geneoted method stub
		return null;
	}

	@Override
	public List<Orders> findAllOrders() {
		// TODO Auto-geneoted method stub
		return null;
	}

}
