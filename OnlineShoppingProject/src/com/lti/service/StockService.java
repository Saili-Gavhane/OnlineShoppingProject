package com.lti.service;

import java.util.List;

import com.lti.model.Stock;

public interface StockService {
	public Stock addStock(Stock a);
	public Stock updateStock(Stock a);
	public Stock findById(int id);
	//public Stock findByEmail(String email);
	public List<Stock> findAllStocks();

}
