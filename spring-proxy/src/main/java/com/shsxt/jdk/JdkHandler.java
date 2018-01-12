package com.shsxt.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JdkHandler implements InvocationHandler {

	private Object target;

	public JdkHandler(Object target) {
		this.target = target;
	}

	/**
	 * 获取 代理对象
	 * 
	 * @return
	 */
	public Object getProxy() {
		return Proxy.newProxyInstance(this.getClass().getClassLoader(), // 类加载器
				target.getClass().getInterfaces(), this);
	}

	/**
	 * 执行方法
	 */
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		before();// 前置增强
		
		System.out.println(new SimpleDateFormat("yyyy:MM:dd HH:mm:ss").format(new Date()));
		
		Object invoke = method.invoke(target, args);
		
		Thread.sleep(2000);
		
		
		after();// 后置增强
		
		System.out.println(new SimpleDateFormat("yyyy:MM:dd HH:mm:ss").format(new Date()));

		return invoke;
	}

	public void before() {
		System.out.println("婚礼现场紧张布置中......");
	}

	public void after() {
		System.out.println("恭喜您成功进入人生第二阶段.....");
	}

}
