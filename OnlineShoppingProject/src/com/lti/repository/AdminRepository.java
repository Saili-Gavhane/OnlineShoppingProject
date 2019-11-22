package com.lti.repository;

import java.util.List;

import com.lti.model.Admin;

public interface AdminRepository {
	public Admin addUser(Admin a);
	public Admin updateUser(Admin a);
	public Admin findById(int id);
	public Admin findByEmail(String email);
	public List<Admin> findAllUsers();
	

}
