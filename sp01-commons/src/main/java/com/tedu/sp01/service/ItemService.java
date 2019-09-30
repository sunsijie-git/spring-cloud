package com.tedu.sp01.service;

import java.util.List;

import com.tedu.sp01.pojo.Item;

public interface ItemService {
	//更具订单id查看商品
	List<Item> getItems(String orderId);
	//商品的库存
	void decreaseNumbers(List<Item> list);
}
