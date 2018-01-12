package com.shsxt.aspectj;

import org.springframework.stereotype.Component;

/**
 *  声明 切面
 * @author Mr.YongGan.Zhang
 */

@Component
public class LogCut {
	
	
	/**
	 * 前置通知 
	 */
	public void before () {
		System.out.println(" 前置增强。。 ");
	}
	
	/**
	 * 最终通知
	 */
	public void after () {
		System.out.println(" 最通知。。。 ");
	}
	
	
}
