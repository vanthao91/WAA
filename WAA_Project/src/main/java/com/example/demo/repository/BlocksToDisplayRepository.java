package com.example.demo.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Block;
import com.example.demo.domain.BlocksToDisplay;

@Repository
public interface BlocksToDisplayRepository extends JpaRepository<BlocksToDisplay, Long>{

}
