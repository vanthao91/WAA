package com.example.demo.service;

import java.util.List;

import com.example.demo.domain.MeditationRecord;

public interface MeditationRecordService {
	List<MeditationRecord> findByStudentEntry (Integer entryId);
}
