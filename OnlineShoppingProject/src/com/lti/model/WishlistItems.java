package com.lti.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name="wishlist_items")
public class WishlistItems {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "wishlist_items_seq")
	@SequenceGenerator(sequenceName = "wishlist_items_seq", name = "wishlist_items_seq", allocationSize = 1)
	int wishlist_item_id;
	String wishlist_date;

}
