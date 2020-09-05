package com.atguigu.service.impl;

import com.atguigu.dao.UserDao;
import com.atguigu.domain.User;
import com.atguigu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author Ping
 * @Date 13:55 2020/9/2
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Autowired
    RedisTemplate redisTemplate;

    //只能存字符串
    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, readOnly = true)
    @Override
    public List<User> findAll() {
        //redis的key
        String key = "allUser";
        //先查询Redis中是否有数据，如果有直接返回Redis的数据
        List<User> userList = (List<User>) redisTemplate.boundValueOps(key).get();
        if (userList != null) {
            System.out.println("redis" + userList);
            return userList;
        }
        //如果没有查询数据库
        userList = userDao.findAll();
        //将数据可以数据存入到Redis中
        if (userList != null) {
            System.out.println("数据库" + userList);
            redisTemplate.boundValueOps(key).set(userList);
        }
        return userList;
    }
}
