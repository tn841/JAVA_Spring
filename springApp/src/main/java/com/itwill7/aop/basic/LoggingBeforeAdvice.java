package com.itwill7.aop.basic;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;

public class LoggingBeforeAdvice {
	public void beforeLog(JoinPoint jp){
		
		Object target=jp.getTarget();
		Class targetClass = target.getClass();
		String className = targetClass.getSimpleName();
		
		Signature methodSinature=jp.getSignature();
		String methodName=methodSinature.getName();
		int modifierInt=methodSinature.getModifiers();
		
		Object[] args = jp.getArgs();
		int argLength=0;
		if(args!=null){
			 argLength = args.length;
		}
		String logMsg=className+"."+methodName+"("+argLength+")";
		System.out.println("###[사전충고]:"+logMsg+"  메쏘드가 호출되기전에 필요한작업처리(log)");
	}

}
