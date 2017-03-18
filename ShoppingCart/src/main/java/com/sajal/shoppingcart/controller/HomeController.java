package com.sajal.shoppingcart.controller;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sajal.shoppingcart.dao.UserDAO;
import com.sajal.shoppingcart.model.User;

@Controller
public class HomeController {

	@Autowired
	private UserDAO userDAO;

	@Autowired
	private User user;

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

	@RequestMapping(value="/validate",method=RequestMethod.POST)
	public ModelAndView validateCredentials(@RequestParam("username") String id, @RequestParam("password") String pwd) {

		ModelAndView mv = new ModelAndView("/Home");

		if (userDAO.validate(id, pwd)) {

			user = userDAO.getUserByName(id);

			if (user.getRole().equals("ROLE_ADMIN")) {
				mv.addObject("role", true);

			} else {
				mv.addObject("role", false);
			}
			mv.addObject("successMessage", "Login Successful.");
			session.setAttribute("loginMessage", "Welcome : " + id);
		} else {
			mv.addObject("errorMessage", "Login Failed.");
		}
		return mv;
	}

	@RequestMapping("/logout")
	public ModelAndView logout() {
		ModelAndView mv = new ModelAndView("/Home");
		// session.invalidate();
		session.removeAttribute("loginMessage");
		return mv;
	}
}