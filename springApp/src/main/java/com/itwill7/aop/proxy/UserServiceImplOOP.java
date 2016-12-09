package com.itwill7.aop.proxy;

public class UserServiceImplOOP implements UserService{
	BeforeLogAdvice advice=new BeforeLogAdvice();
	@Override
	public void create() {
		advice.beforeLog();
		System.out.println("### UserServiceImplOOP.create()");
		
	}

	@Override
	public void login() {
		advice.beforeLog();
		System.out.println("### UserServiceImplOOP.login()");
		
	}

	@Override
	public void list() {
		advice.beforeLog();
		System.out.println("### UserServiceImplOOP.list()");
		
	}

	@Override
	public void view() {
		advice.beforeLog();
		System.out.println("### UserServiceImplOOP.view()");
		
	}

}
