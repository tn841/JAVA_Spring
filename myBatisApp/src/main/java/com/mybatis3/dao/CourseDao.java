package com.mybatis3.dao;

import java.util.HashMap;
import java.util.List;

import com.mybatis3.domain.Course;
import com.mybatis3.util.MyBatisSqlSessionFactory;

public class CourseDao 
{
	public static final String namespace = "com.mybatis3.mappers.CourseMapper.";
	
	public List<Course> findCoursesByTutorId(Integer t_id){
		return MyBatisSqlSessionFactory.getSqlSession().selectList(namespace+"findCoursesByTutorId", t_id);
	}
	
	public List<Course> findCourses(HashMap<String, Object> map){
		return MyBatisSqlSessionFactory.getSqlSession().selectList(namespace+"findCourses", map);
	}
}
