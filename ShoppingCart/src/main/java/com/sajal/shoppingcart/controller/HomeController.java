package com.sajal.shoppingcart.controller;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sajal.shoppingcart.model.User;

@Controller
public class HomeController {

	@Autowired
	private HttpSession session;

	@RequestMapping("/")
	public ModelAndView showStartPage() {
		ModelAndView mv = new ModelAndView("/Home");
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

	@RequestMapping("/mycart")
	public ModelAndView showMyCartPage() {
		ModelAndView mv = new ModelAndView("/MyCart");
		return mv;
	}

	@RequestMapping("/forgotpassword")
	public ModelAndView showForgotPasswordPage() {
		ModelAndView mv = new ModelAndView("/ForgotPassword");
		return mv;
	}

	@RequestMapping("/register")
	public ModelAndView showRegisterPage() {
		ModelAndView mv = new ModelAndView("/Home");
		mv.addObject("RegisterClicked", "true");
		mv.addObject("user", new User());
		return mv;
	}

	@RequestMapping("/validate")
	public ModelAndView validateCredentials(@RequestParam("username") String id, @RequestParam("password") String pwd) {

		// username=niit, pwd= niit@123.

		ModelAndView mv = new ModelAndView("/Home");

		if (id.equals("niit") && pwd.equals("niit@123")) {
			mv.addObject("successMessage", "Login Successful.");
			session.setAttribute("loginMessage", "Welcome : " + id);
		} 
		else {
			mv.addObject("errorMessage", "Login Failed.");
		}
		return mv;
	}

	@RequestMapping("/logout")
	public ModelAndView logout() {
		ModelAndView mv = new ModelAndView("/Home");
		session.invalidate();
		return mv;
	}

}