package com.itwill.ajax.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itwill.ajax.News;

@Controller
public class JsonMessageController {
	
	
	/*
	 * news list
	 */
	@RequestMapping(value="newsTitlesJSON.do")
	@ResponseBody
	public Map getNewsList() {
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
		
		Map newsMap = new HashMap();
		newsMap.put("count", newsList.size());
		newsMap.put("data", newsList);
		
		
		return newsMap;
	}
	
	/*
	 * news 
	 */
	/* request의 accept header의 application 값에 따라서 xml 또는 json 컨버터가 초이스 된다.*/
	@RequestMapping(value="newsTitle.do")
	@ResponseBody
	public  News getNews() {
		News news=new News("한국인들 실직·이직 공포에 시달린다", "ITWILL뉴스", new Date().toLocaleString());
		return news;
	}
	
	@RequestMapping(value="mapJSON.do",headers="Accept=application/json;charset=utf-8")
	@ResponseBody
	public Map getMap(){
		Map returnMap=new HashMap();
		returnMap.put("id","guard");
		returnMap.put("name","김경호");
		returnMap.put("age",34);
		returnMap.put("news", new News("한국인들 실직·이직 공포에 시달린다", "ITWILL뉴스", new Date().toLocaleString()));
		
		List<News> newsList = new ArrayList<News>();
		newsList.add(new News("참으로 수고 많으셨습니다…눈물의 YS 영결식", "연합뉴스", new Date().toLocaleString()));
		newsList.add(new News("IS 60개국 테러 위협 영상 공개…한국도 포함 포토", "SBS뉴스", new Date().toLocaleString()));
		newsList.add(new News("통일부 남북 당국회담 실무접촉서 입장차", "KBS뉴스", new Date().toLocaleString()));
		returnMap.put("data", newsList);
		
		return returnMap;
	} 
	
	
	
	
	
	
}
