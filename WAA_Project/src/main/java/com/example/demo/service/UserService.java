package com.example.demo.service;

import com.example.demo.domain.User;

public interface UserService {
	User findByUsername(String username);
	User findByUsernameAndPassword(String username, String password);
	User saveUser(User user);
}
