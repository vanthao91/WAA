package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Role;
import com.example.demo.repository.RoleRepository;
import com.example.demo.service.RoleService;
import com.example.demo.util.Util;

@Service
public class RoleServiceImpl implements RoleService{
	
	@Autowired
	RoleRepository roleRepository;
	
	public List<Role> getAll() {	
		return Util.iterableToCollection(roleRepository.findAll());

	}
	
	public Role get(Integer roleID) {
		return roleRepository.getOne(roleID);
	}

}
