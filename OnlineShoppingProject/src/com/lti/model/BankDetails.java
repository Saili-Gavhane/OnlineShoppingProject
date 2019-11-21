package com.lti.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="bank_details")
public class BankDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bankdetails_seq")
	@SequenceGenerator(sequenceName = "bankdetails_seq", name = "bankdetails_seq", allocationSize = 1)
	int bank_details_id;
	String account_holder_name;
	int account_no;
	String ifsc_code;
	String bank_name;
	String bank_branch;
	
	@OneToOne(mappedBy="bankdetails")
	private Retailer retailer;
	
	public BankDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Retailer getRetailer() {
		return retailer;
	}
	public void setRetailer(Retailer retailer) {
		this.retailer = retailer;
	}
	public BankDetails(int bank_details_id, String account_holder_name, int account_no, String ifsc_code,String bank_name,
			String bank_branch, Retailer retailer) {
		super();
		this.bank_details_id = bank_details_id;
		this.account_holder_name = account_holder_name;
		this.account_no = account_no;
		this.ifsc_code = ifsc_code;
		this.bank_name = bank_name;
		this.bank_branch = bank_branch;
		this.retailer = retailer;
	}
	public int getBankdetails_id() {
		return bank_details_id;
	}
	public void setBankdetails_id(int bank_details_id) {
		this.bank_details_id = bank_details_id;
	}
	public String getAccount_holder_name() {
		return account_holder_name;
	}
	public void setAccount_holder_name(String account_holder_name) {
		this.account_holder_name = account_holder_name;
	}
	public int getAccount_no() {
		return account_no;
	}
	public void setAccount_no(int account_no) {
		this.account_no = account_no;
	}
	public String getIfsc_code() {
		return ifsc_code;
	}
	public void setIfsc_code(String ifsc_code) {
		this.ifsc_code = ifsc_code;
	}
	public String getBank_branch() {
		return bank_branch;
	}
	public void setBank_branch(String bank_branch) {
		this.bank_branch = bank_branch;
	}
	public String getBank_name() {
		return bank_name;
	}
	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}
	@Override
	public String toString() {
		return "BankDetails [bank_details_id=" + bank_details_id + ", account_holder_name=" + account_holder_name
				+ ", account_no=" + account_no + ", ifsc_code=" + ifsc_code + ", bank_name=" + bank_name
				+ ", bank_branch=" + bank_branch + ", retailer=" + retailer + "]";
	}
	
	
}
