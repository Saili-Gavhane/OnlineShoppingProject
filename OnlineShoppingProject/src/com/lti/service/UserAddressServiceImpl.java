package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.User;
import com.lti.model.UserAddress;
import com.lti.repository.UserAddressRepository;

@Service("userAddressService")
public class UserAddressServiceImpl implements UserAddressService {
	@Autowired
	UserAddressRepository userAddressRepository;

	@Override
	public UserAddress addUser(UserAddress ua) {
		return userAddressRepository.addUser(ua);
	}

	@Override
	public UserAddress updateUser(UserAddress ua) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserAddress findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserAddress> findAllUserAddresses() {
		// TODO Auto-generated method stub
		return null;
	}
	public UserAddress findByUser(User u)
	{
		return userAddressRepository.findByUser(u);
	}

}
