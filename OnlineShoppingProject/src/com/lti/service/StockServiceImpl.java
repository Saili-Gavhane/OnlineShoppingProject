package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.Stock;
import com.lti.repository.StockRepository;

@Service("stockService")
public class StockServiceImpl implements StockService{

	@Autowired
	StockRepository stockRepository;

	@Override
	public Stock addStock(Stock s) {
		return stockRepository.addStock(s);
		}

	@Override
	public Stock updateStock(Stock s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Stock findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public List<Stock> findAllStocks() {
		// TODO Auto-generated method stub
		return null;
	}
	

	
}
