package com.shsxt.crm.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shsxt.crm.model.Goods;
import com.shsxt.crm.service.GoodsService;

public class App {

	public static void main(String[] args) {

		ApplicationContext act = new ClassPathXmlApplicationContext("spring-config.xml");

		GoodsService goodsService = act.getBean(GoodsService.class);
		
		Goods goods = goodsService.queryGoodsInfoById(100023);

		System.out.println(goods);

	}

}
