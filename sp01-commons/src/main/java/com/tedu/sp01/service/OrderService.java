package com.tedu.sp01.service;

import com.tedu.sp01.pojo.Order;

public interface OrderService {
	//查询订单表
	Order getOrder(String orderId);
	//添加订单表
	void addOrder(Order order);
}
