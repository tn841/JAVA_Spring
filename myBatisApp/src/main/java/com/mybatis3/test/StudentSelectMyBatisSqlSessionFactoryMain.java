package com.mybatis3.test;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mybatis3.domain.Student;
import com.mybatis3.util.MyBatisSqlSessionFactory;

public class StudentSelectMyBatisSqlSessionFactoryMain {

	public static void main(String[] args) throws Exception{
		
		
		/*********MyBatisSqlSessionFactory 의사용*****************/
		SqlSession sqlSession =  MyBatisSqlSessionFactory.getSqlSession();
		
		String NAMESPACE="com.mybatis3.mappsers.StudentMapper.";
		Student findStudent = sqlSession.selectOne(NAMESPACE+"findStudentById", 4);
		System.out.println(">>>>"+findStudent);
		
		System.out.println(">>>>"+sqlSession.selectOne(NAMESPACE+"findStudentById",2));
		/***************************************/
		
	}

}
