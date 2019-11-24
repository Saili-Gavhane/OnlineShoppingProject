package com.lti.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	int order_ship_address_id;
	String order_date;
	float delivery_charges;
	int order_tracking_no;
	String order_status;
	float order_amount;
	String order_delivery_date;
	String remark;

}
