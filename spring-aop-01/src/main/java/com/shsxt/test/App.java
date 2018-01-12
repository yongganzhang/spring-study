package com.shsxt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shsxt.service.UserService;

public class App {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
		
		UserService service = ctx.getBean(UserService.class);
		service.userLogin();
		
	}

}
