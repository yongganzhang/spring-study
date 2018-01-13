package com.shsxt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.shsxt.dao.CustomerDao;
import com.shsxt.dao.GoodsDao;
import com.shsxt.model.Customer;
import com.shsxt.model.Goods;

@Service
public class ShoppingGoodsService {

	@Autowired
	private CustomerDao customerDao;

	@Autowired
	private GoodsDao goodsDao;

	/**
	 * 购买商品
	 * 
	 * @param uid
	 * @param goodsId
	 * @param goodsNum
	 */

	@Transactional(propagation = Propagation.REQUIRED)
	public void buyGoods(int uid, int goodsId, int goodsNum) {

		Customer customer = customerDao.queryCustomerByCid(uid);
		double balance = customer.getUserBalance();

		//
		Goods goods = goodsDao.queryGoodsByid(goodsId);
		// 商品总价格
		double total = goods.getGoodsPrice() * goodsNum;

		if (balance < total) {
			throw new RuntimeException("账户余额不足");
		}

		// 扣除 余额 和 库存
		double newBal = balance - total;
		int res = customerDao.updateCusomerBalanceById(uid, newBal);// 更新 余额

		if (res != 1) {
			throw new RuntimeException("扣除余额失败");
		}

		/////////////////////////////////////////////////////////////////////////
		/////////////////////////////////////////////////////////////////////////
		if (goods.getGoodsStock() < goodsNum) {
			throw new RuntimeException("商品库存不足");
		}
		// 扣除库存
		int newStock = goods.getGoodsStock() - goodsNum;
		int r = goodsDao.updateGoodsStockById(goodsId, newStock);
		if (r != 1) {
			throw new RuntimeException("扣除商品库存失败");
		}
	}
}
