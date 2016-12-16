package com.mybatis3.dao;

import java.util.Date;

import com.mybatis3.domain.Student;

public class JdbcStudentDaoMain {

	public static void main(String[] args) {
		JdbcStudentDao service = new JdbcStudentDao();
		
		Student existingStudent = service.findStudentById(1);
		
		System.out.println(existingStudent);
		
		long ts = System.currentTimeMillis();// For creating unique student
		
		Student newStudent = new Student(0000, "student_" + ts, "student_" + ts + "@gmail.com", new Date());
		service.createStudent(newStudent);
		System.out.println(newStudent);
		
		int updateStudId = 4;
		
		Student updateStudent = service.findStudentById(updateStudId);
		ts = System.currentTimeMillis();// For creating unique student email
		updateStudent.setEmail("student_" + ts + "@gmail.com");
		service.updateStudent(updateStudent);

	}

}
