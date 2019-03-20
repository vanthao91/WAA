package com.example.demo.controller;

import java.security.Principal;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

    @RequestMapping(value={"/", "/login"}, method = RequestMethod.GET)
    public String login(Model model, Principal principal) {
    	if (principal == null)
    	{
	    	model.addAttribute("hidden", "true");
	    	return "login";
    	}
    	return "redirect:/home";
    }
    
    @GetMapping("/access-denied")
    public String getAccessDeniedForm() {
    	return "access-denied";
    }

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logoutPage(HttpServletRequest request, HttpServletResponse response) {
		return "redirect:/login?logout";
	}

	/*
	 * @RequestMapping(value="/admin/home", method = RequestMethod.GET) public
	 * ModelAndView home(){ ModelAndView modelAndView = new ModelAndView();
	 * Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	 * User user = userService.findUserByEmail(auth.getName());
	 * modelAndView.addObject("userName", "Welcome " + user.getName() + " " +
	 * user.getLastName() + " (" + user.getEmail() + ")"); modelAndView.addObject(
	 * "adminMessage","Content Available Only for Users with Admin Role");
	 * modelAndView.setViewName("admin/home"); return modelAndView; }
	 */

}
