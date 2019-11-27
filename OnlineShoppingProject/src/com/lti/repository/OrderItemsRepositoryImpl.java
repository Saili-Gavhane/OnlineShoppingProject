package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.model.OrderItems;
import com.lti.model.Orders;
import com.lti.model.User;
import com.lti.model.UserAddress;

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
	public List<OrderItems> findByOrder(Orders o) {
		String q="Select oi from OrderItems oi where oi.orders= (Select o from Orders o where o.order_id=?1)";
		TypedQuery<OrderItems> query = em.createQuery(q,OrderItems.class);
		query.setParameter(1,o.getOrder_id());
	
		List<OrderItems> o1= query.getResultList();
		return o1;
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
