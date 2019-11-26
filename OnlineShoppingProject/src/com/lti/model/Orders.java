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
@Table(name="order_details1")
public class Orders {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "orders_seq")
	@SequenceGenerator(sequenceName = "orders_seq", name = "orders_seq", allocationSize = 1)
	int order_id;
	String order_ship_name;
	String order_date;
	float delivery_charges;
	int order_tracking_no;
	String order_status;
	String order_amount;
	String order_delivery_date;
	String remark;
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="user_id")
	private User user2;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="address_id")
	private UserAddress useraddress;

	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Orders(int order_id, String order_ship_name, String order_date,
			float delivery_charges, int order_tracking_no, String order_status, String order_amount,
			String order_delivery_date, String remark, User user2, UserAddress useraddress) {
		super();
		this.order_id = order_id;
		this.order_ship_name = order_ship_name;
		
		this.order_date = order_date;
		this.delivery_charges = delivery_charges;
		this.order_tracking_no = order_tracking_no;
		this.order_status = order_status;
		this.order_amount = order_amount;
		this.order_delivery_date = order_delivery_date;
		this.remark = remark;
		this.user2 = user2;
		this.useraddress = useraddress;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public String getOrder_ship_name() {
		return order_ship_name;
	}

	public void setOrder_ship_name(String order_ship_name) {
		this.order_ship_name = order_ship_name;
	}

	public String getOrder_date() {
		return order_date;
	}

	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}

	public float getDelivery_charges() {
		return delivery_charges;
	}

	public void setDelivery_charges(float delivery_charges) {
		this.delivery_charges = delivery_charges;
	}

	public int getOrder_tracking_no() {
		return order_tracking_no;
	}

	public void setOrder_tracking_no(int order_tracking_no) {
		this.order_tracking_no = order_tracking_no;
	}

	public String getOrder_status() {
		return order_status;
	}

	public void setOrder_status(String order_status) {
		this.order_status = order_status;
	}

	public String getOrder_amount() {
		return order_amount;
	}

	public void setOrder_amount(String order_amount) {
		this.order_amount = order_amount;
	}

	public String getOrder_delivery_date() {
		return order_delivery_date;
	}

	public void setOrder_delivery_date(String order_delivery_date) {
		this.order_delivery_date = order_delivery_date;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public User getUser2() {
		return user2;
	}

	public void setUser2(User user2) {
		this.user2 = user2;
	}

	public UserAddress getUseraddress() {
		return useraddress;
	}

	public void setUseraddress(UserAddress useraddress) {
		this.useraddress = useraddress;
	}

	@Override
	public String toString() {
		return "Orders [order_id=" + order_id + ", order_ship_name=" + order_ship_name + ", order_date=" + order_date
				+ ", delivery_charges=" + delivery_charges + ", order_tracking_no=" + order_tracking_no
				+ ", order_status=" + order_status + ", order_amount=" + order_amount + ", order_delivery_date="
				+ order_delivery_date + ", remark=" + remark + ", user2=" + user2 + ", useraddress=" + useraddress
				+ "]";
	}

}
