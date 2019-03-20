package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Entry;
import com.example.demo.repository.EntryRepository;
import com.example.demo.service.EntryService;

@Service
public class EntryServiceImpl implements EntryService {

	@Autowired
	private EntryRepository entryRepository;
	
	@Override
	public List<Entry> getAll() {
		// TODO Auto-generated method stub
		return entryRepository.findAll();
	}

	@Override
	public Entry getById(Integer entryId) {
		// TODO Auto-generated method stub
		return entryRepository.findById(entryId).get();
	}

}
