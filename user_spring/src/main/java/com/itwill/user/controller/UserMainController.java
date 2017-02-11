package com.itwill.user.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;

import javax.xml.crypto.Data;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class UserMainController{
	
	@RequestMapping("/main")
	public String handleRequest() {
		String forwardPath="user_main";
		return forwardPath;
	}
	
	@RequestMapping("/jsoup")
	public String jsoup( Model model ) throws Exception{
		String forwardPath = "jsoup";
		
		Document document = Jsoup.connect("http://www.naver.com").get();
		Elements realtimeKeywordsE = document.select("#ranklist ol li");
		
		System.out.println(realtimeKeywordsE);
		
		model.addAttribute("ranklist", realtimeKeywordsE);
		
		return forwardPath;
	}
	
	@RequestMapping("/json")
	public String json( Model model ) throws Exception{
		String forwardPath = "json";
		
		InputStream is = new URL("https://s.search.naver.com/n/jsonp/hottopic.js?_callback=window.__jindo2_callback._$3361_0&hour=08").openStream();
		Reader reader = new InputStreamReader(is, "UTF-8");
		BufferedReader br = new BufferedReader(reader);
		
		
		
		StringBuffer sb = new StringBuffer();
		
		
		while(true){
			sb.append(br.readLine());
			
			if(br.readLine() == null){
				break;
			}
		
		}
		System.out.println(sb.toString());
		model.addAttribute("jsondata", sb.toString());
		
		return forwardPath;
	}
	
}
