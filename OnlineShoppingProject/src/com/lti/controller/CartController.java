package com.lti.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.lti.model.Item;
import com.lti.model.Product;
import com.lti.model.User;
import com.lti.service.ProductService;

@Controller
public class CartController {
////////////////////////////following function is written by nishant
	@Autowired
	ProductService productService;
	
	@RequestMapping(value = "addToCart",method = RequestMethod.GET)
	public ModelAndView addToCart(@RequestParam int pid,@RequestParam int q,HttpSession session,@SessionAttribute("User")  User u)
	{
		System.out.println(u);
		boolean isInCart=false;
		Item foundInCart=null;
		if(session.getAttribute("cart")==null)
		{
			List<Item> cart = new ArrayList<Item>();
			cart.add(new Item(productService.findById(pid),q));
			session.setAttribute("cart", cart);
			
			
		}else {
		List<Item> cart = (List<Item>) session.getAttribute("cart");
		
		Iterator<Item> iterator=cart.iterator();
		for(Item i:cart)
		{
			Product productInCart=i.getProduct();
			
			Product productToBeAdded=productService.findById(pid);
			
			if(productInCart.getProduct_id()==productToBeAdded.getProduct_id())
			{
				foundInCart=i;
				isInCart=true;
			}
			
			
		}
		
		if(isInCart&&foundInCart!=null)
		{
			
			int oldQty=foundInCart.getQuantity();
			int newQty=oldQty+q;
			
			cart.remove(foundInCart);
			cart.add(new Item(productService.findById(foundInCart.getProduct().getProduct_id()), newQty));
		}
		else
		{
			cart.add(new Item(productService.findById(pid), q));
		}
		
			
		}
		ModelAndView model=new ModelAndView("showCart");

		return  model;
		
	
	}
	
	@RequestMapping(value = "removeFromCart",method = RequestMethod.GET)
	public ModelAndView buy(@RequestParam int id,HttpSession session)
	{
		boolean isInCart=false;
		Item foundInCart=null;
		List<Item> cart = (List<Item>) session.getAttribute("cart");
		
		Iterator<Item> iterator=cart.iterator();
		for(Item i:cart)
		{
			Product productInCart=i.getProduct();
			
			Product productToBeRemove=productService.findById(id);
			
			if(productInCart.getProduct_id()==productToBeRemove.getProduct_id())
			{
				foundInCart=i;
				isInCart=true;
			}
			
			
		}
		
		if(isInCart&&foundInCart!=null)
		{
			
			
			cart.remove(foundInCart);
		}
		
		
		ModelAndView model=new ModelAndView("showCart");

		return  model;
		
	}
	
	
	
	//////////////////////////////////////////
	
	
	
	
	
	
}
		


