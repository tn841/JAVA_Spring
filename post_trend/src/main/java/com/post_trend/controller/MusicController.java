package com.post_trend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MusicController {
	
	@RequestMapping("/music_board")
	public ModelAndView music_board(){
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("music_board");
		return mv;
	}
}
