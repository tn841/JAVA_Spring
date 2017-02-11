package com.post_trend.news;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.post_trend.util.SplitUtil;


@Service
public class NewsServiceImpl implements NewsService{
	NewsDaoImpl newsDao;
	public void setNewsDao(NewsDaoImpl newsDao) {
		this.newsDao = newsDao;
	}
	@Override
	public ArrayList<NewsKeyword> newsFindKeywordList(String company) {
		News news=null;
		int news_no=0;
		try{
			news=newsDao.newsFindLatestNews(company);
			news_no=news.getNews_no();
		}catch(Exception e){
			news_no=0;
		}
		return newsDao.newsFindKeywordList(news_no);
	}
	@Override
	public News newsFindone(int news_no) {
		return newsDao.newsFindOne(news_no);
	}
	@Override
	public News newsFindLatestOne(String company) {
		News news=null;
		if(newsDao.newsFindLatestNews(company)==null){
			System.out.println("---NewsService null");
			news=new News("", null, company);
		}
		else{
			news=newsDao.newsFindLatestNews(company);
		}
		
		return  news;
	}
	@Override
	public int newsInsert(News news) {
		/*
		 * 1. newsInsert(news)
		 * 2. headline --> split --> keyword
		 * 3. keyword, news_no --> NewsKeyword()
		 * 4. keywordInsert()
		 */
		int success=0;
		try{
			 success=newsDao.newsInsert(news);
			/*
			 * headline split
			 */
			String headline   = news.getNews_headline();
			headline = SplitUtil.stringReplace(headline);
			headline = SplitUtil.continueSpaceRemove(headline);
			String[] keywords = headline.split(" ");
			/*
			 * keywordInsert()
			 */
			for (int i = 0; i < keywords.length; i++) {
				success=newsDao.keywordInsert(
						new NewsKeyword(keywords[i], news.getNews_no()) );
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return success;
	}
	
	
	

}
