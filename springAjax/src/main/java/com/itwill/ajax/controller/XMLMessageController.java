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
import com.itwill.ajax.NewsListResult;
import com.itwill.ajax.ResultMap;

@Controller
public class XMLMessageController {
	
	
	
	@RequestMapping(value="newsTitlesXML.do", headers="Accept=application/xml")
	@ResponseBody
	public NewsListResult getNewsList(){
	    
		List<News> newsList=new ArrayList<News>();
		newsList.add(new News("참으로 수고 많으셨습니다…눈물의 YS 영결식","연합뉴스",new Date().toLocaleString()));
		newsList.add(new News("IS 60개국 테러 위협 영상 공개…한국도 포함 포토","SBS뉴스",new Date().toLocaleString()));
		newsList.add(new News("통일부 남북 당국회담 실무접촉서 입장차","KBS뉴스",new Date().toLocaleString()));
		newsList.add(new News("내년도 수도권 집값·전세값↑…2∼3년후 조정","TBC뉴스",new Date().toLocaleString()));
		newsList.add(new News("국토부 폴크스바겐 경유차 연비 3단계로 조사","OMY뉴스",new Date().toLocaleString()));
		newsList.add(new News("日롯데 신격호 소송 이해하는가 건강문제 제기","조선뉴스",new Date().toLocaleString()));
		newsList.add(new News("국가유공자 부인 위장 재혼시 유족자격 있다","YTN뉴스",new Date().toLocaleString()));
		newsList.add(new News("청소년에 한달 100건 성매매 강요 조폭 징역 6년","CBS뉴스",new Date().toLocaleString()));
		newsList.add(new News("한국인들 실직·이직 공포에 시달린다","ITWILL뉴스",new Date().toLocaleString()));
		
		NewsListResult result = new NewsListResult();
		result.setCount(newsList.size());
		result.setNewList(newsList);
		
		return result;
	}
	
	
	@RequestMapping(value="newsTitleXML.do",headers="Accept=application/xml;charset=utf-8")
	@ResponseBody
	public  News getNews() {
		News news=new News("한국인들 실직·이직 공포에 시달린다", "ITWILL뉴스", new Date().toLocaleString());
		return news;
	}
	
	@RequestMapping(value="mapXML.do")
	@ResponseBody
	public ResultMap getMap(){
		Map map = new HashMap();
		map.put("news", new News("한국인들 실직·이직 공포에 시달린다","ITWILL뉴스",new Date().toLocaleString()));
		
		
		Map newsMap = new HashMap<>();
		newsMap.put("title", "뉴스제목");
		newsMap.put("company", "ss뉴스");
		newsMap.put("date", new Date().toLocaleString());
		
		ResultMap resultMap = new ResultMap();
		resultMap.setCount(9);
		resultMap.setMemberMap(newsMap);
		
		return resultMap;
	}
}
