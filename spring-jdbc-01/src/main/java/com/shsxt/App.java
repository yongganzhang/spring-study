package com.shsxt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shsxt.dao.CustomerDao;

public class App {
	
	public static void main(String[] args) {
		
		ApplicationContext act = new ClassPathXmlApplicationContext("spring-config.xml");
		
		CustomerDao bean = act.getBean(CustomerDao.class);
		
		System.out.println(bean.queryCustomerCount());
	}

}
