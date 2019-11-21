package com.lti.repository;

import java.util.List;

import com.lti.model.Stock;

public interface StockRepository {
	public Stock addStock(Stock s);
	public Stock updateStock(Stock s);
	public Stock findById(int id);
	//public Retailer findByEmail(String email);
	public List<Stock> findAllStock();

}
