package com.post_trend.task;

import java.io.IOException;
import java.util.ArrayList;

import org.springframework.scheduling.annotation.Scheduled;

import com.post_trend.news.News;
import com.post_trend.news.NewsKeyword;
import com.post_trend.news.NewsServiceImpl;
import com.post_trend.news.NewsWebScraping;
import com.post_trend.util.SplitUtil;

public class NewsCrawling {
	
	private NewsServiceImpl newsService;
	public void setNewsService(NewsServiceImpl newsService) {
		this.newsService = newsService;
		System.out.println("----NewsCrawling NewsService:"+this.newsService);
	}
	
	/*
	 * @Scheduled 붙일때는 파라메타 인자를 붙여서 보내면 안된다.
	 */
	//@Scheduled(cron = "* */10 8-14 * * *")
	public void newsAutoRenewalAM(){
		System.out.println("****************************News 자동 실행 ***************************************");
		System.out.println("----------------------------------------------------------------------------------");
		try {
			this.newsCrawlingByDate(News.CHOSEON);
			System.out.println("----------------------------------------------------------------------------------");
			this.newsCrawlingByDate(News.GYENGHYANG);
			System.out.println("----------------------------------------------------------------------------------");
			this.newsCrawlingByDate(News.JOONGANG);
			System.out.println("----------------------------------------------------------------------------------");
			this.newsCrawlingByDate(News.DAILIAN);
			
			System.out.println("*** NewsWebScraping.newsAutoRenewal 완료");
			System.out.println("----------------------------------------------------------------------------------");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//@Scheduled(cron = "* */30 14-23 * * *")
	public void newsAutoRenewalPM(){
		System.out.println("****************************News 자동 실행 ***************************************");
		System.out.println("----------------------------------------------------------------------------------");
		try {
			this.newsCrawlingByDate(News.CHOSEON);
			System.out.println("----------------------------------------------------------------------------------");
			this.newsCrawlingByDate(News.GYENGHYANG);
			System.out.println("----------------------------------------------------------------------------------");
			this.newsCrawlingByDate(News.JOONGANG);
			System.out.println("----------------------------------------------------------------------------------");
			this.newsCrawlingByDate(News.DAILIAN);
			
			System.out.println("*** NewsWebScraping.newsAutoRenewal 완료");
			System.out.println("----------------------------------------------------------------------------------");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void newsCrawlingByKey(String company) throws IOException {
		//ArrayList<NewsKeyword> keywordList=new ArrayList<NewsKeyword>();
		NewsWebScraping newsController=new NewsWebScraping();
		News news=null;
		
		/* ----현재 크롤링해 온 데이타---- */
		NewsWebScraping newsWebScraping=newsController.newsWebScrapingController(company);
		String headlies=newsWebScraping.getHeadlines();
		headlies = SplitUtil.stringReplace(headlies);
		headlies = SplitUtil.continueSpaceRemove(headlies);
		String[] currKeywords = headlies.split(" ");
		
		/* ----최근에 크롤링해 온 데이타---- */
		ArrayList<NewsKeyword> keywordList=newsService.newsFindKeywordList(company);
		/* 현재와 최근거 비교*/
		
		/*
		 * 최근 데이타 null
		 */
		if(keywordList==null){
			news=new News(headlies, newsWebScraping.getEditDateText(), company);
			this.newsService.newsInsert(news);
		}
		
		/*
		 * 데이타 비교
		 */
		/* ----1 .데이타 갯수 비교---- */
		int maxIndex=0;
		if(currKeywords.length > keywordList.size()){
			maxIndex = currKeywords.length;
		}else if(currKeywords.length < keywordList.size()){
			maxIndex = keywordList.size();
		}else{
			maxIndex = keywordList.size();
		}
		
		/* ----2 .다른 데이타 있는지 확인---- */
		for (int i = 0; i < maxIndex; i++) {
			for (int j = 0; j < maxIndex; j++) {
				if( currKeywords[i].equals(keywordList.get(j)) ){
					/* 같은 순간 */
					currKeywords[i]="";
					
				}
			}
		}
		
		
		
		
	}
	public void newsCrawlingByDate(String company) throws IOException{
		NewsWebScraping newsController=new NewsWebScraping();
		NewsWebScraping newsWebScraping=newsController.newsWebScrapingController(company);
		String currDate = newsWebScraping.getEditDateText();
		String preDate  = this.newsService.newsFindLatestOne(company).getNews_date();
		if(preDate == null){
			System.out.println("*** 1.NewsCrawling.newsCrawlingByCompany preDate:"+preDate);
			News news = new News(newsWebScraping.getHeadlines(), currDate, company);
			this.newsService.newsInsert(news);
		}else if(!currDate.equals(preDate)){
			System.out.println("*** 2.NewsCrawling.newsCrawlingByCompany preDate:"+preDate+"|currDate"+currDate);
			News news = new News(newsWebScraping.getHeadlines(), currDate, company);
			this.newsService.newsInsert(news);
		}else{
			System.out.println("*** 3.NewsServiceImpl.newsCrawlingByCompany 입력하지마");
		}
		
	}
	
}
