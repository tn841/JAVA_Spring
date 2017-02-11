package com.post_trend.realtime;

import java.sql.Date;

public class Realtime {
	private int realtime_no;
	private String realtime_keyword;
	private String realtime_url;
	private int realtime_rank;
	private String realtime_standard;
	private String realtime_portal;
	private String realtime_isIncrease;
	private int realtime_degree;
	private Date realtime_timestamp;
	
	
	
	public Realtime(){}
	
	
	public Realtime(String realtime_keyword, String realtime_url, int realtime_rank, String realtime_standard,
			String realtime_portal, String realtime_isIncrease, int realtime_degree) {
		super();
		this.realtime_keyword = realtime_keyword;
		this.realtime_url = realtime_url;
		this.realtime_rank = realtime_rank;
		this.realtime_standard = realtime_standard;
		this.realtime_portal = realtime_portal;
		this.realtime_isIncrease = realtime_isIncrease;
		this.realtime_degree = realtime_degree;
	}
	public int getRealtime_no() {
		return realtime_no;
	}
	public void setRealtime_no(int realtime_no) {
		this.realtime_no = realtime_no;
	}
	public String getRealtime_keyword() {
		return realtime_keyword;
	}
	public void setRealtime_keyword(String realtime_keyword) {
		this.realtime_keyword = realtime_keyword;
	}
	public String getRealtime_url() {
		return realtime_url;
	}
	public void setRealtime_url(String realtime_url) {
		this.realtime_url = realtime_url;
	}
	public int getRealtime_rank() {
		return realtime_rank;
	}
	public void setRealtime_rank(int realtime_rank) {
		this.realtime_rank = realtime_rank;
	}
	public String getRealtime_standard() {
		return realtime_standard;
	}
	public void setRealtime_standard(String realtime_standard) {
		this.realtime_standard = realtime_standard;
	}
	public String getRealtime_portal() {
		return realtime_portal;
	}
	public void setRealtime_portal(String realtime_portal) {
		this.realtime_portal = realtime_portal;
	}
	public Date getRealtime_timestamp() {
		return realtime_timestamp;
	}
	public void setRealtime_timestamp(Date realtime_timestamp) {
		this.realtime_timestamp = realtime_timestamp;
	}
	public String getRealtime_isIncrease() {
		return realtime_isIncrease;
	}


	public void setRealtime_isIncrease(String realtime_isIncrease) {
		this.realtime_isIncrease = realtime_isIncrease;
	}


	public int getRealtime_degree() {
		return realtime_degree;
	}


	public void setRealtime_degree(int realtime_degree) {
		this.realtime_degree = realtime_degree;
	}
	
	
	
	
}
