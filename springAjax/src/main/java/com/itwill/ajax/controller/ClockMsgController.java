package com.itwill.ajax.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ClockMsgController {
	
	@RequestMapping(value="/clock.do", produces="text/plain;charset=UTF-8")
	@ResponseBody
	public String clockMsg(){
		return new Date().toLocaleString();
	}
}
