package com.post_trend.news;

import java.util.ArrayList;

public interface NewsService {
	/*
	 * 크롤링한 news를 DB에 저장하는 서비스
	 */
	public int newsInsert(News news);
	public News newsFindone(int news_no);
	public News newsFindLatestOne(String company);
	public ArrayList<NewsKeyword> newsFindKeywordList(String company);
		
	
}
