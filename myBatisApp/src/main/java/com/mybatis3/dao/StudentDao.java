package com.mybatis3.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.mybatis3.domain.Student;
import com.mybatis3.util.MyBatisSqlSessionFactory;

public class StudentDao {
	
	public static final String namespace="com.mybatis3.mappsers.StudentMapper.";
	
	
	/***********case1*****************/
	public Student findStudentByIdWithAddress(int id){
		return MyBatisSqlSessionFactory.getSqlSession().selectOne(namespace+"findStudentByIdWithAddress", id);
	}
	
	/***********case2*****************/
	public Student findStudentByIdNestedfindAddressById(int id){
		return MyBatisSqlSessionFactory.getSqlSession().selectOne(namespace+"findStudentByIdNestedfindAddressById", id);
	}
	
	public int updateStudent(Student student){
		SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSession();
		int updateRows = sqlSession.update(namespace+"studentUpdate", student);
		sqlSession.commit();
		sqlSession.close();
		return updateRows;
	}
	
	
	public int insertStudent(Student student){
		SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSession();
		int result = sqlSession.insert(namespace+"insertStudent", student);
		/*
		 * DML문 전송이후에는 반드시 commit을 호출
		 */
		sqlSession.commit();
		sqlSession.close();
		return result;
	}
	public int insertStudentBySeq(Student student){
		SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSession();
		int result = sqlSession.insert(namespace+"insertStudentBySeqence", student);
		/*
		 * DML문 전송이후에는 반드시 commit을 호출
		 */
		sqlSession.commit();
		sqlSession.close();
		return result;
	}
	public int insertStudentByParameterMap(Map<String, Object> map){
		SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSession();
		int result = sqlSession.insert(namespace+"insertStudentParameterMap", map);
		/*
		 * DML문 전송이후에는 반드시 commit을 호출
		 */
		sqlSession.commit();
		sqlSession.close();
		return result;
	}
	
	
	
	public Student findStudentById(int studId){
		SqlSession sqlSession=MyBatisSqlSessionFactory.getSqlSession();
		Student findStudent=sqlSession.selectOne(namespace+"findStudentById",studId);
		sqlSession.close();
		return findStudent;
		
	}
	public Map<String, Object> findStudentByIdMap(int studId){
		SqlSession sqlSession=MyBatisSqlSessionFactory.getSqlSession();
		Map<String, Object> findStudentMap=	sqlSession.selectOne(namespace+"findStudentByIdMap",studId);
		sqlSession.close();
		return findStudentMap;
		
	}
	public Student findStudentByIdResultMap(int studId){
		SqlSession sqlSession=MyBatisSqlSessionFactory.getSqlSession();
		Student findStudent=sqlSession.selectOne(namespace+"findStudentByIdResultMap",studId);
		sqlSession.close();
		return findStudent;
		
	}
	public List<Student> findAllStudents(){
		SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSession();
		List<Student> studentList =	sqlSession.selectList(namespace+"findAllStudents");
		sqlSession.close();
		return studentList;
	}
	public List<Student> findAllStudentsResultMap(){
		SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSession();
		List<Student> studentList = sqlSession.selectList(namespace+"findAllStudentsResultMap");
		sqlSession.close();
		return studentList;
	}
	
	public List<Map<String, Object>> findAllStudentsMap(){
		SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSession();
		List<Map<String, Object>> studentList =	sqlSession.selectList(namespace+"findAllStudentsMap");
		sqlSession.close();
		return studentList;
	}

}












