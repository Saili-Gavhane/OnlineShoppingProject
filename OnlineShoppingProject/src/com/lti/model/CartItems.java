package com.lti.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
}
