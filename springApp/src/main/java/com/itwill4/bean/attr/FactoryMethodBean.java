package com.itwill4.bean.attr;

public class FactoryMethodBean {
	private FactoryMethodBean() {
		System.out.println("### FactoryMethodBean()생성자");
	}
	public static FactoryMethodBean getInstance(){
		System.out.println("### FactoryMethodBean getInstance() 메쏘드");
		return new FactoryMethodBean();
	}
}
