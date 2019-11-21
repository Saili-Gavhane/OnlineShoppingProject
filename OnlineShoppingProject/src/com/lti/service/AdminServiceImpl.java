package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.Admin;
import com.lti.repository.AdminRepository;
@Service("adminService")
public class AdminServiceImpl implements AdminService {
	@Autowired
	AdminRepository adminRepository;
	@Override
	public Admin addUser(Admin a) {
		
		return adminRepository.addUser(a);
	}

	@Override
	public Admin updateUser(Admin a) {
		// TODO Auto-generated method stub
		return adminRepository.updateUser(a);
	}

	@Override
	public Admin findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Admin findByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Admin> findAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

}
