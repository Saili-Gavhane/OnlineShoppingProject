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
@Table(name="order_history")
public class OrderHistory 
{
	public OrderHistory() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_history_seq")
	@SequenceGenerator(sequenceName = "order_history_seq", name = "order_history_seq", allocationSize = 1)
	int order_history_id;
	String order_status;
	String remark;
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="user_id")
	private User user4;
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="order_id")
	private Orders orders;
	public OrderHistory(int order_history_id, String order_status, String remark, User user4, Orders orders) {
		super();
		this.order_history_id = order_history_id;
		this.order_status = order_status;
		this.remark = remark;
		this.user4 = user4;
		this.orders = orders;
	}
	public int getOrder_history_id() {
		return order_history_id;
	}
	public void setOrder_history_id(int order_history_id) {
		this.order_history_id = order_history_id;
	}
	public String getOrder_status() {
		return order_status;
	}
	public void setOrder_status(String order_status) {
		this.order_status = order_status;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public User getUser4() {
		return user4;
	}
	public void setUser4(User user4) {
		this.user4 = user4;
	}
	public Orders getOrders() {
		return orders;
	}
	public void setOrders(Orders orders) {
		this.orders = orders;
	}

}
