package com.atguigu.gmall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.service.OrderService;
import com.atguigu.gmall.service.UserService;
@Service
public class OrderServiceImpl implements OrderService{
	@Reference //帮我们远程引用服务
	UserService userService;
	public List<UserAddress> initOrder(String userId) {
		// TODO Auto-generated method stub
		//1.查询用户收货地址
		System.out.println("用户id："+userId);
		List<UserAddress> list = userService.getUserAddressList(userId);
		return list;
	}

}
