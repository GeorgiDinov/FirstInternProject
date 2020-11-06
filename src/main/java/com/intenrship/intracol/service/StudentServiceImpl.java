package com.intenrship.intracol.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intenrship.intracol.model.Student;
import com.intenrship.intracol.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	private final StudentRepository studentRepository;


	@Autowired
	public StudentServiceImpl(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}


	@Override
	public List<Student> findAll() {
		List<Student> students = 
				new ArrayList<Student>((List<Student>) this.studentRepository.findAll());
		return  students;
	}


}
