package com.itwill.ajax;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="result")//root 태그의 이름 설정
public class NewsListResult {
	private int count;
	

	private List<News> newsList;
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	@XmlElement(name="newsList")
	@XmlElementWrapper(name="news")
	public List<News> getNewList() {
		return newsList;
	}
	public void setNewList(List<News> newList) {
		this.newsList = newList;
	}
}
