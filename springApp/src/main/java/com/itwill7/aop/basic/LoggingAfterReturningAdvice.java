package com.itwill7.aop.basic;

import org.aspectj.lang.JoinPoint;

public class LoggingAfterReturningAdvice {
	public void afterReturningLog(JoinPoint jp,Object returnObj){
		System.out.println("###[AfterReturning 충고]메쏘드 리턴전에 필요한작업[예외발생시 실행안됨]-->"+returnObj);
	}
}
