package com.niit.dao;

import java.util.List;

import com.niiit.model.Product;



public interface ProductDAO {
	// declare all CRUD operation 
	
	public boolean save(Product product);
	public boolean update(Product product);
	public boolean delete(Product product);
	
	public Product get(String id);
	
	public List<Product> list();

}
