package com.shsxt.jdk;

public class App {

	public static void main(String[] args) {

		You you = new You();// 班长

		// 创建代理对象
		JdkHandler jdkHandler = new JdkHandler(you);

		Merry proxy = (Merry) jdkHandler.getProxy(); // 只能向上装换 接口的类型 （多态）

		// System.out.println(proxy);
		proxy.merry("班长");

		proxy.hello("");
		// 收集 方法 和参数

		Merry m = new You();
		m.merry("....");

		/////////////////////////////////////////////////

		He he = new He();

		// 创建代理对象
		JdkHandler jdkHandler1 = new JdkHandler(he);

		Merry proxy1 = (Merry) jdkHandler1.getProxy(); // 只能向上装换 接口的类型 （多态）

		proxy1.merry("sss");
	}

}
