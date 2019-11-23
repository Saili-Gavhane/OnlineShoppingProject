package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lti.model.BankDetails;

import com.lti.model.Retailer;
//import com.lti.model.RetailerAddress;

import com.lti.service.BankDetailsService;
import com.lti.service.RetailerAddressService;
import com.lti.service.RetailerService;
@Controller
public class RetailerController {
	@Autowired
	BankDetailsService bankDetailsService;
	@Autowired
	RetailerAddressService retailerAddressService;

	@Autowired
	RetailerService retailerService;
	
	
	@RequestMapping(value="/addRetailer",method=RequestMethod.POST)
	public ModelAndView addRetailer(@RequestParam String name,@RequestParam String email,@RequestParam String GSTNo,@RequestParam String mobile_no,@RequestParam String PAN_no,@RequestParam String aadhar_no,String password,@RequestParam String account_no,@RequestParam String holder_name,@RequestParam String bank_name,@RequestParam String code,@RequestParam String branch)
	{
			
		Retailer retailer = new Retailer();
		BankDetails bank = new BankDetails();
		bank.setAccount_holder_name(holder_name);
		bank.setAccount_no(account_no);
		bank.setBank_name(bank_name);
		bank.setIfsc_code(code);
		bank.setBank_branch(branch);
		//BankDetails b = bankDetailsService.addBankDetails(bank);
		//RetailerAddress address = new RetailerAddress();
		
		
		retailer.setRetailer_name(name);
		retailer.setRetailer_email(email);
		retailer.setGst_no(GSTNo);
		retailer.setRetailer_mobileno(mobile_no);
		retailer.setAadhar_no(aadhar_no);
		retailer.setPan_no(PAN_no);
		retailer.setRetailer_password(password);
		retailer.setRemark("");
		retailer.setBankdetails(bank);
		Retailer r = retailerService.addRetailer(retailer);
		
		/*address.setAddressline_1(address1);
		address.setAddressline_2(address2);
		address.setCity(city);
		address.setState(state);
		address.setZipcode(zipcode);
		address.setCountry(country);
		address.setRetailer(r);
		
		RetailerAddress rd = retailerAddressService.addRetailerAddress(address);*/
		
		
		
		ModelAndView model = null;
		if(r==null)
		{
			model = new  ModelAndView("addfailed");
		}
		else
		{
			model = new  ModelAndView("retailerAddress");
			model.addObject("retailer",r);
		}
		
		return model;
	}
	@RequestMapping(value="/RetailerLogin",method=RequestMethod.POST)
	public ModelAndView RetailerLogin (@RequestParam String username, @RequestParam String password)
	{
		Retailer incomingRetailer = new Retailer();
		incomingRetailer.setRetailer_email(username);
		incomingRetailer.setRetailer_password(password);
		
		Retailer a = retailerService.login(incomingRetailer);
		ModelAndView model = null;
		if(a==null)
		{
			model = new  ModelAndView("loginfailed");
		}
		else
		{
			model = new  ModelAndView("retailerLoginSuccess");
			model.addObject("retailer",a);
		}
		
		return model;
	}
	@RequestMapping(value="/Id",method=RequestMethod.POST)
	public ModelAndView getId (@RequestParam int id)
	{
		Retailer r = retailerService.findById(id);
		ModelAndView model = null;
		if(r==null)
		{
			model = new  ModelAndView("loginfailed");
		}
		else
		{
			model = new  ModelAndView("addProduct");
			model.addObject("retailer",r);
		}
		
		return model;
	}
}


