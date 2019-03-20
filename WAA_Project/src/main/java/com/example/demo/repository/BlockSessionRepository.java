package com.example.demo.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.BlockSession;
import com.example.demo.domain.Person;

@Repository
public interface BlockSessionRepository extends JpaRepository<BlockSession, Integer>{
	BlockSession findBySession(Date session);
}
