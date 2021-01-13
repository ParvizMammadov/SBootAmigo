package com.parviz.SBootAmigo.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.parviz.SBootAmigo.model.Student;
import com.parviz.SBootAmigo.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@GetMapping(path = "/students")
	public Collection<Student> getAllStudents() {
		return studentService.getAllStudents();
	}
	
	@PostMapping(path = "/student")
	public String addStudent(@RequestBody Student student) {
		studentService.getAllStudents().add(student);
		return "Added successfully!";
	}
}
