package com.atguigu.gmail;

import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.service.OrderService;
import com.atguigu.gmall.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.List;

public class MainApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("consumer.xml");
        OrderService bean = ctx.getBean(OrderService.class);
        ctx.start();
        System.out.println("消费者启动中...");
        List<UserAddress> userAddressList = bean.initOrder("1");
        System.out.println(userAddressList);
        System.out.println("消费者调用结束...");
    }
}
