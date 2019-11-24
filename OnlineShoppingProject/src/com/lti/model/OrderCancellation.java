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
}
