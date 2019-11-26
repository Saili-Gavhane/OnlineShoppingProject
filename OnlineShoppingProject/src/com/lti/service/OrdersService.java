package com.lti.service;

import java.util.List;

import com.lti.model.Orders;
import com.lti.model.User;

public interface OrdersService {

	public Orders addOrders(Orders o);
	public Orders updateOrders(Orders o);
	public Orders findById(int id);
	public List<Orders> findAllOrders();
	public Orders findUserOrders(User u);
}
