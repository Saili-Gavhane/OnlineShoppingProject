package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.OrderItems;
import com.lti.repository.OrderItemsRepository;

@Service("orderItemsService")
public class OrderItemsServiceImpl implements OrderItemsService {
	@Autowired
	OrderItemsRepository orderItemsRepository;

	@Override
	public OrderItems addOrderItems(OrderItems oi) {
		return orderItemsRepository.addOrderItems(oi);
	}

	@Override
	public OrderItems updateOrderItems(OrderItems oi) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderItems findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderItems> findAllOrderItems() {
		// TODO Auto-generated method stub
		return null;
	}

}
