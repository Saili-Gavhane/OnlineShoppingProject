package com.lti.service;

import java.util.List;

import com.lti.model.OrderCancellation;

public interface OrderCancellationService {

	public OrderCancellation addOrderCancellation(OrderCancellation oc);
	public OrderCancellation updateOrderCancellation(OrderCancellation oc);
	public OrderCancellation findById(int id);
	//public Retailer findByEmail(String email);
	public List<OrderCancellation> findAllOrderCancellation();
}
