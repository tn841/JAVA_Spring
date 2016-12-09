package com.itwill1.old.second;

public class MessagePrint {
	public MessageObject getMessageObject(int type){
		MessageObject mo = null;
		switch (type) {
		case 1:
			mo  = new HelloMessageObject();
			break;
		case 2:
			mo = new HiMessageObject();
			break;
		case 3:
			mo = new ByeMessageObject();
			break;
		default:
			throw new RuntimeException("지원되지않는 메시지타입입니다.");
		}
		return mo;
	}
	
	public void messagePrint(int type){
		MessageObject mo = this.getMessageObject(type);
		String msg = mo.getMessage();
		System.out.println(msg);
	}
}
