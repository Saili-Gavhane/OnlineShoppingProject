package com.lti.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.lti.model.Retailer;
import com.lti.model.User;
import com.lti.model.UserAddress;
import com.lti.service.UserAddressService;
import com.lti.service.UserService;

@Controller
@SessionAttributes("User")
public class UserController {
	@Autowired
	UserService userService;
	@Autowired
	UserAddressService userAddressService;
	
	@ModelAttribute("User")
	public User setUpUserForm()
	{
		return new User();
	}
	
	@RequestMapping(value="/addUser",method=RequestMethod.POST)
	public ModelAndView addRetailer(@RequestParam String firstname,@RequestParam String lastname,@RequestParam String email,@RequestParam String mobileno,@RequestParam String address1,@RequestParam String address2,@RequestParam String city,@RequestParam String state,@RequestParam int zipcode,@RequestParam String country,@RequestParam String password )
	{   User user = new User();
		user.setFirst_name(firstname);
		user.setLast_name(lastname);
		user.setUser_email(email);
		user.setMobileno(mobileno);
		user.setUser_password(password);
		
		UserAddress u = new UserAddress();
		u.setAddressline_1(address1);
		u.setAddressline_2(address2);
		u.setCity(city);
		u.setState(state);
		u.setCountry(country);
		u.setZipcode(zipcode);
		u.setUser(user);
	    u = userAddressService.addUser(u);
		
		ModelAndView model = null;
		
		if(u==null)
		{
			model = new  ModelAndView("addfailed");
		}
		else
		{
			model = new  ModelAndView("addsuccess");
		}
		return model;
	}
	@RequestMapping(value="/UserLogin",method=RequestMethod.POST)
	public ModelAndView UserLogin (@RequestParam String username, @RequestParam String password,HttpSession request)
	{
		User incomingUser = new User();
		incomingUser.setUser_email(username);
		incomingUser.setUser_password(password);
		
		User a = userService.login(incomingUser);
		request.setAttribute("user", a);
		

		ModelAndView model = null;
		if(a==null)
		{
			model = new  ModelAndView("loginfailed");
		}
		else
		{
			model = new  ModelAndView("userLoginSuccess");
			model.addObject("user",a);
		}
		
		return model;
	}
	@RequestMapping(value="/userProfile",method=RequestMethod.GET)
	public ModelAndView getId (@RequestParam int id)
	{
		User u = userService.findById(id);
		ModelAndView model = null;
		if(u==null)
		{
			model = new  ModelAndView("loginfailed");
		}
		else
		{
			model = new  ModelAndView("userProfile");
			model.addObject("user",u);
		}
		
		return model;
	}
	/*@RequestMapping(value="/logout",method=RequestMethod.POST)
	public ModelAndView UserLogout (HttpSession session)
	{
     	
		ModelAndView model = null;
		if(u==null)
		{
			model = new  ModelAndView("loginfailed");
		}
		else
		{
			model = new  ModelAndView("userLoginSuccess");
			model.addObject("user",u);
		}
		
		return model;
	}*/

}
