package com.itwill.controller.annotation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RequestMappingUserController {
	@RequestMapping("/user_create")
	public String user_create(){
		return "user_controller";
	}
	@RequestMapping("/user_login")
	public String user_login(){
		return "user_controller";
	}
	@RequestMapping("/user_list")
	public String user_list(){
		return "user_controller";
	}
	@RequestMapping("/user_view")
	public String user_view(){
		return "user_controller";
	}
}
