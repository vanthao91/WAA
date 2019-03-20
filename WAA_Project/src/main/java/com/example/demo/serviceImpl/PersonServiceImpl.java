package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Person;
import com.example.demo.repository.PersonRepository;
import com.example.demo.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	PersonRepository personRepository;
	
	@Override
	public List<Person> getAll() {
		// TODO Auto-generated method stub
		return personRepository.findAll();
		
	}
	@Override
	public Person findByBarCode(String barcode) {
		// TODO Auto-generated method stub
		List<Person> result =  (List<Person>)  personRepository.findByBarCode(barcode);	
		
//		if(result != null && !result.isEmpty()) {
//			System.out.println("result: " + result);
//			return result.get(0);
//		}else {
//			return null;
//		}
		return 	(result != null && !result.isEmpty() ) ? result.get(0) : null;
	}


}
