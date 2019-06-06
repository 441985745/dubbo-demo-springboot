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
	/**
	 * 当然我们可以在consumer端通过@Reference注解的parameters注解实现（PS：基于XML的配置可以配置MethodConfig元素，
	 * but基于注解的配置没有单独设置某个method的配置，只能曲线救国，
	 * 我们只要清楚一点就是所有的配置都会作为url参数的一部分就OK了，
	 * 所以我们可以通过配置注解的parameters参数来往url上附加额外参数来达到相同的目的）:
	 *  @Reference(
	 *
	 *             version = "${demo.service.version}",
	 *             application = "${dubbo.application.id}",
	 *             registry = "${dubbo.registry.id}",
	 *             parameters = {"sayHello.timeout", "3000", "sayHello2.timeout", "5000"}
	 *
	 *     )
	 *
	 */
	@Reference(version = "2.0.0",stub = "com.atguigu.gmall.service.impl.UserServiceStub") //帮我们远程引用服务,参数可以设置版本,重试次数,超时时间等
	UserService userService;
	public List<UserAddress> initOrder(String userId) {
		// TODO Auto-generated method stub
		//1.查询用户收货地址
		System.out.println("用户id："+userId);
		List<UserAddress> list = userService.getUserAddressList(userId);
		return list;
	}

}
