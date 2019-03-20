package com.example.demo.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;

public class UserNameValidator implements ConstraintValidator<UserName, String>{

	@Autowired
	private UserService userService;
	@Override
	public void initialize(UserName arg0) {}
	
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {

		User user = null;
		try {
			user = userService.findByUsername(value);
		} catch (Exception e) {
			System.out.println("Couldn't find username " + value);
		}
		return user == null ? true : false;

	}

}
