package com.example.demo.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.demo.domain.User;
import com.example.demo.service.PersonService;
import com.example.demo.service.UserService;

@Controller
@SessionAttributes({"user", "loggedPerson"})
public class HomeController {
	@Autowired
	private UserService userService;
	@Autowired
	private PersonService personService;

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String getHomeForm(Model model, Principal principal) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		User user = userService.findByUsername(auth.getName());
		model.addAttribute("user", user.getUsername());
		model.addAttribute("loggedPerson", user.getPerson());
		model.addAttribute("persons", personService.getAll());
		return "home";
	}

}
