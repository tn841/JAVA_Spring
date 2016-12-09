package com.itwill6.dependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itwill.user.ExistedUserException;
import com.itwill.user.UserService;

public class DependencyAutoWireMain {

	public static void main(String[] args) throws ExistedUserException, Exception {
		System.out.println("------application context[bean factory]초기화전-----");
		ApplicationContext applicationContext=
				new ClassPathXmlApplicationContext("6-3.bean_dependency_annotation.xml");
		System.out.println("------application context[bean factory]초기화후-----\n");
		
		UserService userService = (UserService)applicationContext.getBean("userService");
		userService.create(null);
	}

}
