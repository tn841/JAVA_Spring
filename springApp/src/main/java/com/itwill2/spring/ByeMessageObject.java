package com.itwill2.spring;

public class ByeMessageObject implements MessageObject{
	
	public ByeMessageObject() {
		// TODO Auto-generated constructor stub
		System.out.println(">> ByeMessageObject() 생성");
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Bye Message!!!!";
	}

}
