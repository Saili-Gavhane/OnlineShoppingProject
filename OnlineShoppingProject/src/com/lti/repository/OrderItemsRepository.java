package com.lti.repository;

import java.util.List;

import com.lti.model.OrderItems;

public interface OrderItemsRepository {
	public OrderItems addOrderItems(OrderItems oi);
	public OrderItems updateOrderItems(OrderItems oi);
	public OrderItems findById(int id);
	//public Retailer findByEmail(String email);
	public List<OrderItems> findAllOrderItems();
}
