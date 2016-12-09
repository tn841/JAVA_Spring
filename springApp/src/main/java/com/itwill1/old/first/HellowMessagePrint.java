package com.itwill1.old.first;

public class HellowMessagePrint {
	/*
	 * HelloMessageObject객체 생성 메소드
	 */
	public HelloMessageObject getHelloMessageObject(){
		return new HelloMessageObject();
	}
	
	
	/*
	 * HelloMessage print 메소드
	 */
	public void helloMessagePrint(){
		String helloMessage = this.getHelloMessageObject().getHelloMessage();
		System.out.println(helloMessage);
	}
}
