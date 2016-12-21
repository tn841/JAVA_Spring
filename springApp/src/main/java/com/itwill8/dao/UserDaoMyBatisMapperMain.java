package com.itwill8.dao;

import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itwill.user.User;
import com.itwill.user.UserDao;
import com.itwill.user.UserDaoImplSpringDao;



public class UserDaoMyBatisMapperMain {

	public static void main(String[] args) throws Exception{
		System.out.println("------application context[bean factory]초기화전-----");
		ApplicationContext applicationContext=
				new ClassPathXmlApplicationContext("com/itwill8/dao/8-5.user_dao_myBatis_mapperInterface.xml");
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
		User newUser = new User("fire", "fire", "파이리", "파이리@naver.com");
		System.out.println(">> User create : "+userDao.create(newUser));
		
		
		
		
	}

}
