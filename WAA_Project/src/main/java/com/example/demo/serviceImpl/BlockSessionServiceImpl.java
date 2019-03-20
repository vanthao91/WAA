package com.example.demo.serviceImpl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.BlockSessionRepository;
import com.example.demo.service.BlockSessionService;

@Service
public class BlockSessionServiceImpl implements BlockSessionService {

	@Autowired
	private BlockSessionRepository blockSessionRepository;
	
	@Override
	public Double getTotalSessionByEntryDate(Date entryDate) {
		// TODO Auto-generated method stub
		return blockSessionRepository.getTotalSessionByEntryDate(entryDate);
	}

}
