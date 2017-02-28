package com.sajal.shoppingcart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sajal.shoppingcart.model.User;
import com.sajal.shoppingcart.service.UserService;

@Controller
public class UserController {

	private UserService userService;

	@RequestMapping("/register")
	public ModelAndView showRegisterPage() {
		ModelAndView mv = new ModelAndView("/Home");
		mv.addObject("RegisterClicked", "true");
		mv.addObject("user", new User());
		return mv;
	}
	
	@Autowired(required = true)
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping("/registerForm")
	public ModelAndView userAdd(@ModelAttribute("user") User u) {
		ModelAndView mv = new ModelAndView("/Home");
		userService.addUser(u);
		return mv;
	}

}
