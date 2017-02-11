package com.itwill.user.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itwill.user.User;
import com.itwill.user.UserService;

@Controller
public class UserModifyFormController {
	@Autowired
	private UserService userService;
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	@RequestMapping(value="/modify_form", produces="text/html;charset=UTF-8")
	public String handleRequest(HttpServletRequest request) {
		String forwardPath="";
		
		if(request.getMethod().equalsIgnoreCase("GET")){
			forwardPath="redirect:user_list";
			return forwardPath;
		}
		try {
			String userId = request.getParameter("userId");
			User user = userService.findUser(userId);
			request.setAttribute("user", user);
			forwardPath="user_modify_form";
		} catch (Exception e) {
			request.setAttribute("error_msg", e.getMessage());
			forwardPath="user_error";
			e.printStackTrace();
		}
		return forwardPath;
	}
	
}
