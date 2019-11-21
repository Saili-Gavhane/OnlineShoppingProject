package com.lti.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.BankDetails;
import com.lti.repository.BankDetailsRepository;

@Service("bankDetailsService")
public class BankDetailsServiceImpl implements BankDetailsService {
	@Autowired
	BankDetailsRepository bankDetailsRepository;
	
	
	@Transactional
	public BankDetails addBankDetails(BankDetails a) {
		// TODO Auto-generated method stub
		return bankDetailsRepository.addBankDetails(a);
	}

	@Override
	public BankDetails updateBankDetails(BankDetails a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BankDetails findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BankDetails findByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BankDetails> findAllBankDetails() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
