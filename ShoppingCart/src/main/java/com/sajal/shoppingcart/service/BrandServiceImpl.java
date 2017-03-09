package com.sajal.shoppingcart.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sajal.shoppingcart.dao.BrandDAO;
import com.sajal.shoppingcart.model.Brand;

@Service
public class BrandServiceImpl implements BrandService {

	private BrandDAO brandDAO;

	public void setBrandDAO(BrandDAO brandDAO) {
		this.brandDAO = brandDAO;
	}

	@Transactional
	public List<Brand> brand() {
		brandDAO.brand();
		return null;
	}

	@Transactional
	public boolean save(Brand brand) {
		brandDAO.save(brand);
		return false;
	}

	@Transactional
	public boolean update(Brand brand) {
		brandDAO.update(brand);
		return false;
	}

	@Transactional
	public boolean delete(String id) {
		brandDAO.delete(id);
		return false;
	}

	@Transactional
	public boolean delete(Brand brand) {
		brandDAO.delete(brand);
		return false;
	}

	@Transactional
	public Brand getBrandByID(String id) {
		brandDAO.getBrandByID(id);
		return null;
	}

	@Transactional
	public Brand getBrandByName(String name) {
		brandDAO.getBrandByName(name);
		return null;
	}

}
