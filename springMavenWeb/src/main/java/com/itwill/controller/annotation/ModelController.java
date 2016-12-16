package com.itwill.controller.annotation;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ModelController {
	@RequestMapping("/request")
	public String handleRequest(HttpServletRequest request){
		request.setAttribute("request", "리퀘스트데이타");
		return "model";
	}
	@RequestMapping("/model")
	public String handleModel(Model model){
		model.addAttribute("model", "모델데이타");
		
		return "model";
	}
	@RequestMapping("/model_map")
	public String handleModelMap(ModelMap modelMap){
		modelMap.addAttribute("model_map", "모델맵데이타");
		
		return "model";
	}
	@RequestMapping("/model_view")
	public ModelAndView handleModelAndView(){
		ModelAndView mv=new ModelAndView();
		mv.addObject("model_view", "모델앤뷰");
		mv.setViewName("model");
		return mv;
		
	}
	
	@RequestMapping("/map")
	public String handleMap(Map<String,String> map){
		map.put("map", "맵데이타");
		return "model";
	}
	@RequestMapping("/all_model")
	public String handleAll(HttpServletRequest request,
							Model model,
							ModelMap modelMap,
							Map map){
		
		request.setAttribute("request", "리퀘스트데이타");
		model.addAttribute("model", "모델데이타");
		modelMap.addAttribute("model_map", "모델맵데이타");
		map.put("map", "맵데이타");
		
		return "model";
	}
	
}










