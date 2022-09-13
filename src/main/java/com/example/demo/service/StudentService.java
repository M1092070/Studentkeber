package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

public class StudentService {
	
	@Autowired
	StudentRepository studentRepository;

	public List<Student> getAll() {
		// TODO Auto-generated method stub
		return studentRepository.getAll();
	}

	public String add(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.add(student);
	}

	
}
