package com.itwill7.aop.proxy;

public class UserServiceImpl implements UserService{

	@Override
	public void create() {
		System.out.println("### UserServiceImpl.create()");
		
	}

	@Override
	public void login() {
		System.out.println("### UserServiceImpl.login()");
		
	}

	@Override
	public void list() {
		System.out.println("### UserServiceImpl.list()");
		
	}

	@Override
	public void view() {
		System.out.println("### UserServiceImpl.view()");
		
	}

}
