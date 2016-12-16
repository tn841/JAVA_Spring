package com.itwill.controller.annotation;

import org.springframework.stereotype.Component;

@Component("elBean")
public class SpringELBean {
	private String member1;
	private String member2;
	private String member3;
	private String member4;
	public SpringELBean() {
		member1="신명숙";
		member2="김은희";
		member3="최경녀";
		member4="최은영";
	}
	public String printMember(){
		return member1+"\t"+member2+"\t"+member3+"\t"+member4;
	}
	public String getMember1() {
		return member1;
	}
	public void setMember1(String member1) {
		this.member1 = member1;
	}
	public String getMember2() {
		return member2;
	}
	public void setMember2(String member2) {
		this.member2 = member2;
	}
	public String getMember3() {
		return member3;
	}
	public void setMember3(String member3) {
		this.member3 = member3;
	}
	public String getMember4() {
		return member4;
	}
	public void setMember4(String member4) {
		this.member4 = member4;
	}
	
}
