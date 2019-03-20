package com.example.demo.repository.attendanceRepository;

import com.example.demo.domain.BlockSession;
import com.example.demo.domain.MeditationRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Date;
import java.util.List;

@Repository
public interface BarcodeRecordRepository extends JpaRepository<MeditationRecord, Integer> {

	List<MeditationRecord> findByDateBetween(Date beginDate, Date endDate);

	List<MeditationRecord> findByDate(Date record);

}
