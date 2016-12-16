package com.itwill.controller.annotation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*
 * 같은 URL mapping  인경우 GET,POST요청에따른 메쏘드실행
 */
@Controller
public class RequestMappingGETPOSTController {
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String loginForm(){
		return "login_form";
	}
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String loginAction(){
		//로그인시도
		return "login_result";
	}
}
