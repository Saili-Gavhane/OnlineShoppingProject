package com.lti.repository;

import java.util.List;

import com.lti.model.User;
import com.lti.model.UserAddress;

public interface UserAddressRepository {
	public UserAddress addUser(UserAddress ua);
	public UserAddress updateUser(UserAddress ua);
	public UserAddress findById(int id);
	public List<UserAddress> findAllUserAddresses();
	public UserAddress findByUser(User u);

}
