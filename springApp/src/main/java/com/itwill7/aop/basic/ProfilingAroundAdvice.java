package com.itwill7.aop.basic;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

public class ProfilingAroundAdvice {
	public Object aroundProfilingAdvice(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("###[Around Advice]비즈니스메쏘드호출전에 필요한작업");
		//메쏘드 실행전
		StopWatch sw=new StopWatch();
		sw.start();
		//target객체(비지니스객체)메쏘드실행
		Object returnObject=pjp.proceed();
		sw.stop();
		//메쏘드 실행후
		String className=pjp.getTarget().getClass().getSimpleName();
		String methodName=pjp.getSignature().getName();
		long duration =sw.getTotalTimeMillis();
		String profilingMsg=
				className+"."+methodName+"() took "+duration+" ms";
		System.out.println(">>>[execution time]:"+profilingMsg);
		System.out.println("###[Around Advice]비즈니스메쏘드호출후에 필요한작업");
		
		return returnObject;
	}
}
