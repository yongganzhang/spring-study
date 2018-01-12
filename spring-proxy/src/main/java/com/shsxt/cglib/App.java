package com.shsxt.cglib;

public class App {
	
	public static void main(String[] args) {
		
		Hello hello = new Hello();
		
		CglibInterceptor cglibInterceptor = new CglibInterceptor(hello);
		Hello proxy = (Hello)cglibInterceptor.getProxy();
		
		proxy.print();
		
	}
}
