package com.mybatis3.dao;

import com.mybatis3.domain.Tutor;
import com.mybatis3.util.MyBatisSqlSessionFactory;

public class TutorDao 
{
	public static final String namespace = "com.mybatis3.mappers.TutorMapper.";
	
	public Tutor selectTutorById(int t_id){
		return MyBatisSqlSessionFactory.getSqlSession().selectOne(namespace+"selectTutorById", t_id);
	}
	public Tutor selectTutorByIdWithAddr(int t_id){
		return MyBatisSqlSessionFactory.getSqlSession().selectOne(namespace+"selectTutorByIdWithAddr", t_id);
	}
	
	public Tutor nestedSelectTutorById(int t_id){
		return MyBatisSqlSessionFactory.getSqlSession().selectOne(namespace+"nestedSelectTutorById", t_id);
	}
	
}













