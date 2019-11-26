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
@Table(name="cart")
public class Cart 
{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cart_seq")
	@SequenceGenerator(sequenceName = "cart_seq", name = "cart_seq", allocationSize = 1)
	int cart_id;
	int no_of_products;
	float cart_amount;
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="user_id")
	private User user1;
	
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cart(int cart_id, int no_of_products, float cart_amount, User user1) {
		super();
		this.cart_id = cart_id;
		this.no_of_products = no_of_products;
		this.cart_amount = cart_amount;
		this.user1 = user1;
	}

	public int getCart_id() {
		return cart_id;
	}

	public void setCart_id(int cart_id) {
		this.cart_id = cart_id;
	}

	public int getNo_of_products() {
		return no_of_products;
	}

	public void setNo_of_products(int no_of_products) {
		this.no_of_products = no_of_products;
	}

	public float getCart_amount() {
		return cart_amount;
	}

	public void setCart_amount(float cart_amount) {
		this.cart_amount = cart_amount;
	}

	public User getUser1() {
		return user1;
	}

	public void setUser1(User user1) {
		this.user1 = user1;
	}
	
	
}
