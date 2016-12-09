package com.itwill4.bean.attr;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args)throws Exception {
		System.out.println("------application context[bean factory]초기화전-----");
		ApplicationContext applicationContext=
				new ClassPathXmlApplicationContext("4.bean_attr.xml");
		System.out.println("------application context[bean factory]초기화후-----");
		
		System.out.println("--------lazy-init----------");
		InitDestroyBean initDestroyBean=(InitDestroyBean)
				applicationContext.getBean("initDestroyBean");
		System.out.println("--------factory-method----------");
		FactoryMethodBean fmb=
				(FactoryMethodBean)applicationContext.getBean("factoryBean");
		System.out.println(">>>"+fmb);
		DisposableBean disposableContext=(DisposableBean)applicationContext;
		System.out.println("--------singleton scope----------");
		
		SingletonScopeBean ssb1=(SingletonScopeBean)
					applicationContext.getBean("singletonBean");
		SingletonScopeBean ssb2=(SingletonScopeBean)
				applicationContext.getBean("singletonBean");
		SingletonScopeBean ssb3=(SingletonScopeBean)
				applicationContext.getBean("singletonBean");
		SingletonScopeBean ssb4=(SingletonScopeBean)
				applicationContext.getBean("singletonBean");
		
		System.out.println(ssb1);
		System.out.println(ssb2);
		System.out.println(ssb3);
		System.out.println(ssb4);
		
		System.out.println("--------prototype scope----------");
		PrototypeScopeBean psb1=(PrototypeScopeBean)
				applicationContext.getBean("prototypeBean");
		PrototypeScopeBean psb2=(PrototypeScopeBean)
				applicationContext.getBean("prototypeBean");
		PrototypeScopeBean psb3=(PrototypeScopeBean)
				applicationContext.getBean("prototypeBean");
		System.out.println(psb1);
		System.out.println(psb2);
		System.out.println(psb3);
		
		/*
		 * Container 안에있는Bean을 제거
		 */
		disposableContext.destroy();
		
		
	}

}
