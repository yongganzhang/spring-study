package com.shsxt.crm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shsxt.crm.dao.GoodsDao;
import com.shsxt.crm.model.Goods;

@Service
public class GoodsService {
	
	@Autowired
	private GoodsDao goodsDao;
	
	public Goods queryGoodsInfoById(int id) {
		return goodsDao.queryGoodsInfoById(id);
	}

}
