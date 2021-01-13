package com.parviz.SBootAmigo.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parviz.SBootAmigo.dao.StudentDao;
import com.parviz.SBootAmigo.model.Student;

@Service
public class StudentService {
	@Autowired
	private StudentDao studentDao;
	
	public Collection<Student> getAllStudents() {
		return studentDao.getAllStudents();
	}
}
