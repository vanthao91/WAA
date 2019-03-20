package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.TypeTM;

@Repository
public interface TypeTmRepository extends JpaRepository<TypeTM, Integer> {
	
//	@Query(value = "select t from typetm t where typeid = ?1")
	TypeTM findBytypeID(String typeId);
}
