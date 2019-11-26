package com.lti.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="cart_items")
public class CartItems 
{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cart_items_seq")
	@SequenceGenerator(sequenceName = "cart_items_seq", name = "cart_items_seq", allocationSize = 1)
	int cart_item_id;
	int quantity;
	float total_price;
	String status;
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="product_id")
	private Product product;
	public int getCart_item_id() {
		return cart_item_id;
	}
	public void setCart_item_id(int cart_item_id) {
		this.cart_item_id = cart_item_id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getTotal_price() {
		return total_price;
	}
	public void setTotal_price(float total_price) {
		this.total_price = total_price;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public CartItems() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CartItems(int cart_item_id, int quantity, float total_price, String status, Product product) {
		super();
		this.cart_item_id = cart_item_id;
		this.quantity = quantity;
		this.total_price = total_price;
		this.status = status;
		this.product = product;
	}
	
}
