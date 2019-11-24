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

}
