package com.lti.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Stock {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "stock_seq")
	@SequenceGenerator(sequenceName = "stock_seq", name = "stock_seq", allocationSize = 1)
	int stock_id;
	int product_count;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="product_id")
	private Product product; 

	public Stock() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Stock(int stock_id, int product_count, Product product) {
		super();
		this.stock_id = stock_id;
		this.product_count = product_count;
		this.product = product;
	}

	public int getStock_id() {
		return stock_id;
	}

	public void setStock_id(int stock_id) {
		this.stock_id = stock_id;
	}

	public int getProduct_count() {
		return product_count;
	}

	public void setProduct_count(int product_count) {
		this.product_count = product_count;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "Stock [stock_id=" + stock_id + ", product_count=" + product_count + ", product=" + product + "]";
	}
	

}
