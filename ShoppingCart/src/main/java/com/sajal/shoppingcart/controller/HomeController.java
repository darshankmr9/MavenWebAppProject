package com.sajal.shoppingcart.controller;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sajal.shoppingcart.dao.BrandDAO;
import com.sajal.shoppingcart.dao.ProductDAO;
import com.sajal.shoppingcart.dao.SupplierDAO;
import com.sajal.shoppingcart.dao.UserDAO;
import com.sajal.shoppingcart.model.Authorize;
import com.sajal.shoppingcart.model.User;

@Controller
public class HomeController {

	@Autowired
	private UserDAO userDAO;

	@Autowired
	private ProductDAO productDAO;

	@Autowired
	private BrandDAO brandDAO;

	@Autowired
	private SupplierDAO supplierDAO;

	@Autowired
	private User user;

	@Autowired
	private Authorize auth;

	@Autowired
	private HttpSession session;

	@RequestMapping("/")
	public ModelAndView showStartPage() {
		ModelAndView mv = new ModelAndView("/Home");
		session.setAttribute("productList", productDAO.product());
		session.setAttribute("brandList", brandDAO.brand());
		session.setAttribute("supplierList", supplierDAO.supplier());

		return mv;
	}

	@RequestMapping("/home")
	public ModelAndView showHomePage() {
		ModelAndView mv = new ModelAndView("/Home");
		return mv;
	}

	@RequestMapping("/login")
	public ModelAndView showLoginPage() {
		ModelAndView mv = new ModelAndView("/Home");
		mv.addObject("LoginClicked", "true");
		return mv;
	}

	@RequestMapping("/aboutus")
	public ModelAndView showAboutUsPage() {
		ModelAndView mv = new ModelAndView("/AboutUs");
		return mv;
	}

	@RequestMapping("/forgotpassword")
	public ModelAndView showForgotPasswordPage() {
		ModelAndView mv = new ModelAndView("/ForgotPassword");
		return mv;
	}
	
	@RequestMapping("/403")
	public ModelAndView show403ErrorPage() {
		ModelAndView mv = new ModelAndView("/error/403");
		return mv;
	}

	@RequestMapping(value = "/validate", method = RequestMethod.POST)
	public ModelAndView validateCredentials(@RequestParam("username") String id, @RequestParam("password") String pwd) {
		ModelAndView mv = new ModelAndView("/Home");
		mv.addObject("errorMessage", "Please enter correct Username/Password");
		return mv;
	}

	@RequestMapping("/logout")
	public ModelAndView logout() {
		ModelAndView mv = new ModelAndView("/Home");
		mv.addObject("logoutMessage", "Logout Successful.");
		return mv;
	}
}