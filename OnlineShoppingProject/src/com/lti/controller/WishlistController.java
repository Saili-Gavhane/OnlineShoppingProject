package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lti.service.ProductService;
import com.lti.service.WishlistItemsService;
import com.lti.service.WishlistService;

@Controller
public class WishlistController {
	@Autowired
	ProductService productService;
	
	@Autowired
	WishlistService wishlistService;
	
	@Autowired
	WishlistItemsService wishlistItemsService;
	
	@RequestMapping(value="/addToWishlist",method=RequestMethod.GET)
	public ModelAndView getId (@RequestParam int id)
	{
		ModelAndView model = null;
		return model;
	}

}
