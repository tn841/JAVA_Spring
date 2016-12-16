package com.mybatis3.test;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mybatis3.domain.Student;

public class StudentSelectSqlSessionMain {

	public static void main(String[] args)throws Exception {
		/*
		 * 0.mybatis-config.xml -->inputstram
		 */
		InputStream mybatiesConfigIn = Resources.getResourceAsStream("mybatis-config.xml");
		
		/*
		 * 1.SqlSessionFactoryBuilder
		 */
		SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
		
		
		/*
		 * 2.SqlSessionFactory
		 */
		SqlSessionFactory ssf = ssfb.build(mybatiesConfigIn);
		
		
		/*
		 * 3.SqlSession 
		 */
		SqlSession ss = ssf.openSession();
		System.out.println(">> SqlSession : "+ss);
		
		/*
		 * 4.SqlSession사용
		 */
		Student findStd = ss.selectOne("com.mybatis3.mappsers.StudentMapper.findStudentById", 1);
		System.out.println(">> findStd : "+findStd);

		/*
		 * 5.SqlSession close
		 */
		ss.close();
		
		
		
	}

}










