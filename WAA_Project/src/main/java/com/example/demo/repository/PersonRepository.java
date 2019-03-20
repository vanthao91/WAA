package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {
	//@Query(value = "select p from Person p where BAR_CODE = ?1")
	List<Person> findByBarCode(String barcode);
}
