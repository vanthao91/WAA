package com.example.demo.service.facultyAttendanceService;

import com.example.demo.domain.Course_Block_Faculty;
import com.example.demo.domain.Student_Course;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AttendanceServiceImpl implements AttendanceService{

    @Override
    public List<Student_Course> createAttendanceReportForBlock(String blockStartDate) {
        return null;
    }

    @Override
    public List<Student_Course> createAttendanceReportForCourseOffering(Course_Block_Faculty courseOffering) {
        return null;
    }

    @Override
    public List<Student_Course> retrieveStudentAttendanceRecords(Course_Block_Faculty courseOffering) {
        return null;
    }

    @Override
    public void createAttendanceReportForEntry(String entryDate) {

    }

    @Override
    public void countAttendancePerDay() {

    }
//@Autowired
//private CourseService courseService;
//
//@Autowired
//private StudentService studentService;
//
//@Autowired
//private BarcodeRecordRepository barcodeRecordRepository;
//@Autowired
//private BlockSession blockSession;
//
//@Override
//	public void createAttendanceReportForEntry(String entryDate) {
//
//	List<Student> students = studentService.getStudentsByEntry(entryDate);
//
//
//	Date beginDate = blockSession.getBlock().getBeginDate();
//
//	Date endDate= blockSession.getBlock().getEndDate();
//
//	List<MeditationRecord> records = barcodeRecordRepository.findByDateBetween(beginDate, endDate);
//
//	Student_Course sc = new Student_Course();
//	for (MeditationRecord s: records) {
//		s.getStudent().getStudentID();
//		s.getStudent().getFirstName();
//		sc.getStudent().g
//		s.getStudent().
//	}
//
//	records = records.stream().filter(b -> b.getPlace().equals("DB")).filter(b -> b.getTypeTM().equals("AM"))
//			.sorted(Comparator.comparing(MeditationRecord::getBlockSession)).distinct().collect(Collectors.toList());
//
//	List<LocalDate> dates = records.stream().map(r -> r.getDate()).collect(Collectors.toList());
//
//	List<Session> sessions = sessionsForDateRange(LocalDate.parse(entryDate), LocalDate.now(), dates);
//
//	students.stream().map(s -> new StudentAttendance(s, null)).map(populateAttendanceArray(records, sessions))
//			.peek(System.out::println).collect(Collectors.toList());
//
//	}
//
//
//	@Override
//	public List<Student_Course> createAttendanceReportForBlock(String blockStartDate) {
//
//		List<Student_Course> errorRecords = new ArrayList<>();
//		for (Course_Block_Faculty offering : courseService.getCourseOfferings(blockStartDate )) {
//			errorRecords.addAll(createAttendanceReportForOffering(offering));
//		}
//
//		return errorRecords;
//	}
//
//	@Override
//	public List<Student_Course> createAttendanceReportForOffering(Course_Block_Faculty courseOffering) {
//
//
//	return null;
//	}
//
//	@Override
//	public void emailReportToStudentsForBlock(String blockStartDate) {
//
//	}
//
//
//	@Override
//	public List<Student_Course> retrieveStudentAttendanceRecords(Course_Block_Faculty courseOffering) {
//
//		List<Student_Course> enrollments = courseService.getEnrollment(courseOffering);
//
//		if (null == enrollments || enrollments.isEmpty()) {
//			System.out.println("no enrollments found");
//			return null;
//		}
//
//		BlockSession block = courseService
//				.getAcademicBlock(DateUtil.convertDateToString(courseOffering.getBlock().getBeginDate()));
//
//		if (block == null) {
//			System.out.println("academic block is null");
//
//			return null;
//		}
//		Date beginDate = block.getBlock().getBeginDate();
////		Date beginDate = DateUtil.convertLocalDateToDate(bD);
////		Date endDate = DateUtil.convertLocalDateToDate(block.getEndDate());
//		Date endDate = block.getBlock().getEndDate();
//		Set<MeditationRecord> barcodeRecords = (Set<MeditationRecord>) barcodeRecordRepository.findByDateBetween(beginDate, endDate);
//
//		List<BlockSession>  blocks = courseService.getAllAcademicBlock();
//		System.out.println("\nCreating attendance report for: " + courseOffering.getCourse() + " by "
//				+ courseOffering.getFaculty());
//
//		List<Student_Course> studentAttendanceRecords = enrollments.stream()
//				.map(e -> new Student_Course())
//				.map(populateAttendanceArray(barcodeRecords, blocks)
//				.collect(Collectors.toList());
//
//
//
//		OptionalDouble average = studentAttendanceRecords.stream().mapToDouble(sa -> sa.getMeditaionPercentage())
//				.average();
//		if (average.isPresent()) {
//			System.out.printf("Average group meditation participation for this class is: %5.1f%s\n",
//					average.getAsDouble(), "%");
//		}
//
//		return studentAttendanceRecords;
//
//
//	return null;
//	}
//
//
//
//	private Function<Student, Student> populateAttendanceArray(Set<MeditationRecord> barcodeRecords,
//																				   List<BlockSession> sessions) {
//		return sa -> {
//			List<Boolean> attendance = new ArrayList<Boolean>(sessions.size());
//
//			sa.setMeditationRecord(barcodeRecords);
//
//			boolean noBarcode = (null == sa.getBarCode());
//
//			for (BlockSession session : sessions) {
//				if (noBarcode) {
//					attendance.add(false);
//				} else {
//					attendance.add(barcodeRecords.stream()
//							.filter(br -> br.equals(sa.getBarCode()))
//							.filter(br -> br.equals(session.getSession()))
//							.filter(br -> br.getTypeTM().equals(br.getTypeTM())).findFirst().isPresent());
//				}
//			}
//
//			return sa;
//		};
//
//
//
//
//
//
//
//
//
//
//	@Override
//	public void createAttendanceReportForEntries(String startDate) {
//
//	}
//
//	@Override
//	public void countAttendancePerDay() {
//
//	}
}
