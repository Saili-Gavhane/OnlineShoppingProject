package com.lti.controller;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
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
	@Autowired
	ServletContext servletContext;
	
	@RequestMapping(value="/addProduct",method=RequestMethod.POST)
	@ResponseBody
	public ModelAndView addProduct(@RequestParam String name,@RequestParam float base_price,@RequestParam String category,@RequestParam String description,@RequestParam String brand_name,@RequestParam int product_count,@RequestParam("image") MultipartFile m)
	{
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		Product incomingProduct = new Product();
		Stock stock = new Stock();
		
		Retailer r1=retailerService.findById(1);
		System.out.println(r1);
		Category category1=categoryService.findByName(category);
		Brand brand = brandService.findByName(brand_name);
		
		incomingProduct.setProduct_name(name);
		incomingProduct.setProduct_base_price(base_price);
		incomingProduct.setDescription(description);
		
		String path ="D:/ShopDrop_Images/";
		
		String finalpath = path + m.getOriginalFilename();
		
		try {
			m.transferTo(new File(finalpath));
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		incomingProduct.setProduct_image(finalpath);
		incomingProduct.setProduct_update_date(dtf.format(now)); 
		incomingProduct.setApproval_status("Unapproved");
		incomingProduct.setBrand1(brand);
		incomingProduct.setCategory(category1);
		incomingProduct.setRetailer(r1);
		Product p = productService.addProduct(incomingProduct);
		System.out.println(p);
		Product p1 = productService.findById(p.getProduct_id());
		stock.setProduct_count(product_count);
		stock.setProduct(p1);
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
	@RequestMapping(value="/viewProduct",method=RequestMethod.GET)
	public ModelAndView findAllProducts()
	{
		List<Product> listProduct = productService.findAllProducts();
		ModelAndView model = null;
		if(listProduct==null)
		{
			model = new  ModelAndView("loginfailed");
		}
		else
		{
			model = new  ModelAndView("viewProduct");
			model.addObject("listProduct", listProduct);
		}
		return model;
	}

}
