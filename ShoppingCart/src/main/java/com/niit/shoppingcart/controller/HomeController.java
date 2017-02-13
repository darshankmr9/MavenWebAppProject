package com.niit.shoppingcart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/")
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

	@RequestMapping("/register")
	public ModelAndView showRegisterPage()
	{
		ModelAndView mv= new ModelAndView("/Home");
		mv.addObject("RegisterClicked","true");
		return mv;
	}
	
	@RequestMapping("/validate")
	public ModelAndView validateCredentials(@RequestParam("userID") String id, 
			@RequestParam("password") String pwd)
	{
		//uID=niit, pwd= niit@123.
		
		ModelAndView mv=new ModelAndView("/Home");
		
		if(id.equals("niit") && pwd.equals("niit@123"))
		{
			mv.addObject("msg", "Valid Credentials");
		}
		else
		{
			mv.addObject("msg", "Invalid Credentials");
		}
		return mv;
	}
	
}
