package com.itwill.user.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itwill.user.User;
import com.itwill.user.UserService;
@Controller
public class UserViewController {
	@Autowired
	private UserService userService;
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	@RequestMapping("/view")
	public String handleRequest(HttpServletRequest request,
			HttpServletResponse response) {
		String forwardPath="";
		
		String userId=request.getParameter("userId");
		if(userId==null){
			forwardPath="redirect:list";
			return forwardPath;
		}
		User user=null;
		try {
			user = userService.findUser(userId);
			request.setAttribute("user",user);
			forwardPath="user_view";
		} catch (Exception e) {
			request.setAttribute("error_msg", e.getMessage());
			forwardPath="user_error";
			e.printStackTrace();
		}
		return forwardPath;
	}
	
}
