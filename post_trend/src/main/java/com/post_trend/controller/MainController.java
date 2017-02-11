package com.post_trend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@RequestMapping("/main")
	public ModelAndView main(){
		ModelAndView mv = new ModelAndView();
		System.out.println("main");
		mv.setViewName("index");
		
		return mv;
	}
	
}
