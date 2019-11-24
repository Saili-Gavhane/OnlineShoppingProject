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

}
