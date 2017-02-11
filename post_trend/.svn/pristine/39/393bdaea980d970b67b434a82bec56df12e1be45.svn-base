package com.post_trend.mapper;

import java.util.ArrayList;

import com.post_trend.news.News;
import com.post_trend.news.NewsKeyword;

public interface NewsMapper {
	public int newsInsert(News news);
	public int keywordInsert(NewsKeyword keyword);
	public News newsFindOne(int newsNo);
	public News newsFindLatestNews(String company);
	public News newsWithKeywordByNo(int news_no);
	public ArrayList<NewsKeyword> newsFindKeywordList(int news_no);
}
