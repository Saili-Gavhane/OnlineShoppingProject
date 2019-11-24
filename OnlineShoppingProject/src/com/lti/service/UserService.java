package com.lti.service;

import java.util.List;

import com.lti.model.User;

public interface UserService {

	public User addUser(User u);
	public User updateUser(User u);
	public User findById(int id);
	public User findByEmail(String email);
	public List<User> findAllUsers();
}