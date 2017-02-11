package com.post_trend.news;

import java.util.ArrayList;

public class News {
	private int news_no;
	private String news_headline;
	private String news_date;
	private String news_company;
	
	//private boolean isPositive;
	
	//service 성능을 위해
	private ArrayList<NewsKeyword> news_keywordList;
	
	/*-------------------news_company---------------------*/
	public static final String CHOSEON = "choseon";
	public static final String GYENGHYANG = "gyenghyang";
	public static final String JOONGANG = "joongang";
	public static final String DAILIAN = "daylian";
	/*----------------------------------------------------*/
	public News() {
		// TODO Auto-generated constructor stub
	}
	/*
	 * DB용 생성자 
	 */
	public News(String news_headline, String news_date, String news_company) {
		super();
		this.news_headline = news_headline;
		this.news_date = news_date;
		this.news_company = news_company;
	}
	/*
	 * 서비스용 생성자
	 */
	public News(String news_headline, String news_date, String news_company, ArrayList<NewsKeyword> news_keywordList) {
		super();
		this.news_headline = news_headline;
		this.news_date = news_date;
		this.news_company = news_company;
		this.news_keywordList = news_keywordList;
	}
	
	
	public int getNews_no() {
		return news_no;
	}
	
	public void setNews_no(int news_no) {
		this.news_no = news_no;
	}
	public String getNews_headline() {
		return news_headline;
	}
	public void setNews_headline(String news_headline) {
		this.news_headline = news_headline;
	}
	public ArrayList<NewsKeyword> getNews_keywordList() {
		return news_keywordList;
	}
	public void setNews_keywordList(ArrayList<NewsKeyword> news_keywordList) {
		this.news_keywordList = news_keywordList;
	}
	public String getNews_date() {
		return news_date;
	}
	public void setNews_date(String news_date) {
		this.news_date = news_date;
	}
	public String getNews_company() {
		return news_company;
	}
	public void setNews_company(String news_company) {
		this.news_company = news_company;
	}
	
	
	
}
