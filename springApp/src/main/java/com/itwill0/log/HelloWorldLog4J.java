package com.itwill0.log;

import org.apache.log4j.Logger;

public class HelloWorldLog4J {
	private Logger log = Logger.getLogger(HelloWorldLog4J.class);
	public String hello(String name){
		
		log.debug("start:"+name);
		log.info("start:"+name);
		log.warn("start:"+name);
		log.error("start:"+name);
		log.fatal("start:"+name);
		
		String message="Hello!! "+name;
		
		log.debug("end:"+name);
		log.info("end:"+name);
		log.warn("end:"+name);
		log.error("end:"+name);
		log.fatal("end:"+name);
		
		return message;
	}
}
