package com.lti.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
@Entity
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "category_seq")
	@SequenceGenerator(sequenceName = "category_seq", name = "category_seq", allocationSize = 1)
	int category_id;
	String category_name;
	@OneToOne(mappedBy="category")
	private Product product;
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Category(int category_id, String category_name,Product product) {
		super();
		this.category_id = category_id;
		this.category_name = category_name;
		this.product = product;
	}
	public int getCategory_id() {
		return category_id;
	}
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
	public String getCategory_name() {
		return category_name;
	}
	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	@Override
	public String toString() {
		return "Category [category_id=" + category_id + ", category_name=" + category_name + ", product=" + product
				+ "]";
	}
	

}
