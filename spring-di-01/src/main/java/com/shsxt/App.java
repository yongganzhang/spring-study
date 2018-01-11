package com.shsxt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shsxt.factory.UserService;

//import com.shsxt.demo.UserService;

public class App {

	public static void main(String[] args) {

		// Spring框架加载配置文件
		ApplicationContext act = new ClassPathXmlApplicationContext("spring-config.xml");

//		UserService service = act.getBean(UserService.class);
//		service.userLogin();
		
//		UserServiceV2 service = act.getBean(UserServiceV2.class);
//		service.userLogin();
		
		UserService service = act.getBean(UserService.class);
		service.userLogin();
		
	}
}
