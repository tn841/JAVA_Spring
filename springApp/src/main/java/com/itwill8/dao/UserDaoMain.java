package com.itwill8.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itwill.user.User;
import com.itwill.user.UserDao;

public class UserDaoMain {

	public static void main(String[] args) throws Exception {
		System.out.println("------application context[bean factory]초기화전-----");
		ApplicationContext applicationContext=
				new ClassPathXmlApplicationContext("com/itwill8/dao/8-2.user_dao.xml");
		System.out.println("------application context[bean factory]초기화후-----");
		
		UserDao userDao = (UserDao)applicationContext.getBean("userDao");
		userDao.create(new User("1111", "1111", "1111", "1111"));
	}

}
