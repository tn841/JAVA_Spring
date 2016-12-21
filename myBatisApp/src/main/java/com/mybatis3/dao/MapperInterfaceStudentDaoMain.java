package com.mybatis3.dao;

import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mybatis3.mappers.StudentMapper;
import com.mybatis3.util.MyBatisSqlSessionFactory;

public class MapperInterfaceStudentDaoMain {

	public static void main(String[] args) {
		//MapperInterfaceStudentDao studentDao = new MapperInterfaceStudentDao();
		//System.out.println(studentDao.findStudentById(4));
		StudentMapper studentMapper =  MyBatisSqlSessionFactory.getSqlSession().getMapper(StudentMapper.class);
		System.out.println("studentMapper : "+studentMapper);		
		System.out.println(studentMapper.findStudentByIdMap(1));
		//System.out.println(studentMapper.findAllStudents());

	}

}
