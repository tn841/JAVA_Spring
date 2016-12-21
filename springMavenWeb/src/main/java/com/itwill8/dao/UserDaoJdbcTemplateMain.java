package com.itwill8.dao;

import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itwill.user.User;
import com.itwill.user.UserDao;
import com.itwill.user.UserDaoImplSpringDao;



public class UserDaoJdbcTemplateMain {

	public static void main(String[] args) throws Exception{
		System.out.println("------application context[bean factory]초기화전-----");
		ApplicationContext applicationContext=
				new ClassPathXmlApplicationContext("com/itwill8/dao/8-3.user_dao_jdbctemplate.xml");
		System.out.println("------application context[bean factory]초기화후-----");
		
		UserDao userDao=(UserDao)applicationContext.getBean("userDao");
//		System.out.println("----------create------------");
//		userDao.create(new User("sdsd","1111","에스디","에스메일"));
		System.out.println("----------findUser------------");
		User findUser=userDao.findUser("sdsd");
		System.out.println(findUser);
		System.out.println("----------update------------");
		findUser.setName("에스디변경");
		findUser.setName("에스메일변경");
		userDao.update(findUser);
		System.out.println("----------delete------------");
		userDao.remove("sdsd");
		System.out.println("----------findUserList------------");
		List<User> userList=userDao.findUserList();
		for (User user : userList) {
			System.out.println(user);
		}
		
		UserDaoImplSpringDao userDaoImpl= 
				(UserDaoImplSpringDao)userDao;
		
		System.out.println("----------findUserMap------------");
		Map userMap=userDaoImpl.findUserMap("guard2");
		System.out.println(userMap);
		System.out.println("----------findUserListMap------------");
		List<Map<String,Object>> userMapList=
				userDaoImpl.findUserListMap();
		System.out.println(userMapList);
		
	}

}
