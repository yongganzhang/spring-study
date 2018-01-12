package com.shsxt.demo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) throws InterruptedException {

		// Spring框架加载配置文件
		AbstractApplicationContext act = new ClassPathXmlApplicationContext("spring-config.xml");
		System.out.println("框架已经启动。。。。");
		Thread.sleep(3000);
		
		// 获取 Spring初始化的bean
		Hello hello = (Hello) act.getBean("hello");
		System.out.println(hello);

		Hello hello1 = (Hello) act.getBean("hello");
		System.out.println(hello1);

		Hello hello2 = (Hello) act.getBean("hello");
		System.out.println(hello2);

		hello.print();
		
		Thread.sleep(3000);
		act.close();

		Thread.sleep(3000);
	}
}
