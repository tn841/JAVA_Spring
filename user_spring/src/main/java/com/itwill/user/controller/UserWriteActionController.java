package com.itwill.user.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itwill.user.ExistedUserException;
import com.itwill.user.User;
import com.itwill.user.UserService;
@Controller
public class UserWriteActionController {
	@Autowired
	private UserService userService;
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	@RequestMapping("/write_action")
	public String handleRequest(
			HttpServletRequest request,
			HttpServletResponse response) {
		String forwardPath="";
		
		if(request.getMethod().equalsIgnoreCase("GET")){
			forwardPath="redirect:user_write_form";
			return forwardPath;
		}

		String userId=request.getParameter("userId");
		String password=request.getParameter("password");
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		

		User user=new User(userId,password,name,email);
		try{
		
			userService.create(user);

			forwardPath="redirect:login_form";
			return forwardPath;
		}catch(ExistedUserException e){
			
			request.setAttribute("fuser", user);
			request.setAttribute("MSG", e.getMessage());
			forwardPath="user_write_form";
		}catch(Exception e){
			request.setAttribute("error_msg", e.getMessage());
			forwardPath="user_error";
		}
		return forwardPath;
	}
	
}
