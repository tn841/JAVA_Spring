package com.itwill5.bean.annotation;


import org.springframework.beans.factory.DisposableBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) throws Exception{
		System.out.println("------application context[bean factory]초기화전-----");
		ApplicationContext applicationContext=
				new ClassPathXmlApplicationContext("5.bean_attr_annotation.xml");
		System.out.println("------application context[bean factory]초기화후-----");
		AnnotationBean abean=
				(AnnotationBean)applicationContext.getBean("annotationBean");
		abean.method1();
		DisposableBean disposableBean = (DisposableBean)applicationContext;
		disposableBean.destroy();
	}

}
