package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.MeditationRecord;

@Repository
public interface MeditationRecordRepository extends JpaRepository<MeditationRecord, Integer> {

	@Query(value="select m.* "
			+ "from Meditation_Record m "
				+ "inner join Student s on m.student_id = s.id "
				+ "inner join Entry e on s.entry_id = e.id "
			+ "where e.id = :entryID", nativeQuery=true)
	List<MeditationRecord> findByStudentEntry (Integer entryID);
}
