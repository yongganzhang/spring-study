package com.shsxt.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibInterceptor implements MethodInterceptor {
	
	private Object target;
	

	public CglibInterceptor(Object target) {
		super();
		this.target = target;
	}

	/**
	 * 创建 proxy对象
	 * @return
	 */
	public Object getProxy () {
		
		Enhancer enhancer = new Enhancer();
		//设置父类
		enhancer.setSuperclass(target.getClass()); 
		enhancer.setCallback(this);
		return enhancer.create(); //创建对象 
	}

	/**
	 * 实现 代理的核心  部门
	 */
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		
		before();
		Object invoke = proxy.invoke(target, args);
		after();
		return invoke;
	}
	
	
	public void before() {
		System.out.println("婚礼现场紧张布置中......");
	}

	public void after() {
		System.out.println("恭喜您成功进入人生第二阶段.....");
	}

}