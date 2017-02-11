package com.post_trend.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.post_trend.realtime.RealTimeDaoImpl;
import com.post_trend.realtime.Realtime;

@Controller
public class RealtimeContorller {
		
	@Autowired
	RealTimeDaoImpl realTimeDao;
	
	

	@RequestMapping("/realtime_board")
	public String select_recent20rows(Model model){
		ArrayList<Realtime> naver_rt = new ArrayList<Realtime>();
		ArrayList<Realtime> daum_rt = new ArrayList<Realtime>();
		
		naver_rt = realTimeDao.select_naver_realtime();
		model.addAttribute("naver_list", naver_rt);
		
		daum_rt = realTimeDao.select_daum_realtime();
		model.addAttribute("daum_list", daum_rt);
		
		
		//System.out.println("--"+realtimeList.get(0).getRealtime_standard()+"--");
		for(Realtime row : naver_rt){
			//System.out.println(row.getRealtime_rank()+", "+row.getRealtime_keyword());
		}

		return "realtime_board";
	}
	

	
}
