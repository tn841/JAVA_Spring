package com.itwill7.aop.basic;

import org.aspectj.lang.JoinPoint;

public class EmailSendAfterThrowingAdvice {
	public void emailSend(JoinPoint jp,Exception exObj)throws Throwable{
		
		System.out.println("###[After Throwing]예외발생시처리할작업기술-->이메일전송 >>> "+exObj.getMessage());
	}

}
