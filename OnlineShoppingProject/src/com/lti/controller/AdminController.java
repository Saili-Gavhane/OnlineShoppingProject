package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.lti.model.Admin;
import com.lti.service.AdminService;
@Controller
public class AdminController {
	@Autowired
	AdminService service;
	
	@RequestMapping(value="/addAdmin",method=RequestMethod.POST)
	public ModelAndView addCustomer(String name, String email,String password)
	{
		Admin incomingCustomer = new Admin();
		incomingCustomer.setAdmin_name(name);
		incomingCustomer.setAdmin_email(email);
		incomingCustomer.setAdmin_password(password);
		Admin c = service.addUser(incomingCustomer);
		ModelAndView model = null;
		if(c==null)
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
