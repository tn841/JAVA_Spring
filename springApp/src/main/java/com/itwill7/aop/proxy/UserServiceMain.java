package com.itwill7.aop.proxy;

public class UserServiceMain {

	public static void main(String[] args) {
		System.out.println("----------------OOP Problem-------");
		UserService userService=
				new UserServiceImplOOP();
		userService.create();
		userService.list();
		userService.login();
		userService.view();
		System.out.println("----------------AOP 미적용-------");
		UserService userService2=new UserServiceImplAOP();
		userService2.create();
		userService2.list();
		userService2.login();
		userService2.view();
		System.out.println("----------------AOP 적용-------");
		UserService userService3=
				new UserSeriveLogProxy(
						new UserServiceImplAOP(),
						new BeforeLogAdvice());
		userService3.create();
		userService3.list();
		userService3.login();
		userService3.view();
		System.out.println("----------------AOP 적용2-------");
		UserService userService4=
				new UserSeriveLogProxy(new UserServiceImpl(), new BeforeLogAdvice());
		userService4.create();
		userService4.list();
		userService4.login();
		userService4.view();
	}

}
