package com.shsxt.demo;

public class Hello {
	
	
	{
		System.out.println("类被初始化");
	}

	public void print () {
		System.out.println("spring hello ");
	}
	
	
	public void init () {
		System.out.println("初始化。。。。。");
	}
	
	public void destroy () {
		System.out.println("销毁。。。。。");
	}
	
}
