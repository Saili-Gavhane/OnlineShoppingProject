package com.lti.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="user_details")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq")
	@SequenceGenerator(sequenceName = "user_seq", name = "user_seq", allocationSize = 1)
	int user_id;
	String first_name;
	String last_name;
	String user_email;
	String user_password;
	String mobileno;
	@OneToMany(mappedBy="user",fetch=FetchType.LAZY)
    private Set<UserAddress> useraddress;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int user_id, String first_name, String last_name, String user_email, String user_password,
			String mobileno) {
		super();
		this.user_id = user_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.user_email = user_email;
		this.user_password = user_password;
		this.mobileno = mobileno;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", first_name=" + first_name + ", last_name=" + last_name + ", user_email="
				+ user_email + ", user_password=" + user_password + ", mobileno=" + mobileno + "]";
	}
	

}
