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

import com.sajal.shoppingcart.dao.SupplierDAO;
import com.sajal.shoppingcart.model.Supplier;

@Controller
public class SupplierController {

	@Autowired
	public SupplierDAO supplierDAO;

	@RequestMapping("/addSupplier")
	public ModelAndView showRegisterSupplierPage() {
		ModelAndView mv = new ModelAndView("/admin/RegisterSupplier");
		mv.addObject("supplier", new Supplier());
		mv.addObject("supplierList", supplierDAO.supplier());
		return mv;
	}

	@RequestMapping(value = "/registerSupplier", method = RequestMethod.POST)
	public String insertSupplier(@Valid @ModelAttribute("supplier") Supplier s, BindingResult result, Model model,
			HttpServletRequest request) {
		if (result.hasErrors()) {
			model.addAttribute("listSupplier", this.supplierDAO.supplier());
			System.out.println("error");
			return "forward:/addSupplier";
		} else {
			System.out.println("supplier");
			this.supplierDAO.save(s);
			return "forward:/addSupplier";
		}
	}

	@RequestMapping("/deleteSupplier/{id}")
	public ModelAndView deleteSupplier(@PathVariable("id") int id) {
		ModelAndView mv = new ModelAndView("forward:/addSupplier");
		this.supplierDAO.delete(id);
		return mv;
	}

	@RequestMapping("/editSupplier/{id}")
	public String editBrand(@PathVariable("id") int id, Model model) {
		
		model.addAttribute("supplier", supplierDAO.getSupplierByID(id));
		model.addAttribute("supplierList", this.supplierDAO.supplier());

		return "forward:/addSupplier";

	}
}
