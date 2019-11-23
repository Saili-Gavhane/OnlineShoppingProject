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
@Table(name="category1")
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "categoryseq1")
	@SequenceGenerator(sequenceName = "categoryseq1", name = "categoryseq1", allocationSize = 1)
	int category_id;
	String category_name;
	@OneToMany(mappedBy="category")
	private Set<Product> product;
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Category(int category_id, String category_name,Product product) {
		super();
		this.category_id = category_id;
		this.category_name = category_name;
	}
	public int getCategory_id() {
		return category_id;
	}
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
	public String getCategory_name() {
		return category_name;
	}
	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}
	@Override
	public String toString() {
		return "Category [category_id=" + category_id + ", category_name=" + category_name + "]";
	}
	

}
