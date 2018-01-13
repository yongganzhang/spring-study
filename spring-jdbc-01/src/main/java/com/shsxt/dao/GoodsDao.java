package com.shsxt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.shsxt.model.Goods;

/**
 * 商品dao
 * 
 * @author Mr.YongGan.Zhang
 *
 */
@Repository
public class GoodsDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	/**
	 * 插入商品
	 * 
	 * @param goods
	 * @return
	 */
	public int addGoodsHasNoKey(Goods goods) {

		String sql = " INSERT INTO yg_goods ( goods_name, goods_price, goods_stock) VALUES ( ?, ?, ?) ";
		int res = jdbcTemplate.update(sql,
				new Object[] { goods.getGoodsName(), goods.getGoodsPrice(), goods.getGoodsStock() });
		return res;
	}

	public int addGoodsHasKey(final Goods goods) {

		final String sql = " INSERT INTO yg_goods ( goods_name, goods_price, goods_stock) VALUES ( ?, ?, ?) ";

		// 存储 主键的对象
		KeyHolder holder = new GeneratedKeyHolder();

		jdbcTemplate.update(new PreparedStatementCreator() {

			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				// 重新组装 ps 预编译块
				PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

				// 组装参数
				ps.setString(1, goods.getGoodsName());
				ps.setDouble(2, goods.getGoodsPrice());
				ps.setInt(3, goods.getGoodsStock());

				return ps;
			}

		}, holder);

		return holder.getKey().intValue();
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

	/**
	 * 删除
	 * 
	 * @param id
	 * @return
	 */
	public int delGoodsById(int id) {
		String sql = " DELETE FROM yg_goods WHERE id =  ? ";
		return jdbcTemplate.update(sql, new Object[] { id });
	}

	/**
	 * 批量的删除
	 * 
	 * @param ids
	 * @return
	 */
	public int delGoodsBatch(final Integer[] ids) {

		String sql = "delete from account where id=?";

		return jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {

			public void setValues(PreparedStatement ps, int i) throws SQLException {

				ps.setInt(1, ids[i]); // 批量设置值

			}

			public int getBatchSize() { // 设置 setValues 执行次数
				return ids.length;
			}
		}).length;

	}

	/**
	 * 批量 插入
	 * @param list
	 * @return
	 */
	public int addAccountBatch(final List<Goods> list) {

		final String sql = " INSERT INTO yg_goods ( goods_name, goods_price, goods_stock) VALUES ( ?, ?, ?) ";

		return jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {
			
			public void setValues(PreparedStatement ps, int i) throws SQLException {
			
				// 组装参数
				ps.setString(1, list.get(i).getGoodsName());
				ps.setDouble(2, list.get(i).getGoodsPrice());
				ps.setInt(3, list.get(i).getGoodsStock());
			}

			public int getBatchSize() {
				return list.size();
			}
		}).length;
	}

}
