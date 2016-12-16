package com.itwill.controller.annotation;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
@SessionAttributes("sUserId")
@Controller
public class SessionAttributeLoginController {
	
	@RequestMapping(value={"/session_login1","/session_login2"},method=RequestMethod.GET)
	public String login_form(){
		
		return "session_login_form";
	}
	
	@RequestMapping(value="/session_login1",method=RequestMethod.POST)
	public String login1(HttpServletRequest request,
						@RequestParam("userId") String userId,
						@RequestParam("password") String password
						){
		System.out.println("param userId="+userId);
		System.out.println("param password="+password);
		boolean isLogin=true;
		if(isLogin){
			request.getSession().setAttribute("sUserId", userId);
			return "session_login_success_result";
		}else{
			
			return "session_login_success_fail";
		}
	}
	
	@RequestMapping(value="/session_login2",method=RequestMethod.POST)
	public String login2(Model model,
						@RequestParam("userId") String userId,
						@RequestParam("password") String password
						){
		System.out.println("param userId="+userId);
		System.out.println("param password="+password);
		boolean isLogin=true;
		if(isLogin){
			model.addAttribute("sUserId", userId);
			return "session_login_success_result";
		}else{
			
			return "session_login_success_fail";
		}
	}
	
	@RequestMapping("/session_use1")
	public String session_use1(@ModelAttribute("sUserId") String sUserId  ){
		System.out.println(">>> session sUserId :"+sUserId);
		
		return "session_use1";
	}
	@RequestMapping("/session_use2")
	public String session_use2(@ModelAttribute("sUserId") String sUserId){
		System.out.println(">>> session sUserId :"+sUserId);
		return "session_use2";
	}
	@RequestMapping("/session_logout1")
	public String logout1(HttpSession session){
		//session.invalidate();
		//session.removeAttribute("sUserId");
		
		return "session_use1";
	}
	@RequestMapping("/session_logout2")
	public String logout2(SessionStatus st,@ModelAttribute("sUserId") String sUserId){
		st.setComplete();
		return "session_login_form";
	}
}










