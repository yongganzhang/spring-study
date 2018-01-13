package com.shsxt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.shsxt.model.Customer;

/**
 * 提供  客户  dao
 * 
 * @author Mr.YongGan.Zhang
 *
 */

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
	 * 更新 客户 余额
	 * 
	 * @param id
	 * @param stock
	 * @return
	 */
	public int updateCusomerBalanceById(int id, double bal) {

		String sql = " UPDATE  yg_customer  SET user_balance = ?  WHERE ( id= ?) ";
		return jdbcTemplate.update(sql, new Object[] { bal, id });
	}

}
