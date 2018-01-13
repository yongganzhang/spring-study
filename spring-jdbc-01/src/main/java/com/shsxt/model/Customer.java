package com.shsxt.model;

/**
 * 客户bean
 * @author Mr.YongGan.Zhang
 *
 */
public class Customer {
	
	private int id;
	
	private String userName;
	
	private double userBalance;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public double getUserBalance() {
		return userBalance;
	}

	public void setUserBalance(double userBalance) {
		this.userBalance = userBalance;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", userName=" + userName + ", userBalance=" + userBalance + "]";
	}
	

}
