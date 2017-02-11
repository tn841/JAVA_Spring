package com.itwill.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserWriteFormController {

	@RequestMapping("/write_form")
	public String handleRequest() {
		String forwardPath="user_write_form";
		return forwardPath;
	}

}
