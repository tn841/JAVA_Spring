package com.itwill8.dao;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itwill.user.User;
import com.itwill.user.UserDao;
import com.itwill.user.UserDaoImplSpringDao;
import com.itwill.user.annotation.UserDaoImplAnnotation;

import antlr.collections.List;

public class UserDaoJdbcMain {

	public static void main(String[] args) throws Exception {
		System.out.println("------application context[bean factory]초기화전-----");
		ApplicationContext applicationContext=
				new ClassPathXmlApplicationContext("com/itwill8/dao/8-3.user_dao_jdbc.xml");
		System.out.println("------application context[bean factory]초기화후-----");
		
		UserDao userDao = (UserDao)applicationContext.getBean("userDao");
		
//		System.out.println("\n-------------create-------------");
//		userDao.create(new User("ooo", "1111", "오오오", "오메일"));
//		
//		System.out.println("\n-------------update-------------");
//		userDao.update(new User("ooo", "2222", "오오오", "오메일"));
//		
		System.out.println("\n-------------findUser-------------");
		System.out.println(userDao.findUser("guard2"));
		
		//userDao.findUserList();
		
		UserDaoImplSpringDao userDaoImpl = (UserDaoImplSpringDao) userDao;
		
		System.out.println("\n-------------findUserMap-------------");
		Map userMap = userDaoImpl.findUserMap("guard2");
		System.out.println(userMap);
		
		System.out.println("\n-------------findUserListMap-------------");
		java.util.List<Map<String, Object>> userMapList = userDaoImpl.findUserListMap();
		System.out.println(userMapList);
		
	}

}
