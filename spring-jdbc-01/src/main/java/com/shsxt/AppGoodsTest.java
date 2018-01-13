package com.shsxt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shsxt.dao.GoodsDao;
import com.shsxt.model.Goods;

public class AppGoodsTest {
	
	public static void main(String[] args) {
		
		ApplicationContext act = new ClassPathXmlApplicationContext("spring-config.xml");
		
		GoodsDao goodsDao = act.getBean(GoodsDao.class);
//		
//		Goods goods = new Goods();
//		goods.setGoodsName("test02");
//		goods.setGoodsPrice(499.99);
//		goods.setGoodsStock(5);
		
		//int res = goodsDao.addGoodsHasNoKey(goods);
		
//		int key = goodsDao.addGoodsHasKey(goods);
		
//		int byId = goodsDao.updateGoodsStockById(7, 3);
		
		int byId = goodsDao.delGoodsById(5);
		System.out.println(byId);
		
	}

}
