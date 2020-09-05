package com.atguigu.controller;

import com.atguigu.domain.User;
import com.atguigu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author Ping
 * @Date 13:55 2020/9/2
 * @Version 1.0
 */
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @Value("${user1.username}")
    private String username;

    @Value("${user1.password}")
    private String password;

    @Value("${user1.name}")
    private String name;

    @RequestMapping("/quick")
    public String quick() {
        return "username:" + username + ",password=" + password + "name:" + name;
    }

    @RequestMapping("/user/findAll")
    public List<User> findAll() {
        return userService.findAll();
    }
}
