package com.itwill6.dependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyAutoWireAnnotaionMain {

	public static void main(String[] args) {
		System.out.println("------application context[bean factory]초기화전-----");
		ApplicationContext applicationContext=
				new ClassPathXmlApplicationContext("6-2.bean_dependency_auto_wire.xml");
		System.out.println("------application context[bean factory]초기화후-----\n");
	}

}
