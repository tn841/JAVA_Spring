package com.itwill1.old.third;

public class MessagePrint {
	public MessageObject getMessageObject(int messageType) {
		return MessageObjectFactory.getInstance().getMessageObject(messageType);
	}

	public void messagePrint(int messageType) {
		MessageObject mo = this.getMessageObject(messageType);
		String messge = mo.getMessage();
		System.out.println(messge);
	}
}
