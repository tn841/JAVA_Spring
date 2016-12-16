package com.itwill.controller.annotation;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/*
 * Exception 이발생하면 실행될메쏘드를 정의하고있는 컨트롤러
 * 모든컨트롤러에서 발생하는 Exception을처리
 */
@ControllerAdvice
public class GlobalExceptionController {
	/*
	@ExceptionHandler(Exception.class)
	public String gloabl_exception_handler(Exception ex){
		
		return "global_error";
	}
	
	@ExceptionHandler(Exception.class)
	public @ResponseBody String gloabl_exception_handler(Exception ex) throws Exception{
		String data=new String(">>>>>>>>> Global Error!!!! "+ex.getMessage());
		return data;
	}
	
	
	*/
	@ExceptionHandler(Exception.class)
	public ModelAndView gloabl_exception_handler(Exception ex){
		ModelAndView mv=new ModelAndView();
		mv.addObject("error_msg", ex.getMessage());
		mv.setViewName("global_error");
		return mv;
	}
}
