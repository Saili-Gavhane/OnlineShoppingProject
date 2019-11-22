package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lti.model.Retailer;
import com.lti.model.RetailerAddress;
import com.lti.service.RetailerAddressService;
import com.lti.service.RetailerService;
@Controller
public class RetailerAddressController {
	@Autowired
	RetailerAddressService retailerAddressService;
	@Autowired
	RetailerService retailerService;
	@RequestMapping(value="/addRetailerAddress",method=RequestMethod.POST)
	public ModelAndView addRetailerAddress(@RequestParam String address1,@RequestParam String address2, @RequestParam String city,@RequestParam String state,@RequestParam int zipcode, @RequestParam String country,@RequestParam int id)
	{
		Retailer r1 = new Retailer();
		r1 = retailerService.findById(id);
		RetailerAddress address = new RetailerAddress();
		address.setAddressline_1(address1);
		address.setAddressline_2(address2);
		address.setCity(city);
		address.setState(state);
		address.setZipcode(zipcode);
		address.setCountry(country);
		address.setRetailer(r1);
		
		RetailerAddress rd = retailerAddressService.addRetailerAddress(address);
		
		
		
		ModelAndView model = null;
		if(rd==null)
		{
			model = new  ModelAndView("addfailed");
		}
		else
		{
			model = new  ModelAndView("addsuccess");
			
		}
		
		return model;
	}

}
