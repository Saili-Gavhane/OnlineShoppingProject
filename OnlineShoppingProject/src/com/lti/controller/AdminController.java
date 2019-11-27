package com.lti.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lti.model.Admin;
import com.lti.model.Retailer;
import com.lti.service.AdminService;
import com.lti.service.RetailerService;
@Controller
public class AdminController {
	@Autowired
	AdminService service;
	@Autowired
	RetailerService retailerService;
	@PersistenceContext
	EntityManager em;
	
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
	
	@RequestMapping(value="/AdminLogin",method=RequestMethod.POST)
	public ModelAndView numberCheck (@RequestParam String username, @RequestParam String password)
	{
		Admin incomingAdmin = new Admin();
		incomingAdmin.setAdmin_email(username);
		incomingAdmin.setAdmin_password(password);
		
		Admin a = service.login(incomingAdmin);
		List<Retailer> listRetailer=retailerService.findAllRetailers();
		ModelAndView model = null;
		if(a==null)
		{
			model = new  ModelAndView("loginfailed");
		}
		else
		{
			model = new  ModelAndView("AdminLoginSuccess");
			model.addObject("listRetailer", listRetailer);
		}
		
		return model;
	}
	@RequestMapping(value = "/activateRetailer",method =RequestMethod.GET)
	@Transactional
	public ModelAndView ActivateRetailer(@RequestParam int id,@RequestParam String status)
	{
		Retailer r=retailerService.findById(id);
		 r=retailerService.updateRetailer(r);
		 List<Retailer> listRetailer=retailerService.findAllRetailers();
			ModelAndView model = null;
			if(listRetailer==null)
			{
				model = new  ModelAndView("AdminLoginSuccess");
				//model = new  ModelAndView("loginfailed");
			}
			else
			{
				model = new  ModelAndView("viewRetailers");
				model.addObject("listRetailer", listRetailer);
			}
			return model;
	}
}
