package com.itwill.user.client;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itwill.user.User;
import com.itwill.user.UserDao;
import com.itwill.user.UserService;
import com.itwill.user.UserServiceImpl;

public class UserServiceClient {
	public static void main(String[] args) throws Exception{		
		System.out.println("------application context[bean factory]초기화전-----");
		ApplicationContext applicationContext = 
			new ClassPathXmlApplicationContext("99.user.xml");
		System.out.println("------application context[bean factory]초기화후-----");
		
		UserService userService=
				(UserService)applicationContext.getBean("userService");
		/*
		System.out.println("----------userService.create()--------------");
		userService.create(new User("userId", "1111", "KIM","guard@naver.com"));
		System.out.println("----------userService.findUser()--------------");
		System.out.println("----------userService.login()--------------");
		System.out.println("----------userService.update()--------------");
		System.out.println("----------userService.remove()--------------");
		*/
	}
}
