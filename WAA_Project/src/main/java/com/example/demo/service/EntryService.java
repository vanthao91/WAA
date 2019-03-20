package com.example.demo.service;

import java.util.List;

import com.example.demo.domain.Entry;

public interface EntryService {
	List<Entry> getAll();
	Entry getById(Integer entryId);
}
