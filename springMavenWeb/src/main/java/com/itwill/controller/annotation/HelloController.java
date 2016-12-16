package com.itwill.controller.annotation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("helloController2")
public class HelloController {
	
	public HelloController() {
		System.out.println("### HelloController()생성자");
	}
	@RequestMapping(value={"/hello2"})
	public String hello(){
		System.out.println("### HelloController.hello()메쏘드");
		return "hello";
	}
}
