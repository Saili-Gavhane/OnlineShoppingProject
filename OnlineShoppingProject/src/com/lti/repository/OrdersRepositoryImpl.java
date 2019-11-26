package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.model.Orders;
import com.lti.model.Product;
import com.lti.model.User;
import com.lti.model.UserAddress;

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
		return null;
	}

	@Override
	public Orders findUserOrders(User u) {
		String q="Select o Orders o where o.user2= (Select u from User u where u.user_id=?1)";
		TypedQuery<Orders> query = em.createQuery(q,Orders.class);
		query.setParameter(1,u.getUser_id());
	
		Orders o1= query.getSingleResult();
		return o1;
	}
	
	

}
