package com.shsxt.demo;

/**
 * 实例化 工厂
 * @author Mr.YongGan.Zhang
 *
 */
public class InstanceFactory {
	
	public OrderService createOrderService () {
		return new OrderService();
	}

}
