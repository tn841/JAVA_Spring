package com.itwill.user.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class UserLogoutActionController{
	@RequestMapping("/logout_action")
	public String handleRequest(HttpServletRequest request) {
		String forwardPath="";
		
		request.getSession().invalidate();
		
		forwardPath="redirect:main";
		
		return forwardPath;
	}
	
}
