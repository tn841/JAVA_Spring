package com.itwill.task;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class RepeatTask {
	@Scheduled(cron = "*/60 * * * * *")
	public void scheduleRun() {
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("스케줄 실행 : " + dateFormat.format(calendar.getTime()));

		
		
		
		
		
		
		
	}

}