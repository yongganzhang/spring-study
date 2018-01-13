package com.shsxt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.shsxt.model.Customer;
import com.shsxt.util.StringUtil;

@Repository
public class CustomerDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	/**
	 * 查询客户信息
	 * 
	 * @param id
	 *            客户id
	 * @return
	 */
	public Customer queryCustomerByCid(int id) {

		String sql = "select c.id 'id' , c.user_name 'userName' , c.user_balance 'userBalance' from yg_customer c WHERE c.id = ?";

		return jdbcTemplate.queryForObject(sql, new Object[] { id }, new RowMapper<Customer>() {

			public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
				int id = rs.getInt(1);

				String name = rs.getString(2);

				double balance = rs.getDouble(3);

				Customer customer = new Customer();
				customer.setId(id);
				customer.setUserName(name);
				customer.setUserBalance(balance);
				return customer;
			}
		});

	}
	
	/**
	 * 根据姓名查询用户
	 * @param name
	 * @return
	 */
	public Customer queryCustomerByName (String name) {
		
		String sql = "select id , user_name , user_balance from yg_customer where user_name =  ? ";
		Customer customer = jdbcTemplate.queryForObject(sql, new Object[] {name}, new RowMapper<Customer>() {
			/**
			 * 结果集的解析
			 */
			public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
				Customer cus = new Customer();
				// 解析
				int id = rs.getInt(1);
				cus.setId(id);
				String name = rs.getString(2);
				cus.setUserName(name);
				double balance = rs.getDouble(3);
				cus.setUserBalance(balance);
				return cus;
			}
		});
		
		return customer;
	}

	
	/**
	 * 	查询用户 信息
	 * 
	 * @param id  
	 * @param name 姓名
	 * @return 用户集合  List<Customer> 
	 */
	public List<Customer>  queryCustomerByIdOrName (Integer id , String name) {
		
		// sql
		String sql = " select id , user_name , user_balance from yg_customer where 1 = 1 ";
		//  user_name =  'yonggan'  and id = 1 
		// 参数
		List<Object> params = new ArrayList<Object>();
		
		if (id != null) {
			sql += " and  id = ? ";
			params.add(id);
		}
		
		if (!StringUtil.isBlankOrNull(name)) {
			sql += " and  user_name = ? ";
			params.add(name);
		}
		
		// 查询 sql
		List<Customer> list = jdbcTemplate.query(sql, params.toArray(), new RowMapper<Customer>() {

			public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
			
				Customer cus = new Customer();
				// 解析
				int id = rs.getInt(1);
				cus.setId(id);
				String name = rs.getString(2);
				cus.setUserName(name);
				double balance = rs.getDouble(3);
				cus.setUserBalance(balance);
				
				return cus;
			}
		} );
		
		return list;
	}
	
	
	
	
	
	public Integer queryCustomerCount() {

		String sql = "select count(1) from yg_customer ";

		Integer integer = jdbcTemplate.queryForObject(sql, Integer.class);

		return integer;

	}

}
