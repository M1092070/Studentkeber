package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.Student;

@Repository
public class StudentRepository {
	
	public List<Student> student = new ArrayList<Student>();

	public List<Student> getAll() {
		// TODO Auto-generated method stub
		return student;
	}

	public String add(Student student2) {
		
		// TODO Auto-generated method stub
		student.add(student2);
		return "successfully added";
	}

	
	}
	
	
	


