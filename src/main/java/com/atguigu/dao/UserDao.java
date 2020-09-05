package com.atguigu.dao;

import com.atguigu.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName UserDao
 * @Description TODO
 * @Author Ping
 * @Date 13:52 2020/9/2
 * @Version 1.0
 */
@Repository
public interface UserDao {
    public List<User> findAll();
}
