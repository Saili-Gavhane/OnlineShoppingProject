package com.lti.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="cart")
public class Cart 
{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cart_seq")
	@SequenceGenerator(sequenceName = "cart_seq", name = "cart_seq", allocationSize = 1)
	int cart_id;
	int no_of_products;
	float cart_amount;
}
