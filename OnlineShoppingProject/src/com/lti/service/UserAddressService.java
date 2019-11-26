package com.lti.service;

import java.util.List;

import com.lti.model.User;
import com.lti.model.UserAddress;

public interface UserAddressService {

	public UserAddress addUser(UserAddress ua);
	public UserAddress updateUser(UserAddress ua);
	public UserAddress findById(int id);
//	public UserAddress findByEmail(String email);
	public List<UserAddress> findAllUserAddresses();
	public UserAddress findByUser(User u);
}
