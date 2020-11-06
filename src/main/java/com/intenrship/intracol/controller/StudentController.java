package com.intenrship.intracol.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.intenrship.intracol.service.StudentService;
import com.intenrship.intracol.util.ViewNames;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class StudentController {
	
	
	private final StudentService studentService;
	
	@Autowired
	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}


	@GetMapping("/students")
	public String getAllStudents(Model model) {
		model.addAttribute("students", studentService.findAll());
		log.info("model = {}", model);
		return ViewNames.STUDENTS;
	}

}
