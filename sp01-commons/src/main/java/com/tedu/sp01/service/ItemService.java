package com.tedu.sp01.service;

import java.util.List;

import com.tedu.sp01.pojo.Item;

public interface ItemService {
	//���߶���id�鿴��Ʒ
	List<Item> getItems(String orderId);
	//��Ʒ�Ŀ��
	void decreaseNumbers(List<Item> list);
}
