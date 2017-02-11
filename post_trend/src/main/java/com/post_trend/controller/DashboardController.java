package com.post_trend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DashboardController {

	@RequestMapping("/default_dashboard")
	public ModelAndView default_dashboard(){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("default_dashboard");
		return mv;
	}
	@RequestMapping("/custom_dashboard")
	public ModelAndView custom_dashboard(){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("custom_dashboard");
		return mv;
	}
}
