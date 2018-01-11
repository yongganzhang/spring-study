package com.shsxt.factory;

public class StaticFactory {
	
	public static UserDao createUserDao () {
		return new UserDao();
	}

}
