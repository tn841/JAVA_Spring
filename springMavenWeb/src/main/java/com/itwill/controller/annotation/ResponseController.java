package com.itwill.controller.annotation;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ResponseController {
	@RequestMapping(
			value="/response/string",
			produces="text/plain;charset=UTF-8")
	public @ResponseBody String responseString(){
		
		return "string response body data[한글]";
	}
	@RequestMapping(
			value="/response/html",
			produces="text/html;charset=UTF-8")
	public @ResponseBody String responseHtml(){
		
		return "<h1>string response body data[한글]</h1><hr/>";
	}
	@RequestMapping(value="reponse/xmlview")
	public ModelAndView responseView(){
		ModelAndView mv=new ModelAndView();
		//View객체
		mv.setView(new XMLView());
		//Model데이타
		ArrayList<String> nameList=new ArrayList<String>();
		nameList.add("KIM");
		nameList.add("JIM");
		nameList.add("PIM");
		nameList.add("DIM");
		nameList.add("FIM");
		nameList.add("SIM");
		nameList.add("AIM");
		nameList.add("VIM");
		nameList.add("BIM");
		nameList.add("ZIM");
		nameList.add("XIM");
		nameList.add("QIM");
		mv.addObject("nameList", nameList);
		return mv;
		
	}
	
}
