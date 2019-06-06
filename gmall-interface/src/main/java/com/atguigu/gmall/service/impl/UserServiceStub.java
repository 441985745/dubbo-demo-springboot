package com.atguigu.gmall.service.impl;

import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.service.UserService;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * 本地存根
 */
public class UserServiceStub implements UserService {

    private final UserService userService;

    /**
     * 本地存根中必须设置一个有参构造器,dubbo会自动将userservice的远程代理对象传入
     * @param userService
     */
    public UserServiceStub(UserService userService) {
        super();
        this.userService = userService;
    }

    /**
     * 本地存根的实现,可以在调用远程代理对象前做一些小验证
     * @param userId
     * @return
     */
    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        System.out.println("这是本地存根");
        if(!StringUtils.isEmpty(userId)){

            return userService.getUserAddressList(userId);
        }

        return null;
    }
}
