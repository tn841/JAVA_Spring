package com.post_trend.task;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.post_trend.realtime.RealTimeDaoImpl;
import com.post_trend.realtime.Realtime;

//@Service
public class RealtimeCrawling {
	
	@Autowired
	RealTimeDaoImpl realTimeDao;
	
	public RealtimeCrawling() {
		System.out.println("Controller 생성자");
	}

	public void setRealTimeDao(RealTimeDaoImpl realTimeDao) {
		this.realTimeDao = realTimeDao;
		System.out.println("** setRealTimeDao : "+realTimeDao);
	}
	
	
	@Scheduled(cron = "*/60 * * * * *")
	public void crawling(){
		
		Realtime newRealt=null;
		
		try {

			Document document = Jsoup.connect("http://naver.com").get();
			
			Elements rank_time = document.select(".rank_time ");		
			String rank_time_str = rank_time.toString();
			int start, end;
			start = rank_time_str.indexOf(">");
			end = rank_time_str.indexOf("기준");
			String crawlingStd = rank_time_str.substring(start+1, end-1);
			
		
			Elements rank_list = document.select("#ranklist ol li");
			
			for(int i=0; i<rank_list.size(); i++){
				Element ele = rank_list.get(i);
				String rank = ele.attr("value");
				String url = ele.getElementsByTag("a").attr("href");
				String keyword = ele.getElementsByClass("ell").text();
				String increase = ele.getElementsByClass("tx").text();
				int degree = 0;
				try{
					degree = Integer.parseInt(ele.getElementsByClass("rk").text());		
				}
				catch(Exception e){
					
				}
				Realtime rt = new Realtime(keyword, url, Integer.parseInt(rank), crawlingStd, "네이버", increase, degree);
				realTimeDao.create(rt);
			}
			
			System.out.println(crawlingStd+" : naver insert 완료.");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}//naver crawling
	
	@Scheduled(cron = "*/60 * * * * *")
	public void daumCrawling(){
		Document document = null;
		try {
			document = Jsoup.connect("http://www.daum.net/").get();
			Elements realtimeword = document.select(".rank_dummy");
			for(int i=0; i<realtimeword.size(); i++){
				Element ele = realtimeword.get(i);
			
				String str = ele.select(".rank_dummy").text();
				String rank = ele.select(".rank_issue").text();
				String url = ele.select(".rank_dummy a").attr("href");
				String keywoard = ele.select(".txt_issue").text();
				String increaseStr = ele.select(".num_issue").text();
				int degree = 0;
				
				if(!increaseStr.equals("신규진입")){
					String[] strArr = increaseStr.split(" ");
					increaseStr = strArr[1].substring(0,2);
					degree = Integer.parseInt(strArr[1].substring(2));
				}
				Realtime rt = new Realtime(keywoard, url, Integer.parseInt(rank.replace("위", "")), new Date().toLocaleString(), "다음", increaseStr, degree);
				realTimeDao.create(rt);
				
				
			}//for
			
			System.out.println(new Date().toLocaleString()+" : daum insert 완료.");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}//daumCrawling

}
