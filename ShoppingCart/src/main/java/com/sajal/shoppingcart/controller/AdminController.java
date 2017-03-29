package com.sajal.shoppingcart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sajal.shoppingcart.dao.BrandDAO;
import com.sajal.shoppingcart.dao.ProductDAO;
import com.sajal.shoppingcart.dao.SupplierDAO;
import com.sajal.shoppingcart.model.Brand;
import com.sajal.shoppingcart.model.Product;
import com.sajal.shoppingcart.model.Supplier;

@Controller
public class AdminController {

	@Autowired
	BrandDAO brandDAO;

	@Autowired
	Brand brand;

	@Autowired
	ProductDAO productDAO;

	@Autowired
	Product product;

	@Autowired
	SupplierDAO supplierDAO;

	@Autowired
	Supplier supplier;

	@RequestMapping("/adminHome")
	public String adminHome() {
		return "/admin/AdminHome";
	}

	@RequestMapping("/addBrand")
	public ModelAndView registerBrand() {
		ModelAndView mv = new ModelAndView("/admin/AdminBrand");
		mv.addObject("brand", new Brand());
		List<Brand> brandList = brandDAO.brand();
		mv.addObject("brandList", brandList);
		mv.addObject("brand", brand);

		return mv;
	}

	@RequestMapping("/addProduct")
	public ModelAndView registerProduct() {
		ModelAndView mv = new ModelAndView("/admin/AdminProduct");
		mv.addObject("product", new Product());
		List<Product> productList = productDAO.product();
		mv.addObject("productList", productList);
		mv.addObject("product", product);

		return mv;
	}

	@RequestMapping("/addSupplier")
	public ModelAndView registerSupplier() {
		ModelAndView mv = new ModelAndView("/admin/AdminSupplier");
		mv.addObject("supplier", new Supplier());
		List<Supplier> supplierList = supplierDAO.supplier();
		mv.addObject("supplierList", supplierList);
		mv.addObject("supplier", supplier);

		return mv;
	}
}
