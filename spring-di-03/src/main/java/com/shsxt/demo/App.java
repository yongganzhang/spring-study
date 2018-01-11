package com.shsxt.demo;

import java.util.List;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String[] args) {

		// Spring框架加载配置文件
		ApplicationContext act = new ClassPathXmlApplicationContext("spring-config.xml");

		UserService bean = act.getBean(UserService.class);
		
		/////////////////////////////////
		List<String> list = bean.getFood();
		for (String temp : list) {
			System.out.println(temp);
		}
		
		Set<String> set = bean.getSet();
		for (String temp : set) {
			System.out.println(temp);
		}
		
	}
}
