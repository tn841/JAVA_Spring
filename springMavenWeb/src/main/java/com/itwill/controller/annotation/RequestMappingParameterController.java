package com.itwill.controller.annotation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RequestMappingParameterController {
	//@RequestMapping(value={"/request_param_form","/guest_write_form","/guest_write"},method=RequestMethod.GET)
	@RequestMapping("/request_param_form")
	public String request_param_form(){
		return "request_param_form";
	}
	
	@RequestMapping(value="/request_param_action",method=RequestMethod.POST)
	public String request_param_action(
								@RequestParam(value="guest_name") String g_name,
								@RequestParam(value="guest_title") String g_title,
								@RequestParam(value="guest_email") String g_email,
								@RequestParam(value="guest_homepage") String g_homepage,
								@RequestParam(value="guest_content") String g_content
								){
		System.out.println("-----request_param_action--");
		System.out.println(g_name);
		System.out.println(g_title);
		System.out.println(g_email);
		System.out.println(g_homepage);
		System.out.println(g_content);
		
		return "request_param_result";
	}
	@RequestMapping(value="/request_model_attribute_action")
	public String request_model_attribute_action(@ModelAttribute("xxx") Guest guest){
		/*
			1.Guest객체생성
			2.파라메타뽑기
			3.파라메타이름과 동일한 Guest객체의 set property호출
			4.guest(Guest-->guest)라는 이름으로 Model에 등록
			5.guest 라는 이름으로 request에 등록
		 */
		System.out.println("-----request_model_attribute_action--");
		System.out.println(guest.guest_name);
		System.out.println(guest.guest_title);
		System.out.println(guest.guest_email);
		System.out.println(guest.guest_homepage);
		System.out.println(guest.guest_content);
		
		return "request_param_result";
	}
	
	
	
}
