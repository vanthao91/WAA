package com.example.demo.controller;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.demo.domain.AdminReportView;
import com.example.demo.domain.Block;
import com.example.demo.domain.BlockSession;
import com.example.demo.domain.Entry;
import com.example.demo.domain.MeditationRecord;
import com.example.demo.domain.Person;
import com.example.demo.domain.Student;
import com.example.demo.domain.StudentReportView;
import com.example.demo.service.BlockService;
import com.example.demo.service.BlockSessionService;
import com.example.demo.service.EntryService;
import com.example.demo.service.MeditationRecordService;

@Controller
@SessionAttributes({"user", "loggedPerson"})
public class ReportController {
	@Autowired
	private MeditationRecordService meditationRecordService;
	
	@Autowired
	private EntryService entryService;
	
	@Autowired
	private BlockSessionService blockSessionService;
	
	@Autowired
	private BlockService blockService;
	
	DecimalFormat myFormatter = new DecimalFormat("###.#");
	SimpleDateFormat dateFormatter = new SimpleDateFormat( "yyyy-MM-dd");
	
	@GetMapping("/admin/report")
	public String getAdminReportForm(@ModelAttribute("newEntry") Entry entry, Model model) {
		model.addAttribute("entries", entryService.getAll());
		return "adminReport";
	}
	
	@PostMapping("/admin/report")
	public String getListStudent(@ModelAttribute("newEntry") Entry entry, Model model) {
		entry = entryService.getById(entry.getId());
		
		List<MeditationRecord> listRecord = meditationRecordService.findByStudentEntry(entry.getId());
		List<AdminReportView> reports = new ArrayList<AdminReportView>();
		
		List<Student> listStudent = listRecord.stream().map(a -> a.getStudent()).distinct().collect(Collectors.toList());
		double totalSessionsPossible = blockSessionService.getTotalSessionByEntryDate(entry.getDateEntry());
		double totalSessionsAttended;
		AdminReportView item;
		
		for (Student student : listStudent)
		{
			item = new AdminReportView();
			List<MeditationRecord> listAttendedByStudent = listRecord.stream().filter(a -> a.getStudent() == student).collect(Collectors.toList());
			totalSessionsAttended = listAttendedByStudent.size();
			item.setStudent(student);
			item.setTotalSessionsAttended(totalSessionsAttended);
			item.setTotalSessionsPossible(totalSessionsPossible);
			item.setPercent(myFormatter.format(totalSessionsAttended / totalSessionsPossible * 100));
			reports.add(item);
		}
		
		model.addAttribute("reports", reports);
		model.addAttribute("entries", entryService.getAll());
		System.out.println("totalSessionsPossible = " + totalSessionsPossible);
		System.out.println("entry date = " + entry.getDateEntry());
		
		return "adminReport";
	}
	
	@GetMapping("/student/report")
	public String getStudentReportForm(@ModelAttribute("newBlock") Block block, Model model) {
		Person person = (Person) model.asMap().get("loggedPerson");
		Student student;
		Double totalSessionsPossible = (double) 0;
		Double totalSessionsAttended = (double) 0;
		
		if (person instanceof Student)
		{
			student = (Student) person;
			totalSessionsPossible = blockSessionService.getTotalSessionByEntryDate(student.getEntry().getDateEntry());
			totalSessionsAttended = meditationRecordService.countByStudent(student.getId());
			model.addAttribute("blocks", blockService.getBlockByEntryDate(student.getEntry().getDateEntry()));
			model.addAttribute("totalSessionsPossible", totalSessionsPossible);
			model.addAttribute("totalSessionsAttended", totalSessionsAttended);
			model.addAttribute("percentTotal", myFormatter.format(totalSessionsAttended / totalSessionsPossible * 100));
		}
		return "studentReport";
	}
	
	@PostMapping("/student/report")
	public String getListSession(@ModelAttribute("newBlock") Block block, Model model) {
		Person person = (Person) model.asMap().get("loggedPerson");
		block = blockService.getById(block.getId());
		Student student;
		Double totalSessionsPossible = (double) 0;
		Double totalSessionsAttended = (double) 0;
		Double daysPresent = (double) 0;
		Double extraCredit = (double) 0;
		List<StudentReportView> reports = new ArrayList<StudentReportView>();
		StudentReportView newRow;
		
		if (person instanceof Student)
		{
			student = (Student) person;
			totalSessionsPossible = blockSessionService.getTotalSessionByEntryDate(student.getEntry().getDateEntry());
			totalSessionsAttended = meditationRecordService.countByStudent(student.getId());
			model.addAttribute("blocks", blockService.getBlockByEntryDate(student.getEntry().getDateEntry()));
			model.addAttribute("totalSessionsPossible", totalSessionsPossible);
			model.addAttribute("totalSessionsAttended", totalSessionsAttended);
			model.addAttribute("percentTotal", myFormatter.format(totalSessionsAttended / totalSessionsPossible * 100));
			
			List<BlockSession> listBlockSession = blockSessionService.findByBlock(block);
			for (BlockSession item : listBlockSession)
			{
				newRow = new StudentReportView();
				newRow.setSession(dateFormatter.format(item.getSession()).toString());
				if (meditationRecordService.findByBlockSessionAndStudent(item, student) != null)
				{
					newRow.setPresent("True");
					daysPresent++;
				}
				else
					newRow.setPresent("False");
				reports.add(newRow);
			}
			model.addAttribute("reports", reports);

			model.addAttribute("daysPresent", daysPresent);
			model.addAttribute("sessions", listBlockSession.size());
			model.addAttribute("percent", myFormatter.format(daysPresent / listBlockSession.size() * 100));
			if (daysPresent >= 20) 
				extraCredit = 1.5;
			else if (daysPresent >= 18) 
				extraCredit = 1.0;
			else if (daysPresent >= 16) 
				extraCredit = 0.5;
			
			model.addAttribute("extraCredit", extraCredit);
		}
		return "studentReport";
	}
}
