package com.itwill.ajax.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StringMsgController {
	/*
	 * @ResponseBody에 의해 반환되는 String(DTO, Collection, Map)데이터는
	 * MessageConverter[StringHttpConverter]에 의해 변환되어 응답, 출력된다.
	 */
	@RequestMapping(
			value="/helloAjaxRequest.do", 
			produces="text/plain;charset=UTF-8")
	@ResponseBody
	public String helloAjaxRequest(@RequestParam String id){
		
		String msg="";
		
		if(id.startsWith("guard")){
			msg = id+"사용가능";
		}else{
			msg = id+"사용불가능";
		}
		
		return msg;
	}
}
