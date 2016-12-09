package com.itwill9.properties;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringPropertiesMain {

	public static void main(String[] args) throws SQLException {
		
		System.out.println("------application context[bean factory]초기화전-----");
		ApplicationContext applicationContext=
				new ClassPathXmlApplicationContext("com/itwill9/properties/9.spring_properties.xml");
		System.out.println("------application context[bean factory]초기화후-----");
		
		
		DataSource dataSource = applicationContext.getBean(DataSource.class);
		System.out.println(dataSource.getConnection());

	}

}
