package com.itwill0.log;

public class HelloWorldLog4JMain {

	public static void main(String[] args) {
		HelloWorldLog4J hw=new HelloWorldLog4J();
		String returnMessage=hw.hello("김소라");
		System.out.println(returnMessage);
	}

}
