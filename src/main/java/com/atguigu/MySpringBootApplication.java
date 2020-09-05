package com.atguigu;

import com.atguigu.domain.User;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @ClassName MySpringBootApplication
 * @Description TODO
 * @Author Ping
 * @Date 13:58 2020/9/2
 * @Version 1.0
 */

@EnableTransactionManagement//启用声明式事务
@MapperScan("com.atguigu.dao")//扫描dao接口，创建代理对象
@ServletComponentScan//扫描web组件
@SpringBootApplication
public class MySpringBootApplication {
    public static void main(String[] args) {
        ApplicationContext run = SpringApplication.run(MySpringBootApplication.class, args);
        User user = (User) run.getBean("user123");
        System.out.println(user);
        System.out.println("111111");
        System.out.println("11111111111");
        System.out.println("3333333");
        System.out.println("2222222");
    }
}



















