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

	@RequestMapping("/registerBrand")
	public ModelAndView registerBrand() {
		ModelAndView mv = new ModelAndView("/admin/AdminHome");
		mv.addObject("RegisterBrandClicked", "true");

		List<Brand> brandList = brandDAO.brand();
		mv.addObject("brandList", brandList);
		mv.addObject("brand", brand);

		return mv;
	}

	@RequestMapping("/registerProduct")
	public ModelAndView registerProduct() {
		ModelAndView mv = new ModelAndView("/admin/AdminHome");
		mv.addObject("RegisterProductClicked", "true");

		List<Product> productList = productDAO.product();
		mv.addObject("productList", productList);
		mv.addObject("product", product);

		return mv;
	}

	@RequestMapping("/registerSupplier")
	public ModelAndView registerSupplier() {
		ModelAndView mv = new ModelAndView("/admin/AdminHome");
		mv.addObject("RegisterSupplierClicked", "true");

		List<Supplier> supplierList = supplierDAO.supplier();
		mv.addObject("supplierList", supplierList);
		mv.addObject("supplier", supplier);

		return mv;
	}
}
