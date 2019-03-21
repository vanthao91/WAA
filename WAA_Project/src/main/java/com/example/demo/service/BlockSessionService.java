package com.example.demo.service;

import java.util.Date;
import java.util.List;

import com.example.demo.domain.Block;
import com.example.demo.domain.BlockSession;

public interface BlockSessionService {
	public Double getTotalSessionByEntryDate(Date entryDate);
	
	List<BlockSession> findByBlock(Block block);
}
