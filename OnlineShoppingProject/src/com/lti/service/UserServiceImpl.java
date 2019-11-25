package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.Retailer;
import com.lti.model.User;
import com.lti.repository.UserRepository;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository userRepository;

	@Override
	public User addUser(User u) {
		return userRepository.addUser(u);
	}

	@Override
	public User updateUser(User u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findById(int id) {
		return userRepository.findById(id);
	}

	@Override
	public User findByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}
	public User login(User u) {
		User userToBeReturned=null;
		User uDB= userRepository.findByEmail(u.getUser_email());
		
		if(uDB==null)
		{
			
		}
		else if(uDB.getUser_email().equals(u.getUser_email()))
		{
			userToBeReturned = uDB;
		}
		else
		{
			
		}
		return userToBeReturned;
	}

}
