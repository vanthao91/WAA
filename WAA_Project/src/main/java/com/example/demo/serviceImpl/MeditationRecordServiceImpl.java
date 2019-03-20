package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.MeditationRecord;
import com.example.demo.repository.MeditationRecordRepository;
import com.example.demo.service.MeditationRecordService;

@Service
public class MeditationRecordServiceImpl implements MeditationRecordService {
	@Autowired
	private MeditationRecordRepository meditationRecordRepository;
	
	@Override
	public List<MeditationRecord> findByStudentEntry(Integer entryID) {
		// TODO Auto-generated method stub
		return meditationRecordRepository.findByStudentEntry(entryID);
	}

}
