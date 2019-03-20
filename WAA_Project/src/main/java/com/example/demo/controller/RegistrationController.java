package com.example.demo.controller;

import java.util.HashSet;
import java.util.Set;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.example.demo.domain.Role;
import com.example.demo.domain.User;
import com.example.demo.service.PersonService;
import com.example.demo.service.RoleService;
import com.example.demo.service.UserService;

@Controller
public class RegistrationController {

	@Autowired
	UserService userService;
	
	@Autowired
	PersonService personService;
	
	@Autowired
	RoleService roleService;
	
	@GetMapping("/admin/registration")
	public String loadRegistrationForm(Model model) {
		
		//Load roles list
		model.addAttribute("roles", roleService.getAll());
		
		roleService.getAll().stream().forEach(r -> System.out.println(r + "------"));
		model.addAttribute("user", new User());
		model.addAttribute("persons", personService.getAll());
		
		return "registration";
	}
	
	/*
	 * @PostMapping("/admin/registration") public String
	 * saveUser(@Valid @ModelAttribute("user") User user, BindingResult rs,
	 * RedirectAttributes ra, Model model) { if(rs.hasErrors()) {
	 * model.addAttribute("roles", roleService.getAll());
	 * model.addAttribute("persons", personService.getAll()); return "registration";
	 * } else { // user.getRoles().stream().forEach(r -> System.out.println(r +
	 * "------")); User savedUser = userService.saveUser(user); //
	 * savedUser.getRoles().stream().forEach(r -> System.out.println(r +
	 * "--=======----")); ra.addFlashAttribute("user", savedUser);
	 * System.out.println("Create user successfully"); return "redirect:/success"; }
	 * }
	 */
	
	
	@PostMapping("/rest/registration")
	@ResponseBody
	@ResponseStatus(value=HttpStatus.NO_CONTENT, reason = "Some parameters are invalid")
	public void saveUser(@Valid @RequestBody User user) {
		System.out.println("=========User before saved");
		user.getRoles().stream().forEach(r -> System.out.println(r + "------"));
		System.out.println(user.getPerson());
		
		user.setPerson(personService.findPersonById(user.getPerson().getId()));
		Set<Role> roles = new HashSet<>();
		user.getRoles().stream().forEach(r -> roles.add(roleService.get(r.getId())));
		user.setRoles(roles);
		
		User savedUser = userService.saveUser(user);
		
		System.out.println("=========User after saved");
		user.getRoles().stream().forEach(r -> System.out.println(r + "------"));
		System.out.println(user.getPerson());
		
//		return savedUser;
	}
	
	@GetMapping("/admin/success")
	public String success() {
		return "saveSuccess";
	}
	

}
