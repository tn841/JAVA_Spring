package com.itwill2.spring;

public class GoodByeMessageObject implements MessageObject{
	
	public GoodByeMessageObject() {
		// TODO Auto-generated constructor stub
		System.out.println(">> GoodByeMessageObject() 생성");
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "GoodBye Message!!!";
	}

}
