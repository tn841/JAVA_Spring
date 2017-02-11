package com.itwill.ajax.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itwill.ajax.News;

@Controller
public class JsonViewController {
	
	
	/*
	 * news list
	 */
	@RequestMapping(value="newsTitlesJSONView.do",headers="Accept=application/json;charset=utf-8")
	//@ResponseBody -> 커스텀 뷰를 이용할것이기 때문에 없앰
	public String getNewsList(Model model) {
		List<News> newsList = new ArrayList<News>();
		newsList.add(new News("참으로 수고 많으셨습니다…눈물의 YS 영결식", "연합뉴스", new Date().toLocaleString()));
		newsList.add(new News("IS 60개국 테러 위협 영상 공개…한국도 포함 포토", "SBS뉴스", new Date().toLocaleString()));
		newsList.add(new News("통일부 남북 당국회담 실무접촉서 입장차", "KBS뉴스", new Date().toLocaleString()));
		newsList.add(new News("내년도 수도권 집값·전세값↑…2∼3년후 조정", "TBC뉴스", new Date().toLocaleString()));
		newsList.add(new News("국토부 폴크스바겐 경유차 연비 3단계로 조사", "OMY뉴스", new Date().toLocaleString()));
		newsList.add(new News("日롯데 신격호 소송 이해하는가 건강문제 제기", "조선뉴스", new Date().toLocaleString()));
		newsList.add(new News("국가유공자 부인 위장 재혼시 유족자격 있다", "YTN뉴스", new Date().toLocaleString()));
		newsList.add(new News("청소년에 한달 100건 성매매 강요 조폭 징역 6년", "CBS뉴스", new Date().toLocaleString()));
		newsList.add(new News("한국인들 실직·이직 공포에 시달린다", "ITWILL뉴스", new Date().toLocaleString()));
		
		Map map=new HashMap();
		map.put("count", newsList.size());
		map.put("data",newsList);
		
		model.addAttribute(map);
		
		return "jsonView";
	}
	@RequestMapping(value="newsTitlesJSONMyView.do",headers="Accept=application/json;charset=utf-8")
	//@ResponseBody -> 커스텀 뷰를 이용할것이기 때문에 없앰
	public String getNewsList2(Model model) {
		List<News> newsList = new ArrayList<News>();
		newsList.add(new News("참으로 수고 많으셨습니다…눈물의 YS 영결식", "연합뉴스", new Date().toLocaleString()));
		newsList.add(new News("IS 60개국 테러 위협 영상 공개…한국도 포함 포토", "SBS뉴스", new Date().toLocaleString()));
		newsList.add(new News("통일부 남북 당국회담 실무접촉서 입장차", "KBS뉴스", new Date().toLocaleString()));
		newsList.add(new News("내년도 수도권 집값·전세값↑…2∼3년후 조정", "TBC뉴스", new Date().toLocaleString()));
		newsList.add(new News("국토부 폴크스바겐 경유차 연비 3단계로 조사", "OMY뉴스", new Date().toLocaleString()));
		newsList.add(new News("日롯데 신격호 소송 이해하는가 건강문제 제기", "조선뉴스", new Date().toLocaleString()));
		newsList.add(new News("국가유공자 부인 위장 재혼시 유족자격 있다", "YTN뉴스", new Date().toLocaleString()));
		newsList.add(new News("청소년에 한달 100건 성매매 강요 조폭 징역 6년", "CBS뉴스", new Date().toLocaleString()));
		newsList.add(new News("한국인들 실직·이직 공포에 시달린다", "ITWILL뉴스", new Date().toLocaleString()));
		
		Map map=new HashMap();
		map.put("count", newsList.size());
		map.put("data",newsList);
		
		model.addAttribute(map);
		
		return "myJsonView";
	}
	/*
	 * news 
	 */
	@RequestMapping(value="newsTitleJSONView.do",headers="Accept=application/json;charset=utf-8")
	//@ResponseBody
	public String getNews(Model model) {
		News news=new News("한국인들 실직·이직 공포에 시달린다", "ITWILL뉴스", new Date().toLocaleString());
		model.addAttribute(news);
		return "jsonView";
	}
	/************* request accept header 값에따라서 Converter선택*************/
	/*@RequestMapping(value="newsTitle.do")
	@ResponseBody
	public  News getNews1() {
		News news=new News("한국인들 실직·이직 공포에 시달린다", "ITWILL뉴스", new Date().toLocaleString());
		return news;
	}*/
	
	
	/************* request content-type 값에따라서 View선택************/
	@RequestMapping(value="newsTitle.xml")
	public  String getNews1(Model model) {
		News news=new News("한국인들 실직·이직 공포에 시달린다", "ITWILL뉴스", new Date().toLocaleString());
		model.addAttribute("news",news);
		return "xxx";
	}
	
	@RequestMapping(value="newsTitle.json")
	public String getNews2(Model model) {
		News news=new News("한국인들 실직·이직 공포에 시달린다", "ITWILL뉴스", new Date().toLocaleString());
		model.addAttribute("news",news);
		return "z";
	}
	
	
	
	@RequestMapping(value="mapJSONView.do",headers="Accept=application/json;charset=utf-8")
	//@ResponseBody
	public String getMap(Model model){
		
		List<News> newsList = new ArrayList<News>();
		newsList.add(new News("참으로 수고 많으셨습니다…눈물의 YS 영결식", "연합뉴스", new Date().toLocaleString()));
		newsList.add(new News("IS 60개국 테러 위협 영상 공개…한국도 포함 포토", "SBS뉴스", new Date().toLocaleString()));
		newsList.add(new News("통일부 남북 당국회담 실무접촉서 입장차", "KBS뉴스", new Date().toLocaleString()));
		
		Map returnMap=new HashMap();
		returnMap.put("id","guard");
		returnMap.put("name","김경호");
		returnMap.put("age",34);
		returnMap.put("news",new News("국토부 폴크스바겐 경유차 연비 3단계로 조사", "OMY뉴스", new Date().toLocaleString()));
		returnMap.put("newsList",newsList);
		
		model.addAttribute("으항", returnMap);
		
		return "jsonView";
	} 
	
	
	
	
	
	
	
	
	
}
