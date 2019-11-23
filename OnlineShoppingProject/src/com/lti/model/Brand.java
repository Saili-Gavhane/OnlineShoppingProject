package com.lti.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name="brand1")
public class Brand {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "brandseq1")
	@SequenceGenerator(sequenceName = "brandseq1", name = "brandseq1", allocationSize = 1)
	int brand_id;
	String brand_name;
	
	@OneToMany(mappedBy="brand1")
	private Set<Product> product;
	
	
	public Brand() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Brand(int brand_id, String brand_name, Product product) {
		super();
		this.brand_id = brand_id;
		this.brand_name = brand_name;
		
		
	}

	public int getBrand_id() {
		return brand_id;
	}
	public void setBrand_id(int brand_id) {
		this.brand_id = brand_id;
	}
	public String getBrand_name() {
		return brand_name;
	}
	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
	}


	@Override
	public String toString() {
		return "Brand [brand_id=" + brand_id + ", brand_name=" + brand_name + "]";
	}
	
	

}
