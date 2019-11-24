package com.lti.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="user_address")
public class UserAddress {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_address_seq")
	@SequenceGenerator(sequenceName = "user_address_seq", name = "user_address_seq", allocationSize = 1)
	int address_id;
	String addressline_1;
	String addressline_2;
	String city;
	String state;
	String country;
	int zipcode;

}
