package com.intenrship.intracol.repository;

import org.springframework.data.repository.CrudRepository;

import com.intenrship.intracol.model.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {
	
}
