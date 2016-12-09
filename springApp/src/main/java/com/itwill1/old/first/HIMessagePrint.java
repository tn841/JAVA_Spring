package com.itwill1.old.first;

public class HIMessagePrint {
	public HIMessageObject getHIMessageObject(){
		return new HIMessageObject();
	}
	public void hiMessagePrint(){
		String hiMessage=getHIMessageObject().getHIMessage();
		System.out.println(hiMessage);
	}
}
