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
		ModelAndView mv = new ModelAndView("/RegisterSupplier");
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
			return "/admin/RegisterSupplier";
		} else {
			System.out.println("supplier");
			this.supplierDAO.save(s);
			return "/admin/RegisterSupplier";
		}
	}

	@RequestMapping("/deleteSupplier/{id}")
	public ModelAndView deleteSupplier(@PathVariable("id") String id) {
		ModelAndView mv = new ModelAndView("/admin/RegisterSupplier");
		this.supplierDAO.delete(id);
		return mv;
	}

	@RequestMapping("editSupplier/{id}")
	public String editSupplier(@PathVariable("id") String id, Model model, Supplier s, BindingResult result,
			HttpServletRequest request) {
		if (result.hasErrors()) {
			model.addAttribute("listSupplier", this.supplierDAO.supplier());
			System.out.println("error");
			return "/admin/RegisterSupplier";
		} else {
			supplierDAO.update(s);
			s = supplierDAO.getSupplierByID(id);
			model.addAttribute("supplier", s);
			return "/admin/RegisterSupplier";
		}
	}
}
