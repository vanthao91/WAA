package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.MeditationRecord;
import com.example.demo.domain.Person;
import com.example.demo.domain.Place;

@Repository
public interface MeditationRecordRepository extends JpaRepository<MeditationRecord, Integer> {
	
}
