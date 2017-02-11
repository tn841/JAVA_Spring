package com.post_trend.news;

import java.util.ArrayList;

import com.post_trend.mapper.NewsMapper;

public class NewsDaoImpl implements NewsDao {
	NewsMapper newsMapper;
	
	public void setNewsMapper(NewsMapper newsMapper) {
		this.newsMapper = newsMapper;
	}

	@Override
	public int newsInsert(News news) {
		System.out.println("NewsDaoImpl News:"+news);
		return newsMapper.newsInsert(news);
		
	}
	@Override
	public int keywordInsert(NewsKeyword keyword) {
		return newsMapper.keywordInsert(keyword);
		
	}

	@Override
	public int newsUpdate(News news) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int newsRemove(int newsNo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public News newsFindOne(int newsNo) {
		return newsMapper.newsFindOne(newsNo);
	}
	@Override
	public News newsFindLatestNews(String company) {
		return newsMapper.newsFindLatestNews(company);
	}
	@Override
	public News newsWithKeywordByNo(int news_no) {
		return newsMapper.newsWithKeywordByNo(news_no);
	}
	@Override
	public ArrayList<News> newsFindList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<NewsKeyword> newsFindKeywordList(int news_no) {
		return newsMapper.newsFindKeywordList(news_no);
	}

	

	

}
