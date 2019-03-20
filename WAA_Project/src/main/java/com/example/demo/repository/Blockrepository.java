package com.example.demo.repository;

import com.example.demo.domain.BlocksToDisplay;
import org.springframework.data.jpa.repository.JpaRepository;


public interface Blockrepository extends JpaRepository<BlocksToDisplay, Long>{

}
