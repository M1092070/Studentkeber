

package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
@RestController
@RequestMapping("/student")
public class StudentController {
	
	StudentService studentService;
	
	@GetMapping("/get/all")
	public List<Student> getAll(){
		return studentService.getAll();
		
	}
	
	@GetMapping("/add")
	public String getAll(@RequestBody Student student){
		return studentService.add(student);
		
	}
	
	

}
