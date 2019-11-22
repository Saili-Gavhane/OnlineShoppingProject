package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lti.model.Brand;
import com.lti.model.Category;
import com.lti.model.Product;
import com.lti.model.Retailer;
import com.lti.model.Stock;
import com.lti.service.BrandService;
import com.lti.service.CategoryService;
import com.lti.service.ProductService;
import com.lti.service.RetailerService;
import com.lti.service.StockService;
@Controller
public class ProductController {
	@Autowired
	ProductService productService;
	@Autowired
	BrandService brandService;
	@Autowired
	CategoryService categoryService;
	@Autowired
	RetailerService retailerService;
	@Autowired
	StockService stockService;
	
	@RequestMapping(value="/addProduct",method=RequestMethod.POST)
	public ModelAndView addProduct(@RequestParam String name,@RequestParam float base_price,@RequestParam String category,@RequestParam String description,@RequestParam String brand_name,@RequestParam int product_count)
	{
		Product incomingProduct = new Product();
		Category category1 = new Category();
		Brand brand = new Brand();
		Stock stock = new Stock();
		
		Retailer r1 = new Retailer();
		r1=retailerService.findById(1);
		
		category1.setCategory_name(category);
		
		
		brand.setBrand_name(brand_name);
		
		//int brand_id = b.getBrand_id();
		incomingProduct.setProduct_name(name);
		incomingProduct.setProduct_base_price(base_price);
		incomingProduct.setDescription(description);
		incomingProduct.setProduct_image("");
		incomingProduct.setProduct_update_date("12-Jun-76");
		incomingProduct.setApproval_status("approved");
		incomingProduct.setBrand1(brand);
		incomingProduct.setCategory(category1);
		incomingProduct.setRetailer(r1);
		Product p = productService.addProduct(incomingProduct);
		
		stock.setProduct_count(product_count);
		stock.setProduct(p);
		Stock s = stockService.addStock(stock);
		
		
		ModelAndView model = null;
		if(p==null)
		{
			model = new  ModelAndView("addfailed");
		}
		else
		{
			model = new  ModelAndView("addsuccess");
		}
		
		return model;
	}
	@RequestMapping(value="/findCategory",method=RequestMethod.POST)
	public ModelAndView findCategory(String name)
	{
		Category ct = categoryService.findByName(name);
		ModelAndView model = null;
		if(ct==null)
		{
			model = new  ModelAndView("addfailed");
		}
		else
		{   
			model = new  ModelAndView("findsuccess");
			model.addObject("category",ct);
		}
		
		return model;
	}
	
	@RequestMapping(value="/findBrand",method=RequestMethod.POST)
	public ModelAndView findBrand(String name)
	{
		Brand bd = brandService.findByName(name);
		ModelAndView model = null;
		if(bd==null)
		{
			model = new  ModelAndView("addfailed");
		}
		else
		{   
			model = new  ModelAndView("findbrandsuccess");
			model.addObject("brand",bd);
		}
		
		return model;
	}

}
