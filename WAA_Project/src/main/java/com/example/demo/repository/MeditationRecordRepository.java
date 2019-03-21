package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.BlockSession;
import com.example.demo.domain.MeditationRecord;
import com.example.demo.domain.Student;

@Repository
public interface MeditationRecordRepository extends JpaRepository<MeditationRecord, Integer> {

	@Query(value="select m.* "
			+ "from Meditation_Record m "
				+ "inner join Student s on m.student_id = s.id "
				+ "inner join Entry e on s.entry_id = e.id "
			+ "where e.id = :entryID", nativeQuery=true)
	List<MeditationRecord> findByStudentEntry (Integer entryID);
	
	@Query(value="select m.* "
			+ "from Meditation_Record m "
			+ "inner join Student s on m.student_id = s.id "
			+ "inner join Student_Course st on s.id = st.student_id "
			+ "inner join Course_Block_Faculty cbf on st.course_block_faculty_id = cbf.id "
			+ "where cbf.block_id = :blockID and s.id = :studentID", nativeQuery=true)
	List<MeditationRecord> findByStudentAndBlock(Integer studentID, Integer blockID);

	@Query(value="select count(m.*) "
			+ "from Meditation_Record m "
			+ "inner join Student s on m.student_id = s.id "
			+ "inner join Student_Course st on s.id = st.student_id "
			+ "inner join Course_Block_Faculty cbf on st.course_block_faculty_id = cbf.id "
			+ "where cbf.block_id = :blockID and s.id = :studentID", nativeQuery=true)
	Double countByStudentAndBlock(Integer studentID, Integer blockID);

	@Query(value="select count(m.*) "
			+ "from Meditation_Record m "
			+ "inner join Student s on m.student_id = s.id "
			+ "inner join Student_Course st on s.id = st.student_id "
			+ "inner join Course_Block_Faculty cbf on st.course_block_faculty_id = cbf.id "
			+ "where s.id = :studentID", nativeQuery=true)
	Double countByStudent(Integer studentID);
	
	MeditationRecord findByBlockSessionAndStudent(BlockSession blockSession, Student student);
	
	@Query(value="select m.* "
			+ "from meditation_record m "
			+ "inner join block_session bs on m.block_session_id = bs.id "
			+ "where bs.block_id = :blockID", nativeQuery=true)
	List<MeditationRecord> findStudentByBlock(Integer blockID);
}
