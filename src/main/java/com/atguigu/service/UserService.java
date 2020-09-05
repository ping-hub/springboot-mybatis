package com.atguigu.service;

import com.atguigu.domain.User;

import java.util.List;

/**
 * @ClassName UserService
 * @Description TODO
 * @Author Ping
 * @Date 13:54 2020/9/2
 * @Version 1.0
 */
public interface UserService {
    List<User> findAll();
}
