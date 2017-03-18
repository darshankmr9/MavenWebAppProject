package com.sajal.shoppingcart.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sajal.shoppingcart.dao.BrandDAO;
import com.sajal.shoppingcart.model.Brand;

@Controller
public class BrandController {

	@Autowired
	private BrandDAO brandDAO;

	@RequestMapping("/addBrand")
	public ModelAndView showRegisterBrandPage() {
		ModelAndView mv = new ModelAndView("/RegisterBrand");
		mv.addObject("brand", new Brand());
		mv.addObject("brandList", brandDAO.brand());
		return mv;
	}

	@RequestMapping(value = "/registerBrand", method = RequestMethod.POST)
	String insertBrand(@Valid @ModelAttribute("brand") Brand b, BindingResult result, Model model,
			HttpServletRequest request) {
		if (result.hasErrors()) {
			model.addAttribute("listBrand", this.brandDAO.brand());
			System.out.println("error");
			return "/Home";
		} else {
			System.out.println("brand");
			this.brandDAO.save(b);
			return "/admin/RegisterBrand";
		}
	}

	@RequestMapping("/deleteBrand/{id}")
	public ModelAndView deleteBrand(@PathVariable("id") String id) {
		ModelAndView mv = new ModelAndView("/admin/RegisterBrand");
		this.brandDAO.delete(id);
		return mv;
	}
	
	@RequestMapping("editBrand/{id}")
	public String editBrand(@PathVariable("id") String id, Model model, Brand b, BindingResult result,
			HttpServletRequest request) {
		if (result.hasErrors()) {
			model.addAttribute("listBrand", this.brandDAO.brand());
			System.out.println("error");
			return "/admin/RegisterBrand";
		} else {
			brandDAO.update(b);
			b = brandDAO.getBrandByID(id);
			model.addAttribute("brand", b);
			return "/admin/RegisterBrand";
		}
	}
	
}
