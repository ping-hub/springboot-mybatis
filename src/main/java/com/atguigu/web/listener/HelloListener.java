package com.atguigu.web.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @ClassName HelloListener
 * @Description TODO 监听器
 * @Author Ping
 * @Date 20:37 2020/9/4
 * @Version 1.0
 */
@WebListener
public class HelloListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("HelloListener - contextInitialized");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("HelloListener - contextDestroyed");
    }
}
