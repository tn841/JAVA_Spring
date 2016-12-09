package com.itwill2.spring;

public class HiMessageObject implements MessageObject{
	
	public HiMessageObject() {
		// TODO Auto-generated constructor stub
		System.out.println(">> HiMessageObject() 생성");
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Hi Message!!!";
	}

}
