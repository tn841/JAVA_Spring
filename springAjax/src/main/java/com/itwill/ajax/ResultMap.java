package com.itwill.ajax;

import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ResultMap {
	private int count;
	private Map memberMap;
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public Map getMemberMap() {
		return memberMap;
	}
	public void setMemberMap(Map memberMap) {
		this.memberMap = memberMap;
	}

	
}
