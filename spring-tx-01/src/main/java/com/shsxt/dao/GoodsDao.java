package com.shsxt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.shsxt.model.Goods;

@Repository
public class GoodsDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	/**
	 * 查询客户信息
	 * 
	 * @param id
	 *            客户id
	 * @return
	 */
	public Goods queryGoodsByid(int id) {

		String sql = "select id, goods_name , goods_price , goods_stock from yg_goods WHERE id = ?";

		return jdbcTemplate.queryForObject(sql, new Object[] { id }, new RowMapper<Goods>() {

			public Goods mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				int id = rs.getInt(1);
				String name = rs.getString(2);
				double goodsPrice = rs.getDouble(3);
				int stock = rs.getInt(4);

				Goods goods = new Goods();
				goods.setId(id);
				goods.setGoodsName(name);
				goods.setGoodsPrice(goodsPrice);
				goods.setGoodsStock(stock);
				
				return goods;
			}
		});

	}
	
	
	/**
	 * 更新 商品库存
	 * 
	 * @param id
	 * @param stock
	 * @return
	 */
	public int updateGoodsStockById(int id, int stock) {

		String sql = " UPDATE  yg_goods  SET goods_stock= ?  WHERE ( id= ?) ";
		return jdbcTemplate.update(sql, new Object[] { stock, id });
	}
	
	
	
	

}
