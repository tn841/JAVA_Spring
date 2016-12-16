package com.itwill.controller.annotation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/controller_mapping")
public class RequestMappingController {
	@RequestMapping
	public String controllerMapping(){
		return "controller_mapping";
	}
	@RequestMapping("/list")
	public String list(){
		return "controller_mapping_list";
	}
	@RequestMapping("/view")
	public String view(){
		return "controller_mapping_view";
	}
}
