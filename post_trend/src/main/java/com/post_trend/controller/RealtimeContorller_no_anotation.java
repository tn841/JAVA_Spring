package com.post_trend.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

import com.post_trend.realtime.RealTimeDaoImpl;
import com.post_trend.realtime.Realtime;

//@Controller
public class RealtimeContorller_no_anotation implements org.springframework.web.servlet.mvc.Controller {
		
	//@Autowired
	RealTimeDaoImpl realTimeDao;
	
	public RealtimeContorller_no_anotation() {
		System.out.println("Controller 생성자");
	}

	public void setRealTimeDao(RealTimeDaoImpl realTimeDao) {
		this.realTimeDao = realTimeDao;
		System.out.println("** setRealTimeDao : "+realTimeDao);
	}


	//@RequestMapping("/realtime_create")
//	public void realtime_create(){
//		
//		Realtime newRealt = new Realtime("keyword1", "url1", 3, "standard1", "portal1");
//		System.out.println("** create row : "+realTimeDao.create(newRealt));
//	}


	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		String forwardPath = "/WEB-INF/view/showMessage.jsp";
		System.out.println(" ** realtime_create controller");
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName(forwardPath);
		
		Realtime newRealt = new Realtime("keyword1", "url1", 3, "standard1", "portal1", "상승", 120);
		System.out.println("** create row (어노테이션 미사용) : "+realTimeDao.create(newRealt));
		return mv;
	}


	
}
