package com.sajal.shoppingcart.service;

import java.util.List;

import com.sajal.shoppingcart.model.Brand;

public interface BrandService {
	public List<Brand> brand(); // get all brands

	public boolean save(Brand brand); // create brand

	public boolean update(Brand brand); // update brand

	public boolean delete(String id); // delete brand by id

	public boolean delete(Brand brand);// delete brand by brand

	public Brand getBrandByID(String id); // get() brand by id

	public Brand getBrandByName(String name); // get() brand by name
}
