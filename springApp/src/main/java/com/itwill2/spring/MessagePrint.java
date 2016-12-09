package com.itwill2.spring;

public class MessagePrint {
	
	private MessageObject messageObject;
	
	public void setMessageObject(MessageObject messageObject) {
		System.out.println("MessagePrint.setMessageObjet() 호출");
		this.messageObject = messageObject;
	}

	public MessagePrint() {
		System.out.println(">> MessagePrint()기본생성자");
	}
	
	public MessageObject getMessageObject() {
		return messageObject;
	}

	public void messagePrint() {
		MessageObject mo = this.getMessageObject();
		String messge = mo.getMessage();
		System.out.println(messge);
	}
}
