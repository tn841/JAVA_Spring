package com.itwill.user.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itwill.user.User;
import com.itwill.user.UserService;

@Controller
public class UserListController{
	@Autowired
	private UserService userService;
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping("/list")
	public String handleRequest(HttpServletRequest request) {
		String forwardPath="";
		
		try {
			
			List<User> userList = (List<User>)userService.findUserList();
			request.setAttribute("userList", userList); // 모델로 대신할 수 있ㅇ므.
			forwardPath="user_list";
		} catch (Exception e) {
			request.setAttribute("error_msg", e.getMessage());
			forwardPath="user_error";
			e.printStackTrace();
		}
		return forwardPath;
	}
	
}
