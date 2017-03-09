package com.sajal.shoppingcart.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sajal.shoppingcart.dao.ProductDAO;
import com.sajal.shoppingcart.model.Product;

@Service
public class ProductServiceImpl implements ProductService {

	private ProductDAO productDAO;

	public void setProductDAO(ProductDAO productDAO) {
		this.productDAO = productDAO;
	}

	@Transactional
	public List<Product> product() {
		productDAO.product();
		return null;
	}

	@Transactional
	public boolean save(Product product) {
		productDAO.save(product);
		return false;
	}

	@Transactional
	public boolean update(Product product) {
		productDAO.update(product);
		return false;
	}

	@Transactional
	public boolean delete(String id) {
		productDAO.delete(id);
		return false;
	}

	@Transactional
	public boolean delete(Product product) {
		productDAO.delete(product);
		return false;
	}

	@Transactional
	public Product getProductByID(String id) {
		productDAO.getProductByID(id);
		return null;
	}

	@Transactional
	public Product getProductByName(String name) {
		productDAO.getProductByID(name);
		return null;
	}

}
