package com.itwill.controller.annotation;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpringCustomTagELController {
		@RequestMapping("/spring_customtag")
		public String spring_customtag(){
			return "spring_customtag";
		}
		@RequestMapping("/spring_el")
		public String spring_el(Model model){
			Guest guest=new Guest(1,
					"KIM", "2016/12/17",
					"guard@google.com", "http://www.naver.com",
					"guest_title","guest_content");
			
			model.addAttribute("guest", guest);
			
			return "spring_el";
		}
		

}
