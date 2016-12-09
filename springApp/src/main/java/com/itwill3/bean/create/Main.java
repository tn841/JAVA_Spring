package com.itwill3.bean.create;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		System.out.println("------application context[bean factory]초기화전-----");
		ApplicationContext applicationContext=
				new ClassPathXmlApplicationContext("3.bean_create.xml");
		System.out.println("------application context[bean factory]초기화후-----");
		CreateBean cb1=(CreateBean)applicationContext.getBean("createBean");
		CreateBean cb2=(CreateBean)applicationContext.getBean("createBean");
		System.out.println(">>> "+cb1);
		System.out.println(">>> "+cb2);
		cb1.method1();
		cb2.method1();
	}

}
