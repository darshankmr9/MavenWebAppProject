package com.sajal.shoppingcart.service;

import java.util.List;

import com.sajal.shoppingcart.model.Product;

public interface ProductService {

	public List<Product> product(); // get all products

	public boolean save(Product product); // create product

	public boolean update(Product product); // update product

	public boolean delete(String id); // delete product by id

	public boolean delete(Product product);// delete product by product

	public Product getProductByID(String id); // get() product by id

	public Product getProductByName(String name); // get() product by name
	
}
