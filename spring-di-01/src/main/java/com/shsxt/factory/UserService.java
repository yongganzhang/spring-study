package com.shsxt.factory;

public class UserService {
	
	private UserDao userDao ;
	
	public void userLogin () {
		String res = userDao.userLogin();
		System.out.println(res);
	}
	

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

}
