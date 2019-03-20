package com.example.demo.controller;

import java.text.DecimalFormat;
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
import com.example.demo.domain.Entry;
import com.example.demo.domain.MeditationRecord;
import com.example.demo.domain.Student;
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
	
	@GetMapping("/admin/report")
	public String getAdminReportForm(@ModelAttribute("newEntry") Entry entry, Model model) {
		model.addAttribute("entries", entryService.getAll());
		return "adminReport";
	}
	
	@PostMapping("/admin/report")
	public String getListStudent(@ModelAttribute("newEntry") Entry entry, Model model) {
		entry = entryService.getById(entry.getId());
		DecimalFormat myFormatter = new DecimalFormat("###.#");
		
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
	
}
