package com.sajal.shoppingcart.controller;

import java.io.FileOutputStream;

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
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.sajal.shoppingcart.model.Product;
import com.sajal.shoppingcart.dao.ProductDAO;

@Controller
public class ProductController {

	@Autowired
	private ProductDAO productDAO;

	@RequestMapping("/addProduct")
	public ModelAndView showRegisterProductPage() {
		ModelAndView mv = new ModelAndView("/RegisterProduct");
		mv.addObject("product", new Product());
		mv.addObject("productList", productDAO.product());
		return mv;
	}

	@RequestMapping(value = "/registerProduct", method = RequestMethod.POST)
	String insertProduct(@Valid @ModelAttribute("product") Product p, BindingResult result, Model model,
			HttpServletRequest request) {
		if (result.hasErrors()) {
			model.addAttribute("listProduct", this.productDAO.product());
			System.out.println("error");
			return "/Home";
		} else {
			System.out.println("product");
			this.productDAO.save(p);
			MultipartFile file = p.getFile();
			String filelocation = request.getSession().getServletContext().getRealPath("/resources/images/");
			System.out.println(filelocation);
			String filename = filelocation + "\\" + p.getId() + ".jpg";
			System.out.println(filename);
			try {
				byte b[] = file.getBytes();
				FileOutputStream fos = new FileOutputStream(filename);
				fos.write(b);
				fos.close();
			} catch (Exception e) {
			}

			return "/admin/RegisterProduct";
		}
	}
	
	@RequestMapping("/deleteProduct/{id}")
	public ModelAndView deleteProduct(@PathVariable("id") String id)
	{
		ModelAndView mv = new ModelAndView("/admin/RegisterProduct");
		this.productDAO.delete(id);
	    return mv;
	}	
	
	@RequestMapping("editProduct/{id}")
	public String editProduct(@PathVariable("id") String id, Model model, Product p, BindingResult result,
			HttpServletRequest request) {
		if (result.hasErrors()) {
			model.addAttribute("listProduct", this.productDAO.product());
			System.out.println("error");
			return "/admin/RegisterProduct";
		} else {
			productDAO.update(p);
			p = productDAO.getProductByID(id);
			model.addAttribute("product", p);
			return "/admin/RegisterProduct";
		}
	}
	
}
