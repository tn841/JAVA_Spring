package com.itwill6.dependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itwill.user.ExistedUserException;
import com.itwill.user.User;
import com.itwill.user.UserService;
import com.itwill.user.UserServiceImpl;

public class DependencyMain {

	public static void main(String[] args) throws ExistedUserException, Exception {
		System.out.println("------application context[bean factory]초기화전-----");
		ApplicationContext applicationContext=
				new ClassPathXmlApplicationContext("6-1.bean_dependency.xml");
		System.out.println("------application context[bean factory]초기화후-----\n");
		
		System.out.println("1. ---setter injection[기본형]");
		User user1=(User)applicationContext.getBean("setterInjectionUser1");
		System.out.println(">>> "+user1);
		User user2=(User)applicationContext.getBean("setterInjectionUser2");
		System.out.println(">>> "+user2+"\n");
		
		System.out.println("2. ---setter injection[참조형]");
		UserService userService = (UserService) applicationContext.getBean("userService");
		userService.create(null);
		System.out.println();
		
		System.out.println("3. ---constructor injection[기본형]");
		User user3 = (User) applicationContext.getBean("constructorInjectionUser1");
		User user4 = (User) applicationContext.getBean("constructorInjectionUser2");
		System.out.println(">>> "+user3);
		System.out.println(">>> "+user4);
		System.out.println();
		
		
		System.out.println("4. ---constructor injection[참조형]");
		UserServiceImpl userService2 = (UserServiceImpl)applicationContext.getBean("cUserService");
		userService2.create(null);
		System.out.println();
		
		System.out.println("5. ---constructor + setter injection");
		UserService userService3 = (UserService) applicationContext.getBean("Con_Setter_userService");
		userService3.create(null);
		System.out.println();
		
		System.out.println("6. ---collection, Map injection");
		CollectionMapInjectionBean cmib = (CollectionMapInjectionBean) applicationContext.getBean("collectionMapInjectionBean");
		cmib.print();
		
	
	}

}
