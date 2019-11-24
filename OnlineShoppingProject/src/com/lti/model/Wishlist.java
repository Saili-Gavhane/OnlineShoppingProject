package com.lti.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="wishlist")
public class Wishlist {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_address_seq")
	@SequenceGenerator(sequenceName = "user_address_seq", name = "user_address_seq", allocationSize = 1)
	int wishlist_id;

}
