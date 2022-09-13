package com.example.demo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@SpringBootApplication
public class DemoForStudentApplication implements CommandLineRunner  {
	
	@Autowired
	StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoForStudentApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Student s1= new Student(1,"sush",23,"female");
		Student s2= new Student(2,"Raju",22,"male");
		Student s3= new Student(3,"Sonali",25,"female");
		Student s4= new Student(4,"Nilesh",27,"male");
		
		studentRepository.student.addAll(Arrays.asList(s1,s2,s3,s4));
		
		
	}

}
