package com.example.demo.serviceImpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Block;
import com.example.demo.repository.BlockRepository;
import com.example.demo.service.BlockService;

@Service
public class BlockServiceImpl implements BlockService {

	@Autowired
	private BlockRepository blockRepository;

	@Override
	public List<Block> getBlockByEntryDate(Date entryDate) {
		// TODO Auto-generated method stub
		return blockRepository.getBlockByEntryDate(entryDate);
	}

	@Override
	public List<Block> getAll() {
		// TODO Auto-generated method stub
		return blockRepository.findAll();
	}

	@Override
	public Block getById(Integer blockID) {
		// TODO Auto-generated method stub
		return blockRepository.getOne(blockID);
	}

}
