package com.shsxt.demo;

/**
 * 实现构造注入
 * 
 * @author Mr.YongGan.Zhang
 * 
 */
public class UserServiceV2 {
	
	private UserDao userDao ;
	
	private String name;
	
	public UserServiceV2(UserDao userDao, String name) {
		this.userDao = userDao;
		this.name = name;
	}




	public void userLogin () {
		String res = userDao.userLogin();
		System.out.println(res);
		System.out.println(name);
	}
	
}
