package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Person;
import com.example.demo.domain.Place;

@Repository
public interface PlaceRepository extends JpaRepository<Place, Integer> {
	@Query(value = "select p from Place p where PLACEID = ?1")
	Place findByPlaceId(String placeId);
}
