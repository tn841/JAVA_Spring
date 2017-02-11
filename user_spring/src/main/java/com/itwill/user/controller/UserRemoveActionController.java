package com.itwill.user.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itwill.user.UserService;
@Controller
public class UserRemoveActionController {
	@Autowired
	private UserService userService;
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	@RequestMapping("/remove_action")
	public String handleRequest(HttpServletRequest request,
			HttpServletResponse response) {
		String forwardPath="";
		
		if(request.getMethod().equalsIgnoreCase("GET")){
			forwardPath="redirect:user_list";
			return forwardPath;
		}
		try {
			String userId=request.getParameter("userId");
			request.getSession().invalidate();
			userService.remove(userId);
			forwardPath="redirect:main";
		} catch (Exception e) {
			request.setAttribute("error_msg", e.getMessage());
			forwardPath="user_error";
			e.printStackTrace();
		}
		return forwardPath;
	}
	
}
