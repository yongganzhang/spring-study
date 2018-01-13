package com.shsxt.task;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String[] args) {
		
		// http://cron.qqe2.com/
		ApplicationContext act = new ClassPathXmlApplicationContext("spring-config.xml");
		
		
	}
}
