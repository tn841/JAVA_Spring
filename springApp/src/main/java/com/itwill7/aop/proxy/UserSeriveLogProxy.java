package com.itwill7.aop.proxy;

public class UserSeriveLogProxy implements UserService{
	private UserService userService;   //target object
	private BeforeLogAdvice logAdvice; //advice object
	public UserSeriveLogProxy(UserService target,BeforeLogAdvice advice) {
		userService=target;
		logAdvice=advice;
	}
	@Override
	public void create() {
		logAdvice.beforeLog();
		userService.create();
		
	}

	@Override
	public void login() {
		logAdvice.beforeLog();
		userService.login();
		
		
	}

	@Override
	public void list() {
		logAdvice.beforeLog();
		userService.list();
		
	}

	@Override
	public void view() {
		logAdvice.beforeLog();
		userService.view();
	}
	
}
