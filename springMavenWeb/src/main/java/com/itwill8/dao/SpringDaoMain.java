package com.itwill8.dao;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class SpringDaoMain {

	public static void main(String[] args) throws SQLException {
		System.out.println("------application context[bean factory]초기화전-----");
		ApplicationContext applicationContext=
				new ClassPathXmlApplicationContext("com/itwill8/dao/8-1.spring_dao.xml");
		System.out.println("------application context[bean factory]초기화후-----");
		
		DataSource apacheDS = (DataSource) applicationContext.getBean("apacheDataSource");
		System.out.println(apacheDS.getConnection());	// apache datasource
		
		System.out.println("-------------------");
		
		DataSource springDS = (DataSource) applicationContext.getBean("springDataSource");
		System.out.println(springDS.getConnection());	//spring dataSource
		
		System.out.println();
		System.out.println("3.----------jdbcTemplate----------");
		JdbcTemplate jdbcTemplate = (JdbcTemplate) applicationContext.getBean("jdbcTempalte");
		System.out.println(jdbcTemplate);
		//jdbcTemplate.queryForObject();
	}

}
