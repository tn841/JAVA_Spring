package com.post_trend.news;

import java.util.ArrayList;

public interface NewsDao {
	public int newsInsert(News news);
	public int keywordInsert(NewsKeyword keyword);
	public int newsUpdate(News news);
	public int newsRemove(int newsNo);
	public News newsFindOne(int newsNo);
	public News newsFindLatestNews(String company);
	public News newsWithKeywordByNo(int news_no);
	public ArrayList<News> newsFindList();
	public ArrayList<NewsKeyword> newsFindKeywordList(int news_no);
	  
	 
}
