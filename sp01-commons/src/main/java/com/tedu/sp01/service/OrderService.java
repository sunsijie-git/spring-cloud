package com.tedu.sp01.service;

import com.tedu.sp01.pojo.Order;

public interface OrderService {
	//��ѯ������
	Order getOrder(String orderId);
	//��Ӷ�����
	void addOrder(Order order);
}
