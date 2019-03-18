package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.servlet.ModelAndView;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;

@Controller
public class LoginController {
    @Autowired
    private UserService userService;

    @RequestMapping(value={"/", "/login"}, method = RequestMethod.GET)
    public String login(@ModelAttribute("user") User user, Model model) {
    	model.addAttribute("hidden", "true");
    	return "login";
    }

//    @RequestMapping(value={"/login"}, method = RequestMethod.POST)
//    public String checkUserExists(@Valid @ModelAttribute("user") User user, BindingResult bindingResult, Model model) {
//    	if (userService.findUserByEmail(user.getEmail()) == null)
//    	{
//        	model.addAttribute("hidden", "false");
//    		return "login";
//    	}
//    	return "redirect:/home";
//    }

    @RequestMapping(value="/registration", method = RequestMethod.GET)
    public String registration(@ModelAttribute("user") User user){
        return "registration";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String createNewUser(@Valid @ModelAttribute("user") User user, BindingResult bindingResult, Model model) {
        User userExists = userService.findByUsername(user.getUsername());
        if (userExists != null) {
            bindingResult
                    .rejectValue("email", "error.user",
                            "There is already a user registered with the email provided");
        }
        if (bindingResult.hasErrors()) {
            return "registration";
        } else {
            userService.saveUser(user);
            model.addAttribute("successMessage", "User has been registered successfully");
            return "registration";

        }
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
