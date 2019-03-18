package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	@RequestMapping(value = {"/", "/login"}, method = RequestMethod.GET)
	public String getLoginForm() {
//		ModelAndView modelAndView = new ModelAndView();
//		modelAndView.setViewName("login");
		System.out.println("Test");
		return "login";
	}
}
