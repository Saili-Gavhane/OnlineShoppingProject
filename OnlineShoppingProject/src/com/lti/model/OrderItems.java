package com.lti.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="order_items")
public class OrderItems {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_itemlist_seq")
	@SequenceGenerator(sequenceName = "order_itemlist_seq", name = "order_itemlist_seq", allocationSize = 1)
	int order_item_id;
	int quantity;
	float total_price;

}
