package com.lti.service;

import java.util.List;

import com.lti.model.BankDetails;

public interface BankDetailsService {
	public BankDetails addBankDetails(BankDetails a);
	public BankDetails updateBankDetails(BankDetails a);
	public BankDetails findById(int id);
	public BankDetails findByEmail(String email);
	public List<BankDetails> findAllBankDetails();
}
