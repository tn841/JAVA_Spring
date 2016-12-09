package com.itwill7.aop.proxy;

public class UserServiceImplAOP implements UserService{

	@Override
	public void create() {
		
		System.out.println("### UserServiceImplAOP.create()");
		
	}

	@Override
	public void login() {
		System.out.println("### UserServiceImplAOP.login()");
		
	}

	@Override
	public void list() {
		System.out.println("### UserServiceImplAOP.list()");
		
	}

	@Override
	public void view() {
		System.out.println("### UserServiceImplAOP.view()");
		
	}

}
