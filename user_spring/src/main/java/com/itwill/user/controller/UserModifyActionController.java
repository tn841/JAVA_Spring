package com.itwill.user.controller;

import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itwill.user.User;
import com.itwill.user.UserService;
@Controller
public class UserModifyActionController {
	@Autowired
	private UserService userService;
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	@RequestMapping(value="/modify_action", produces="text/html;charset=UTF-8")
	public String handleRequest(HttpServletRequest request) {
		String forwardPath="";
		if(request.getMethod().equalsIgnoreCase("GET")){
			forwardPath="user_list";
			return forwardPath; 
		}
		String userId=request.getParameter("userId");
		System.out.println("뭐가 나오나요? : "+userId);
		String password=request.getParameter("password");
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		User updateUser=new User(userId,password,name,email);
		try {
			userService.update(updateUser);
			forwardPath="redirect:view?userId="+URLEncoder.encode(userId,"UTF-8");
			System.out.println("리다이렉트는? : "+forwardPath);
		} catch (Exception e) {
			request.setAttribute("error_msg", e.getMessage());
			forwardPath="user_error";
			e.printStackTrace();
		}
		return forwardPath;
	}
}
