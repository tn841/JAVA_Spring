package com.itwill.controller.annotation;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class SevletAPIController {
	@RequestMapping("/servletapi")
	public String servletapi(
			HttpServletRequest request,
			HttpServletResponse response,
			HttpSession session){
			System.out.println("### "+request);
			System.out.println("### "+response);
			System.out.println("### "+session);
		return "servlet_api";
	}
}
