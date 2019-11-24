package com.lti.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="wishlist")
public class Wishlist {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "wishlist_seq")
	@SequenceGenerator(sequenceName = "wishlist_seq", name = "wishlist_seq", allocationSize = 1)
	int wishlist_id;
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="user_id")
	private User user;
	
	@OneToMany(mappedBy="wishlist",fetch=FetchType.LAZY)
    private Set<WishlistItems> wishlistitems;
}
