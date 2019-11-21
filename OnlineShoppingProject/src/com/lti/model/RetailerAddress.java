package com.lti.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="retailer_address")
public class RetailerAddress {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "retaileraddress_seq")
	@SequenceGenerator(sequenceName = "retaileraddress_seq", name = "retaileraddress_seq", allocationSize = 1)
	int retailer_address_id;
	String addressline_1;
	String addressline_2;
	String city;
	String state;
	String country;
	int zipcode;
	 @ManyToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name="retailer_id", nullable=false)
	    private Retailer retailer;
	public RetailerAddress() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RetailerAddress(int retailer_address_id, String addressline_1, String addressline_2, String city,
			String state, String country, int zipcode, Retailer retailer) {
		super();
		this.retailer_address_id = retailer_address_id;
		this.addressline_1 = addressline_1;
		this.addressline_2 = addressline_2;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zipcode = zipcode;
		this.retailer = retailer;
	}
	public int getRetailer_address_id() {
		return retailer_address_id;
	}
	public void setRetailer_address_id(int retailer_address_id) {
		this.retailer_address_id = retailer_address_id;
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
	public Retailer getRetailer() {
		return retailer;
	}
	public void setRetailer(Retailer retailer) {
		this.retailer = retailer;
	}
	@Override
	public String toString() {
		return "RetailerAddress [retailer_address_id=" + retailer_address_id + ", addressline_1=" + addressline_1
				+ ", addressline_2=" + addressline_2 + ", city=" + city + ", state=" + state + ", country=" + country
				+ ", zipcode=" + zipcode + ", retailer=" + retailer + "]";
	}
	 
	 

}
