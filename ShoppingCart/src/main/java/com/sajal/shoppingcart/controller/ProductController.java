package com.sajal.shoppingcart.controller;

import java.io.FileOutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.sajal.shoppingcart.model.Product;
import com.sajal.shoppingcart.service.ProductService;

@Controller
public class ProductController {

	private ProductService ProductService;

	@RequestMapping("/addProduct")
	public ModelAndView showRegisterProductPage() {
		ModelAndView mv = new ModelAndView("/RegisterProduct");
		mv.addObject("product", new Product());
		return mv;
	}

	@Autowired(required = true)
	public void setProductService(ProductService productService) {
		this.ProductService = productService;
	}

	@RequestMapping(value = "/registerProduct", method = RequestMethod.POST)
	String insertProduct(@Valid @ModelAttribute("product") Product p, BindingResult result, Model model,
			HttpServletRequest request) {
		if (result.hasErrors()) {
			// model.addAttribute("listProduct",
			// this.ProductService.getAllProducts());
			System.out.println("error");
			return "Home";
		} else {
			if (p.getPid() == 0) {
				this.ProductService.addProduct(p);
				MultipartFile file = p.getImage();
				String filelocation = request.getSession().getServletContext().getRealPath("/resources/images/");
				System.out.println(filelocation);
				String filename = filelocation + "\\" + p.getPid() + ".jpg";
				System.out.println(filename);
				try {
					byte b[] = file.getBytes();
					FileOutputStream fos = new FileOutputStream(filename);
					fos.write(b);
					fos.close();
				} catch (Exception e) {
				}
			}
			return "addProduct";
		}
	}
}
