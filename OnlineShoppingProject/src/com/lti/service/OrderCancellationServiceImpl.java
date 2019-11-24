package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.OrderCancellation;
import com.lti.repository.OrderCancellationRepository;

@Service("orderCancellationService")
public class OrderCancellationServiceImpl implements OrderCancellationService {
	@Autowired
	OrderCancellationRepository orderCancellationRepository;

	@Override
	public OrderCancellation addOrderCancellation(OrderCancellation oc) {
		return orderCancellationRepository.addOrderCancellation(oc);
	}

	@Override
	public OrderCancellation updateOrderCancellation(OrderCancellation oc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderCancellation findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderCancellation> findAllOrderCancellation() {
		// TODO Auto-generated method stub
		return null;
	}

}
