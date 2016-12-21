package com.itwill8.dao;

import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itwill.user.User;
import com.itwill.user.UserDao;
import com.itwill.user.UserDaoImplSpringDao;



public class UserDaoMyBatisMain {

	public static void main(String[] args) throws Exception{
		System.out.println("------application context[bean factory]초기화전-----");
		ApplicationContext applicationContext=
				new ClassPathXmlApplicationContext("com/itwill8/dao/8-4.user_dao_myBatis.xml");
		System.out.println("------application context[bean factory]초기화후-----");
		
		UserDao userDao=(UserDao)applicationContext.getBean("userDao");
		System.out.println("\t ### userDao : "+userDao);
		
		System.out.println(userDao.findUser("33"));
		
		System.out.println();
		
		List<User> userList = userDao.findUserList();
		for(User user: userList){
			System.out.println(user);
		}
		
		//create
		
		
		
	}

}
