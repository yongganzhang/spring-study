package com.shsxt.demo;

/**
 * 静态工厂方式
 * @author Mr.YongGan.Zhang
 *
 */
public class StaticFactory {
	
	public static GoodsService createGoodsService () {
		return new GoodsService();
	}

}
