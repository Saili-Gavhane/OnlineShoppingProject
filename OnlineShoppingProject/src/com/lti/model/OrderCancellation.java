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
@Table(name="order_cancellation")
public class OrderCancellation 
{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_cancellation_seq")
	@SequenceGenerator(sequenceName = "order_cancellation_seq", name = "order_cancellation_seq", allocationSize = 1)
	int order_cancellation_id;
	String cancellation_status;
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="user_id")
	private User user5;
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="order_id")
	private Orders orders;
	public OrderCancellation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrderCancellation(int order_cancellation_id, String cancellation_status, User user5, Orders orders) {
		super();
		this.order_cancellation_id = order_cancellation_id;
		this.cancellation_status = cancellation_status;
		this.user5 = user5;
		this.orders = orders;
	}
	public int getOrder_cancellation_id() {
		return order_cancellation_id;
	}
	public void setOrder_cancellation_id(int order_cancellation_id) {
		this.order_cancellation_id = order_cancellation_id;
	}
	public String getCancellation_status() {
		return cancellation_status;
	}
	public void setCancellation_status(String cancellation_status) {
		this.cancellation_status = cancellation_status;
	}
	public User getUser5() {
		return user5;
	}
	public void setUser5(User user5) {
		this.user5 = user5;
	}
	public Orders getOrders() {
		return orders;
	}
	public void setOrders(Orders orders) {
		this.orders = orders;
	}
	
}
