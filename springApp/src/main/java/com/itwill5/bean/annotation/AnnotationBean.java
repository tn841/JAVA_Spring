package com.itwill5.bean.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("annotationBean")
//@Lazy
@Scope("singleton")

public class AnnotationBean {
	public AnnotationBean() {
		System.out.println("### AnnotationBean()생성자");
	}
	@PostConstruct
	public void myInit(){
		System.out.println("### AnnotationBean.myInit() 메쏘드");
	}
	@PreDestroy
	public void myDestroy(){
		System.out.println("### AnnotationBean.myDestroy() 메쏘드");
	}
	public void method1(){
		System.out.println("### AnnotationBean.method1()메쏘드호출");
	}
}
