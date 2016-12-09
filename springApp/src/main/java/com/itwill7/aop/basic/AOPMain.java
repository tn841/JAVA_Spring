package com.itwill7.aop.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itwill.user.UserDao;
import com.itwill.user.UserService;



public class AOPMain {

	public static void main(String[] args) throws Exception{
		System.out.println("------application context[bean factory]초기화전-----");
		ApplicationContext applicationContext=
				new ClassPathXmlApplicationContext("com/itwill7/aop/basic/7-1.aop.xml");
		System.out.println("------application context[bean factory]초기화후-----");
		System.out.println("-----------------<<<< before advice >>>>----------");
		UserService userService=
				(UserService)applicationContext.getBean("userService");
		
		userService.login("userId", "password");
		userService.create(null);
		System.out.println("-----------------<<<< around advice >>>>----------");
		UserDao userDao=(UserDao)applicationContext.getBean("userDao");
		userDao.existedUser(null);
		userDao.findUser(null);
		System.out.println("-----------------<<<< after advice >>>>----------");
		userService.findUserList();
		userService.findUser(null);
		userService.login(null, null);
		System.out.println("-----------------<<<< after returning advice >>>>----------");
		userService.update(null);
		userDao.update(null);
		
		
	}

}
