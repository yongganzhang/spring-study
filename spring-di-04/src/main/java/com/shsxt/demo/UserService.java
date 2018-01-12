package com.shsxt.demo;

import javax.annotation.Resource;


public class UserService {
	
//	@Autowired
	@Resource(name = "userDao")  // jdk 注解  
	private  UserDao userDao;
	
	public void print () {
		userDao.print();
	}

}
