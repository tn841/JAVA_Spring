package com.itwill2.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessagePrintSpringMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("2.ApplicationContext.xml");
		
		MessagePrint mp1 = (MessagePrint) applicationContext.getBean("messagePrint1");
		mp1.messagePrint();
		MessagePrint mp2 = (MessagePrint) applicationContext.getBean("messagePrint2");
		mp2.messagePrint();
		MessagePrint mp3 = (MessagePrint) applicationContext.getBean("messagePrint3");
		mp3.messagePrint();
		/*
		MessagePrint mp=new MessagePrint();
		mp.messagePrint(MessageObject.HELLO_MSG);
		mp.messagePrint(MessageObject.BYE_MSG);
		mp.messagePrint(MessageObject.HI_MSG);
		mp.messagePrint(MessageObject.GOODBYE_MSG);
		mp.messagePrint(MessageObject.HI_MSG);
		 */
		
	}

}
