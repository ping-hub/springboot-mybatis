package com.atguigu;

import com.atguigu.domain.User;
import com.atguigu.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.util.List;

/**
 * @ClassName MyTest
 * @Description TODO
 * @Author Ping
 * @Date 14:44 2020/9/2
 * @Version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MyTest {

    @Autowired
    UserService userService;

    @Autowired
    DataSource dataSource;

    @Test
    public void testFindAll(){
        List<User> userList = userService.findAll();
        System.out.println(userList);
    }

    @Test
    public void testDruid(){
        System.out.println(dataSource.getClass());
    }
}



















