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
@Table(name="order_items1")
public class OrderItems {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_itemlist_seq")
	@SequenceGenerator(sequenceName = "order_itemlist_seq", name = "order_itemlist_seq", allocationSize = 1)
	int order_item_id;
	int quantity;
	float total_price;
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="product_id")
	private Product product;
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="order_id")
	private Orders orders;
	public OrderItems() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrderItems(int order_item_id, int quantity, float total_price, Product product, Orders orders) {
		super();
		this.order_item_id = order_item_id;
		this.quantity = quantity;
		this.total_price = total_price;
		this.product = product;
		this.orders = orders;
	}
	public int getOrder_item_id() {
		return order_item_id;
	}
	public void setOrder_item_id(int order_item_id) {
		this.order_item_id = order_item_id;
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
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Orders getOrders() {
		return orders;
	}
	public void setOrders(Orders orders) {
		this.orders = orders;
	}

}
