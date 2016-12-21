package com.mybatis3.dao;

import com.mybatis3.domain.Tutor;

public class TutorDaoMain {

	public static void main(String[] args) {
		TutorDao tutorDao = new TutorDao();
		System.out.println("----------findTutorById--------");
//		Tutor t1 = tutorDao.selectTutorById(1);
//		Tutor t2 = tutorDao.selectTutorById(2);
//		Tutor t3 = tutorDao.selectTutorById(3);
//		System.out.println(t1+"\n"+t2+"\n"+t3);
//		System.out.println();
		
		System.out.println("----------findTutorByIdWithAddr--------");
//		t1 = tutorDao.selectTutorByIdWithAddr(1);
//		t2 = tutorDao.selectTutorByIdWithAddr(2);
//		t3 = tutorDao.selectTutorByIdWithAddr(3);
//		System.out.println(t1+"\n"+t2+"\n"+t3);
		
		System.out.println("----------selectTutorWithAddressAndCourses--------");
		System.out.println();
		
		System.out.println("-------------nestedSelectTutorById----------------");
		System.out.println(tutorDao.nestedSelectTutorById(1));
		System.out.println(tutorDao.nestedSelectTutorById(2));
		System.out.println(tutorDao.nestedSelectTutorById(3));
		
	}

}
