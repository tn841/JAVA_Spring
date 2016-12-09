package com.itwill7.aop.basic;

public class LoggingAfterAdvice {
	public void afterLog(){
		System.out.println("###[사후충고]메쏘드호출후에 필요한작업");
	}
}
