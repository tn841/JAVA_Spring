package com.itwill1.old.third;

public class MessageObjectFactory {
	private static MessageObjectFactory _factory_instance = null;
	
	private MessageObjectFactory() {
		
	}
	
	public static MessageObjectFactory getInstance(){
		if(_factory_instance == null){
			_factory_instance = new MessageObjectFactory();
		}
		return _factory_instance; 
	}
	
	public MessageObject getMessageObject(int messageType) {
	
		MessageObject mo=null;
		switch (messageType) {
		case MessageObject.HELLO_MSG:
			mo=new HelloMessageObject();
			break;
		case MessageObject.HI_MSG:
			mo=new HiMessageObject();
			break;
		case MessageObject.BYE_MSG:
			mo=new ByeMessageObject();
			break;
		case MessageObject.GOODBYE_MSG:
			mo=new GoodByeMessageObject();
			break;	
		default:
			throw new RuntimeException("지원되지않는 메세지타입입니다.");
		}
		

		return mo;
	}
	
}
