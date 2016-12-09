package com.itwill7.aop.basic;

public class EmailSendAfterThrowingTargetBean {
	public void exceptionThrowMethod(){
		
		throw new IllegalArgumentException("잘못된 인수입니다");
		
	}
}
