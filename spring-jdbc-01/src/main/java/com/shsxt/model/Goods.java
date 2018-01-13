package com.shsxt.model;
/**
 * 
 *  http://www.blogjava.net/fancydeepin/archive/2012/07/12/lombok.html
 * 
 * @author Mr.YongGan.Zhang
 */

public class Goods {
	
	private int id;
	
	private String goodsName;
	
	
	private double goodsPrice;
	
	private int goodsStock;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public double getGoodsPrice() {
		return goodsPrice;
	}

	public void setGoodsPrice(double goodsPrice) {
		this.goodsPrice = goodsPrice;
	}

	public int getGoodsStock() {
		return goodsStock;
	}

	public void setGoodsStock(int goodsStock) {
		this.goodsStock = goodsStock;
	}

	@Override
	public String toString() {
		return "Goods [id=" + id + ", goodsName=" + goodsName + ", goodsPrice=" + goodsPrice + ", goodsStock="
				+ goodsStock + "]";
	}
	
}
