package com.itwill.spring.transaction;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

public class TransactionAdvice {
	
	private PlatformTransactionManager manager;
	
	public void setManager(PlatformTransactionManager manager) {
		System.out.println("\t ### TransactionAdvice.setManager() ");
		this.manager = manager;
	}
	
	
	public Object doActionWithTransaction(ProceedingJoinPoint joinPoint) {
		TransactionStatus status = 
			manager.getTransaction(new DefaultTransactionDefinition());
		System.out.println("###[TransactionAroundAdvice]status:"+status.isNewTransaction());
		Object result = null;
		try {
			
			result = joinPoint.proceed();
			manager.commit(status);
			System.out.println("###[TransactionAroundAdvice]manager.commit()");	
		} catch (Throwable ex) {
			System.out.println("###[TransactionAroundAdvice]manager.rollback()");	
			manager.rollback(status);
			
		}
		return result;
	}

}



