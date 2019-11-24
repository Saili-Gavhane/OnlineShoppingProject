package com.lti.service;

import java.util.List;

import com.lti.model.OrderHistory;

public interface OrderHistoryService {

	public OrderHistory addOrderHistory(OrderHistory oh);
	public OrderHistory updateOrderHistory(OrderHistory oh);
	public OrderHistory findById(int id);
	//public Retailer findByEmail(String email);
	public List<OrderHistory> findAllOrderHistory();
}
