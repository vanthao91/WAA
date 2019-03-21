package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.BlockSession;
import com.example.demo.domain.MeditationRecord;
import com.example.demo.domain.Student;
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

	@Override
	public List<MeditationRecord> findByStudentAndBlock(Integer studentID, Integer blockID) {
		// TODO Auto-generated method stub
		return meditationRecordRepository.findByStudentAndBlock(studentID, blockID);
	}

	@Override
	public Double countByStudentAndBlock(Integer studentID, Integer blockID) {
		// TODO Auto-generated method stub
		return meditationRecordRepository.countByStudentAndBlock(studentID, blockID);
	}

	@Override
	public Double countByStudent(Integer studentID) {
		// TODO Auto-generated method stub
		return meditationRecordRepository.countByStudent(studentID);
	}

	@Override
	public MeditationRecord findByBlockSessionAndStudent(BlockSession blockSession, Student student) {
		// TODO Auto-generated method stub
		return meditationRecordRepository.findByBlockSessionAndStudent(blockSession, student);
	}

}
