package com.itwill.controller.annotation;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExceptionController {
	
	@RequestMapping("/exception/business1")
	public String business_method1() throws BusinessException1{
		boolean b = true;

		if (b) {
			throw new BusinessException1("업무1애로사항");
		}

		return "business_result1";
	}
	@RequestMapping("/exception/business2")
	public String business_method2() throws BusinessException2{
		boolean b = true;

		if (b) {
			throw new BusinessException2("업무2애로사항");
		}
		return "business_result2";
	}
	@RequestMapping("/exception/business3")
	public String business_method3() throws Exception{
		boolean b = true;

		if (b) {
			throw new Exception("잘모르는예외!!!");
		}

		return "business_result3";
	}
	/**********local exception handling method***********/
	@ExceptionHandler(BusinessException1.class)
	public String handle_business_exception1(BusinessException1 bex1){
		//model.addAttribute("error_msg",bex1.getMessage());
		return "business_error";
	}
	@ExceptionHandler(BusinessException2.class)
	public String handle_business_exception2(BusinessException2 bex2){
		//model.addAttribute("error_msg",bex2.getMessage());
		return "business_error";
	}
	/*
	@ExceptionHandler(Exception.class)
	public String handle_exception(Exception ex){
		//model.addAttribute("error_msg",ex.getMessage());
		return "business_error";
	}
	*/
	
	
	
	
	
	
}
