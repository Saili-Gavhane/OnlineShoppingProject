package com.lti.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lti.model.Item;
import com.lti.model.OrderItems;
import com.lti.model.Orders;
import com.lti.model.Product;
import com.lti.model.User;
import com.lti.model.UserAddress;
import com.lti.service.OrderItemsService;
import com.lti.service.OrdersService;
import com.lti.service.ProductService;
import com.lti.service.UserAddressService;
@Controller
public class OrderController {
	@Autowired
	ProductService productService;
	@Autowired
	OrdersService ordersService;
	@Autowired
	OrderItemsService orderItemsService;
	@Autowired
	UserAddressService userAddressService;
	
	@RequestMapping(value = "placeOrder",method = RequestMethod.GET)
	public ModelAndView placeOrder(HttpSession session,@RequestParam String total)
	{
		List<Item> cart = (List<Item>) session.getAttribute("cart");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		User u = (User)session.getAttribute("user");
		System.out.println("Fetched from session:"+u.getUser_id());
		UserAddress u1 = userAddressService.findByUser(u);
	    Orders order = new Orders();
	    order.setUser2(u);
	    order.setUseraddress(u1);
	    order.setOrder_ship_name(u.getFirst_name()+u.getLast_name());
	    order.setOrder_date(dtf.format(now));
	    order.setDelivery_charges(53.00f);
	    //int total1 = Integer.parseInt(total);
	  
	    order.setOrder_amount(total);
	    order.setOrder_status("Not delivered");
	    order.setRemark("");
	    order.setOrder_delivery_date(dtf.format(now)+5);
	    order = ordersService.addOrders(order);
	    	
		Iterator<Item> iterator=cart.iterator();
		for(Item i:cart)
		{
			Product productInCart=i.getProduct();
			int q = i.getQuantity();
			
			OrderItems orderitem = new OrderItems();
			orderitem.setOrders(order);
			orderitem.setProduct(productInCart);
			orderitem.setQuantity(q);
			orderitem.setTotal_price(productInCart.getProduct_base_price() *q);
			orderItemsService.addOrderItems(orderitem);
		}
		
		ModelAndView model = null;
		
		
			model= new ModelAndView("addsuccess");
	      return model;
	}
	

}
