package com.lti.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name="user_id", nullable=false)
    private User user;
	public UserAddress() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserAddress(int address_id, String addressline_1, String addressline_2, String city, String state,
			String country, int zipcode, User user) {
		super();
		this.address_id = address_id;
		this.addressline_1 = addressline_1;
		this.addressline_2 = addressline_2;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zipcode = zipcode;
		this.user = user;
	}
	public int getAddress_id() {
		return address_id;
	}
	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}
	public String getAddressline_1() {
		return addressline_1;
	}
	public void setAddressline_1(String addressline_1) {
		this.addressline_1 = addressline_1;
	}
	public String getAddressline_2() {
		return addressline_2;
	}
	public void setAddressline_2(String addressline_2) {
		this.addressline_2 = addressline_2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "UserAddress [address_id=" + address_id + ", addressline_1=" + addressline_1 + ", addressline_2="
				+ addressline_2 + ", city=" + city + ", state=" + state + ", country=" + country + ", zipcode="
				+ zipcode + ", user=" + user + "]";
	}
	

}
