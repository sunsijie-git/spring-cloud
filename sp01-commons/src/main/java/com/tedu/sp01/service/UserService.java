package com.tedu.sp01.service;

import com.tedu.sp01.pojo.User;

public interface UserService {
	//更具用户id 查询用户
	User getUser(Integer id);
	//用户积分增加
	void addScore(Integer id, Integer score);
}
