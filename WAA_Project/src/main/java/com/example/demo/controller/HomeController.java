package com.example.demo.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;

@Controller
public class HomeController {
    @Autowired
    private UserService userService;
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String getHomeForm(Model model, Principal principal)
	{
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		User user = userService.findByUsername(auth.getName());
//		if (principal != null)
//			model.addAttribute("user", "Welcome " + principal.getName());
//		else
			model.addAttribute("user", "Welcome " + user.getUsername());
		return "home";
	}

}
