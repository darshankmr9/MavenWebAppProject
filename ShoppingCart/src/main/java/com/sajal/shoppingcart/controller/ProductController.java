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

import com.sajal.shoppingcart.model.Product;
import com.sajal.shoppingcart.dao.ProductDAO;

@Controller
public class ProductController {

	@Autowired
	private ProductDAO productDAO;

	@RequestMapping(value = "/registerProduct", method = RequestMethod.POST)
	String insertProduct(@Valid @ModelAttribute("product") Product p, BindingResult result, Model model,
			HttpServletRequest request) {
		if (result.hasErrors()) {
			model.addAttribute("productList", this.productDAO.product());
			System.out.println("error");
			return "forward:/addProduct";
		} else {
			if (p.getId() == 0) {
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
			} else {
				System.out.println("product is going to update");
				productDAO.update(p);
			}
			return "forward:/addProduct";
		}
	}

	@RequestMapping("/deleteProduct/{id}")
	public String deleteProduct(@PathVariable("id") int id) {
		this.productDAO.delete(id);
		return "redirect:/addProduct";
	}

	@RequestMapping("/editProduct/{id}")
	public String editProduct(@PathVariable("id") int id, Model model) {

		model.addAttribute("product", productDAO.getProductByID(id));
		model.addAttribute("productList", this.productDAO.product());

		return "/admin/AdminProduct";

	}

	@RequestMapping("/allProducts")
	public String showAllProducts() {
		return "/AllProducts";
	}

	@RequestMapping("/productDetails")
	public String showProductDetails() {
		return "/ProductDetails";
	}

}
