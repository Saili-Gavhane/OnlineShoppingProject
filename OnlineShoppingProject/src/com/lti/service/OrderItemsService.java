package com.lti.service;

import java.util.List;

import com.lti.model.OrderItems;

public interface OrderItemsService {
	public OrderItems addOrderItems(OrderItems oi);
	public OrderItems updateOrderItems(OrderItems oi);
	public OrderItems findById(int id);
	//public Retailer findByEmail(String email);
	public List<OrderItems> findAllOrderItems();
}
