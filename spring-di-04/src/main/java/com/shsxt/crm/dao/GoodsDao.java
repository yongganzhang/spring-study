package com.shsxt.crm.dao;

import org.springframework.stereotype.Repository;

import com.shsxt.crm.model.Goods;

@Repository
public class GoodsDao {

	/**
	 * xxxx
	 * 
	 * @param id
	 * @return
	 */
	public Goods queryGoodsInfoById(int id) {

		Goods goods = new Goods();
		goods.setId(id);
		goods.setGoodsName("三胖");
		goods.setPrice(1233.55);
		return goods;

	}

}
