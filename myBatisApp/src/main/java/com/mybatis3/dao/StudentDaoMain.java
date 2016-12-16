package com.mybatis3.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.mybatis3.domain.Student;

public class StudentDaoMain {

	public static void main(String[] args) {
		StudentDao studentDao=new StudentDao();
		System.out.println("-------findStudentById-------");
		System.out.println(">>>> findStudent : "+studentDao.findStudentById(1));
		System.out.println();
		
		System.out.println("-------findStudentByIdMap-------");
		System.out.println(">>>> findStudent : "+studentDao.findStudentByIdMap(4));
		System.out.println();
	
		System.out.println("-------findStudentByIdResultMap-------");
		System.out.println(">>> findStudentByIdResultMap : "+studentDao.findStudentByIdResultMap(3));	
		System.out.println();
		
		
		System.out.println("---------findAllStudents---------");
		System.out.println(">>> findStudents : "+studentDao.findAllStudents());
		System.out.println();
		
		System.out.println("---------findAllStudentsResultMap---------");
		List<Student> studentList=studentDao.findAllStudentsResultMap();
		for (Student student : studentList) {
			System.out.println(student);
		}
		System.out.println();
		
		System.out.println("------------findAllStudentsMap-------------");
		ArrayList<Map<String, Object>> studentList2 = new ArrayList<Map<String, Object>>();
		studentList2 = (ArrayList<Map<String, Object>>) studentDao.findAllStudentsMap();
		
		for (Iterator iterator = studentList2.iterator(); iterator.hasNext();) {
			Map<String, Object> map = (Map<String, Object>) iterator.next();
			System.out.println(map);			
		}		
		
		for (Map<String, Object> map : studentList2) {
			//System.out.println(map);
		}
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		
		System.out.println("---------createStudent(Dto)-------");
		Student s1 = new Student(80, "왕십리", "Wang@naver.com", new Date());
		//int row = studentDao.insertStudent(s1);
		//System.out.println(">>> insert row : "+row);
		System.out.println();
		
		System.out.println("---------createStudent(parameter Map)-------");
		HashMap<String, Object> parameterMap = new HashMap<String, Object>();
		parameterMap.put("irum", "파이리");
		parameterMap.put("mail", "파이리@naver.com");
		parameterMap.put("birthday", new Date());
	//	studentDao.insertStudentByParameterMap(parameterMap);
		System.out.println();
	
		System.out.println("--------->>>>>insertStudentBySequence<<<<<<-------");
		Student s2 = new Student(2343900, "십십십", "sip@naver.com", new Date());
		//System.out.println(">>> insert By Seq : "+studentDao.insertStudentBySeq(s2));
		System.out.println();
		
		System.out.println("---------updateStudent--------");
		Student updateS =  new Student(80, "왕십리 수정", "왕십리 수정@naver.com", new Date());
		studentDao.updateStudent(updateS);
		System.out.println();
		
		System.out.println("---------Delete Student-------");
		System.out.println();
		
		System.out.println("--------------findStudentCount-----------");
		System.out.println();
		
		System.out.println("-------------findStudentWithAddress-----------");
		System.out.println(">>>> findStudentByIdWithAddress : "+studentDao.findStudentByIdWithAddress(1));
		System.out.println();
		
		System.out.println("-------------findStudentByIdNestedfindAddressById-----------");
		System.out.println(">>> findStudentByIdNestedfindAddressById : "+studentDao.findStudentByIdNestedfindAddressById(1));
		System.out.println();
		
		System.out.println("-------------findStudentCount-----------");
		System.out.println();
		
		System.out.println("-------------updateStudentDynamicSql-----------");
		System.out.println();
		System.out.println();
		}
}
