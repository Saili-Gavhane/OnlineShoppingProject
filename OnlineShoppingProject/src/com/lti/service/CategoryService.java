package com.lti.service;

import java.util.List;

import com.lti.model.Category;

public interface CategoryService {
	public Category addCategory(Category a);
	public Category updateCategory(Category a);
	public Category findById(int id);
	public Category findByName(String name);
	//public Category findByEmail(String email);
	public List<Category> findAllCategories();

}
