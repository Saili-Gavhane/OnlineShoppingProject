package com.lti.model;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "productseq1")
	@SequenceGenerator(sequenceName = "productseq1", name = "productseq1", allocationSize = 1)
	int product_id;
	String product_name;
	float product_base_price;
	String product_image;
	String product_update_date;
	@Column(name="product_description")
	String description;
	String approval_status;
	
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="retailer_id")
	private Retailer retailer;
	
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="product_brand_id")
	private Brand brand1;
	
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="product_category_id")
	private Category category;
	
	
	@OneToOne(mappedBy="product")
	private Stock stock;
	
	

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Product(int product_id, String product_name, float product_base_price, String product_image,
			String product_update_date, String description, String approval_status, Retailer retailer, Brand brand1,
			Category category, Stock stock) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_base_price = product_base_price;
		this.product_image = product_image;
		this.product_update_date = product_update_date;
		this.description = description;
		this.approval_status = approval_status;
		this.retailer = retailer;
		this.brand1 = brand1;
		this.category = category;
		
	}



	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public float getProduct_base_price() {
		return product_base_price;
	}

	public void setProduct_base_price(float product_base_price) {
		this.product_base_price = product_base_price;
	}

	public String getProduct_image() {
		return product_image;
	}

	public void setProduct_image(String product_image) {
		this.product_image = product_image;
	}

	public String getProduct_update_date() {
		return product_update_date;
	}

	public void setProduct_update_date(String product_update_date) {
		this.product_update_date = product_update_date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getApproval_status() {
		return approval_status;
	}

	public void setApproval_status(String approval_status) {
		this.approval_status = approval_status;
	}

	public Retailer getRetailer() {
		return retailer;
	}

	public void setRetailer(Retailer retailer) {
		this.retailer = retailer;
	}

	public Brand getBrand1() {
		return brand1;
	}

	public void setBrand1(Brand brand1) {
		this.brand1 = brand1;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}






	@Override
	public String toString() {
		return "Product [product_id=" + product_id + ", product_name=" + product_name + ", product_base_price="
				+ product_base_price + ", product_image=" + product_image + ", product_update_date="
				+ product_update_date + ", description=" + description + ", approval_status=" + approval_status
				+ ", retailer=" + retailer + ", brand1=" + brand1 + ", category=" + category + "]";
	}



}
