package com.post_trend.news;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import ch.qos.logback.core.net.SyslogOutputStream;

public class NewsWebScraping {
	private Elements newsTitle;
	private String editDateText;
	private String headlines;
	private Elements gomedia;
	
	public NewsWebScraping() {
		// TODO Auto-generated constructor stub
	}

	public NewsWebScraping(Elements newsTitle, String editDateText, String headlines, Elements gomedia) {
		super();
		this.newsTitle = newsTitle;
		this.editDateText = editDateText;
		this.headlines = headlines;
		this.gomedia = gomedia;
	}

	/*
	 * 인자( URL,회사번호 )
	 */
	public NewsWebScraping newsWebScrapingController(String company) throws IOException{
		Document doc=null;
		Document focusNews=null;
		System.out.println("*** 신문사 : "+company);
		if(News.CHOSEON.equals(company)){
			doc=Jsoup.connect("http://newsstand.naver.com/?list=ct1&pcode=023").get();
			focusNews=Jsoup.connect("http://newsstand.naver.com/include/page/023.html").get();
		}else if(News.GYENGHYANG.equals(company)){
			doc=Jsoup.connect("http://newsstand.naver.com/?list=ct1&pcode=032").get();
			focusNews=Jsoup.connect("http://newsstand.naver.com/include/page/032.html").get();
		}else if(News.JOONGANG.equals(company)){
			doc=Jsoup.connect("http://newsstand.naver.com/?list=ct1&pcode=025").get();
			focusNews=Jsoup.connect("http://newsstand.naver.com/include/page/025.html").get();
		}else if(News.DAILIAN.equals(company)){
			doc=Jsoup.connect("http://newsstand.naver.com/?list=ct1&pcode=368").get();
			focusNews=Jsoup.connect("http://newsstand.naver.com/include/page/368.html").get();
		}
		
		/*news title, edit date, go media*/
		newsTitle=doc.select("#focusPanelCenter h3");
		Elements editDate=doc.select("#focusPanelCenter .fl");
		editDateText=editDate.text();
		editDateText = editDateText.split("편집")[0];
		gomedia=doc.select("#focusPanelCenter .btn_gomedia");
		
		/*focus news headliens*/
		headlines=focusNews.text();
		
		/*---------------------------------------------------------------*/
		System.out.println("####newsTitle:"+newsTitle);
		System.out.println("####editDateText:"+editDateText);
		System.out.println("####gomedia:"+gomedia);
		System.out.println("####headlines:"+headlines);
		//System.out.println("------------------------------------news seperater--------------------------------");
		/*---------------------------------------------------------------*/
		return new NewsWebScraping(newsTitle, editDateText, headlines, gomedia);
	}

	public Elements getNewsTitle() {
		return newsTitle;
	}

	public void setNewsTitle(Elements newsTitle) {
		this.newsTitle = newsTitle;
	}

	public String getEditDateText() {
		return editDateText;
	}

	public void setEditDateText(String editDateText) {
		this.editDateText = editDateText;
	}

	public String getHeadlines() {
		return headlines;
	}

	public void setHeadlines(String headlines) {
		this.headlines = headlines;
	}

	public Elements getGomedia() {
		return gomedia;
	}

	public void setGomedia(Elements gomedia) {
		this.gomedia = gomedia;
	}

	
	
	
	
	
}
