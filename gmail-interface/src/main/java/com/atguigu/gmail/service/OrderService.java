package com.atguigu.gmail.service;

import java.util.List;

import com.atguigu.gmail.bean.UserAddress;

public interface OrderService {
	
	/**
	 * 初始化订单
	 * @param userId
	 */
	public List<UserAddress> initOrder(String userId);

}
