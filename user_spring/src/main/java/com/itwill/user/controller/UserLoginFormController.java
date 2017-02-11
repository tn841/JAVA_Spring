package com.itwill.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class UserLoginFormController{
	
	@RequestMapping("/login_form")
	public String handleRequest() {
		String forwardPath="user_login_form";
		return forwardPath;
	}

}
