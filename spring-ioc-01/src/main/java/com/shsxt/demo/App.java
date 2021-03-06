package com.shsxt.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		// Spring框架加载配置文件
		ApplicationContext act = new ClassPathXmlApplicationContext("spring-config.xml");

		// 获取 Spring初始化的bean
		Hello hello = (Hello) act.getBean("hello");
		System.out.println(hello);
		hello.print();
		
		//////////////////////////////////
		GoodsService goodsService = act.getBean(GoodsService.class);
		goodsService.getGoodsInfo();
		
		///////////////////////////////////////////
		OrderService orderService = act.getBean("orderService", OrderService.class);
		orderService.getOrderInfo();
	}
}
