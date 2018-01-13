package com.shsxt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shsxt.service.ShoppingGoodsService;

public class App {

	public static void main(String[] args) {
		
		PlatformTransactionManager

		ApplicationContext act = new ClassPathXmlApplicationContext("spring-config.xml");

		ShoppingGoodsService service = act.getBean(ShoppingGoodsService.class);

		service.buyGoods(2, 1, 2);

	}

}
