package com.itwill4.bean.attr;

public class InitDestroyBean {
	public InitDestroyBean() {
		System.out.println("### InitDestroyBean() 디폴트생성자");
	}
	public void myInit(){
		System.out.println("### InitDestroyBean.myInit() 호출-->객체초기화");
	}
	public void myDestroy(){
		System.out.println("### InitDestroyBean.myDestroy() 호출-->객체해제");
	}
}
