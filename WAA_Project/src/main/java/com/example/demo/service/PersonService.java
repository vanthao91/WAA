package com.example.demo.service;

import java.util.List;

import com.example.demo.domain.Person;

public interface PersonService {
	public Person findByBarCode(String barcode);
	public List<Person> getAll();
}
