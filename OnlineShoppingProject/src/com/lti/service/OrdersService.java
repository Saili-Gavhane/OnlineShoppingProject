package com.lti.service;

import java.util.List;

import com.lti.model.Orders;

public interface OrdersService {

	public Orders addOrders(Orders o);
	public Orders updateOrders(Orders o);
	public Orders findById(int id);
	//public Retailer findByEmail(String email);
	public List<Orders> findAllOrders();
}
