package com.shsxt.dao;

import java.util.Currency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.shsxt.model.Customer;

@Repository
public class CustomerDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	/**
	 * 查询客户信息
	 * @param id  客户id
	 * @return
	 */
//	public Customer queryCustomerByCid (int id) {
//		
//		String sql = "select c.id 'id' , c.user_name 'userName' , c.user_balance 'userBalance' from yg_customer c WHERE c.id = ";
//		
//		Customer customer = jdbcTemplate.queryForObject(sql, Customer.class, id);
//		
//		return customer;
//		
//	}
	
	public Integer queryCustomerCount () {
	
	String sql = "select count(1) from yg_customer ";
	
	Integer integer = jdbcTemplate.queryForObject(sql, Integer.class);
	
	return integer;
	
}
	
	
	
	

}
