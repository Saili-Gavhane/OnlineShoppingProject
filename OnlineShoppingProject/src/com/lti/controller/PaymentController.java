package com.lti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PaymentController {
	
	
	@RequestMapping(value="/payment",method=RequestMethod.GET)
	public ModelAndView payment(@RequestParam String amount)
	{
		
		float f= Float.parseFloat(amount);
		int a = (int) f;
		
		ModelAndView model=new ModelAndView("transaction");
		model.addObject("amount", a);
		return model;
	}
	
	@RequestMapping(value="/success",method=RequestMethod.GET)
	public ModelAndView paymentSuccess()
	{
		ModelAndView model=new ModelAndView("success");
		return model;
	}
	
	@RequestMapping(value="/failure",method=RequestMethod.GET)
	public ModelAndView paymentFailure()
	{
		ModelAndView model=new ModelAndView("failure");
		return model;
	}
	
	

}
