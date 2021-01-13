package com.parviz.SBootAmigo.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.parviz.SBootAmigo.model.Student;

@Repository
public class StudentDao {
	
	private static Map<Integer, Student> students;
	
	static {
		students = new HashMap<Integer, Student>() {
			{
				put(1, new Student(1, "Nelson", "London"));
				put(2, new Student(2, "Henry", "Ottawa"));
				put(3, new Student(3, "Michael", "New York"));
			}
		};
	}
	
	public Collection<Student> getAllStudents() {
		return this.students.values();
	}
}
