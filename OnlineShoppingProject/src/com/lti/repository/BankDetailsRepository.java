package com.lti.repository;

import java.util.List;

import com.lti.model.BankDetails;

public interface BankDetailsRepository {
	public BankDetails addBankDetails(BankDetails b);
	public BankDetails updateBankDetails(BankDetails b);
	public BankDetails findById(int id);
	//public Retailer findByEmail(String email);
	public List<BankDetails> findAllBankDetails();

}
