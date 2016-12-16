package com.mybatis3.dao;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.mybatis3.domain.Student;

public class StudentDaoMain {

	public static void main(String[] args) {
		StudentDao studentDao=new StudentDao();
		System.out.println("-------findStudentById-------");
	
		System.out.println("-------findStudentByIdResultMap-------");
		System.out.println("-------findStudentByIdMap-------");
		System.out.println("---------findAllStudents---------");
		System.out.println("---------findAllStudentsResultMap---------");
		System.out.println("------------findAllStudentsMap-------------");
		
		
		System.out.println("---------createStudent(Dto)-------");
		System.out.println("---------createStudent(parameter Map)-------");
	
		System.out.println("--------->>>>>insertStudentBySequence<<<<<<-------");
		
		System.out.println("---------updateStudent--------");
		System.out.println("---------Delete Student-------");
		System.out.println("--------------findStudentCount-----------");
		System.out.println("-------------findStudentWithAddress-----------");
		System.out.println("-------------findStudentByIdNestedfindAddressById-----------");
		System.out.println("-------------findStudentCount-----------");
		System.out.println("-------------updateStudentDynamicSql-----------");
		}
}
