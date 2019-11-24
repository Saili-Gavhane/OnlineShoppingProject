package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.OrderHistory;
import com.lti.repository.OrderHistoryRepository;

@Service("orderHistoryService")
public class OrderHistoryServiceImpl implements OrderHistoryService {

	@Autowired
	OrderHistoryRepository orderHistoryRepository;

	@Override
	public OrderHistory addOrderHistory(OrderHistory oh) {
		return orderHistoryRepository.addOrderHistory(oh);
	}

	@Override
	public OrderHistory updateOrderHistory(OrderHistory oh) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderHistory findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderHistory> findAllOrderHistory() {
		// TODO Auto-generated method stub
		return null;
	}

}
