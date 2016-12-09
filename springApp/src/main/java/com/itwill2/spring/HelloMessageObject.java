package com.itwill2.spring;

public class HelloMessageObject implements MessageObject{

	public HelloMessageObject() {
		// TODO Auto-generated constructor stub
		System.out.println(">> HelloMessageObject() 생성");
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Hello Message!!!!";
	}

}
