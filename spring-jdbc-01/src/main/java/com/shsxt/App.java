package com.shsxt;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shsxt.dao.CustomerDao;
import com.shsxt.model.Customer;

public class App {
	
	public static void main(String[] args) {
		
		ApplicationContext act = new ClassPathXmlApplicationContext("spring-config.xml");
		
		CustomerDao bean = act.getBean(CustomerDao.class);
		
//		System.out.println(bean.queryCustomerByCid(1));
		
//		Customer customer = bean.queryCustomerByName("yonggan");
//		
//		System.out.println(customer);
		
		List<Customer> list = bean.queryCustomerByIdOrName(1, "zhaoliying");
		for (Customer customer : list) {
			System.out.println(customer);
		}
	}
}
