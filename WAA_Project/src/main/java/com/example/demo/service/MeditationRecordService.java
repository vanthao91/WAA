package com.example.demo.service;

import java.util.List;

import com.example.demo.domain.BlockSession;
import com.example.demo.domain.MeditationRecord;
import com.example.demo.domain.Student;

public interface MeditationRecordService {
	List<MeditationRecord> findByStudentEntry (Integer entryId);
	List<MeditationRecord> findByStudentAndBlock(Integer studentID, Integer blockID);
	Double countByStudentAndBlock(Integer studentID, Integer blockID);
	Double countByStudent(Integer studentID);
	MeditationRecord findByBlockSessionAndStudent(BlockSession blockSession, Student student);
	List<MeditationRecord> findStudentByBlock(Integer blockID);
}
