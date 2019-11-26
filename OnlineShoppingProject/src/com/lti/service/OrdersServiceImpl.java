package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.Orders;
import com.lti.model.User;
import com.lti.repository.OrdersRepository;

@Service("ordersService")
public class OrdersServiceImpl implements OrdersService {
	@Autowired
	OrdersRepository ordersRepository;

	@Override
	public Orders addOrders(Orders o) {
		return ordersRepository.addOrders(o);
	}

	@Override
	public Orders updateOrders(Orders o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Orders findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Orders> findAllOrders() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Orders findUserOrders(User u) {
		// TODO Auto-generated method stub
		return ordersRepository.findUserOrders(u);
	}

}
