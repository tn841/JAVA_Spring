package com.mybatis3.dao;

import java.util.HashMap;
import java.util.List;

import com.mybatis3.domain.Course;

public class CourseDaoMain {

	public static void main(String[] args) {
		CourseDao courseDao = new CourseDao();
		System.out.println("-----------selectCoursesByTutorId----------");
		System.out.println(courseDao.findCoursesByTutorId(1));
		System.out.println(courseDao.findCoursesByTutorId(2));
		System.out.println(courseDao.findCoursesByTutorId(3));
		System.out.println(courseDao.findCoursesByTutorId(null));
		
		System.out.println("---------------findCourses-------------");
		HashMap<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("t_id", 1);
		paramMap.put("c_name", "Q");
		paramMap.put("s_date", "2015/01/01");
		List<Course> courses = courseDao.findCourses(paramMap);
		for(Course c : courses){
			System.out.println(c);			
		}
		System.out.println();
		
		
		HashMap<String, Object> paramMap2 = new HashMap<String, Object>();
		//paramMap.put("t_id", 1);
		//paramMap.put("c_name", "Q");
		//paramMap.put("s_date", "2015/01/01");
		List<Course> courses2 = courseDao.findCourses(paramMap2);
		for(Course c : courses2){
			System.out.println(c);			
		}
		System.out.println();
		
		HashMap<String, Object> paramMap3 = new HashMap<String, Object>();
		//paramMap3.put("t_id", 1);
		paramMap3.put("c_name", "Q");
		//paramMap.put("s_date", "2015/01/01");
		List<Course> courses3 = courseDao.findCourses(paramMap3);
		for(Course c : courses3){
			System.out.println(c);			
		}
		System.out.println();
		
		HashMap<String, Object> paramMap4 = new HashMap<String, Object>();
		//paramMap.put("t_id", 1);
		//paramMap.put("c_name", "Q");
		paramMap4.put("s_date", "2015/01/01");
		List<Course> courses4 = courseDao.findCourses(paramMap4);
		for(Course c : courses4){
			System.out.println(c);			
		}
		System.out.println();
		
	}

}
