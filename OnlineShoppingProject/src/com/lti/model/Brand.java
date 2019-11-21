package com.lti.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
@Entity
public class Brand {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "brand_seq")
	@SequenceGenerator(sequenceName = "brand_seq", name = "brand_seq", allocationSize = 1)
	int brand_id;
	String brand_name;
	
	@OneToOne(mappedBy="brand1")
	private Product product;
	
	
	public Brand() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Brand(int brand_id, String brand_name, Product product) {
		super();
		this.brand_id = brand_id;
		this.brand_name = brand_name;
		this.product = product;
		
	}

	public int getBrand_id() {
		return brand_id;
	}
	public void setBrand_id(int brand_id) {
		this.brand_id = brand_id;
	}
	public String getBrand_name() {
		return brand_name;
	}
	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
	}

	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	@Override
	public String toString() {
		return "Brand [brand_id=" + brand_id + ", brand_name=" + brand_name + ", product=" + product + "]";
	}
	
	

}
