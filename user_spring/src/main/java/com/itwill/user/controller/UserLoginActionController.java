package com.itwill.user.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itwill.user.PasswordMismatchException;
import com.itwill.user.User;
import com.itwill.user.UserNotFoundException;
import com.itwill.user.UserService;
@Controller
public class UserLoginActionController{
	@Autowired
	private UserService userService;
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping("/login_action")
	public String handleRequest(HttpServletRequest request,
			HttpServletResponse response) {
		String forwardPath="";
		if(request.getMethod().equalsIgnoreCase("GET")){
			try {
				response.sendRedirect("redirect:login_form");
			} catch (IOException e) {
				e.printStackTrace();
			}
			return forwardPath;
		}	
		String userId=request.getParameter("userId");
		String password=request.getParameter("password");
		
		try{
			User loginUser=userService.login(userId,password);
			request.getSession().setAttribute("sUserId", userId);
			request.getSession().setAttribute("sUser", loginUser);
			forwardPath="redirect:list";
			return forwardPath;
		}catch(UserNotFoundException e){
			
			request.setAttribute("fuser",new User(userId,password,"","") );
			request.setAttribute("MSG1",e.getMessage());
			
			forwardPath="user_login_form";
			
		}catch(PasswordMismatchException e){
			
			request.setAttribute("fuser",new User(userId,password,"","") );
			request.setAttribute("MSG2", e.getMessage());
			forwardPath="user_login_form";
		}catch(Exception e){
			
			e.printStackTrace();
			request.setAttribute("error_msg", e.getMessage());
			forwardPath="user_error";
		}
		return forwardPath;
	}
	
}
