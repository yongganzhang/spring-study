package com.shsxt.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String[] args) {

		// Spring框架加载配置文件
		ApplicationContext act = new ClassPathXmlApplicationContext("spring-config.xml");

	}
}
