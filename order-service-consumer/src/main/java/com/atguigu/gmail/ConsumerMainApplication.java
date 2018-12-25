package com.atguigu.gmail;

import com.atguigu.gmail.bean.UserAddress;
import com.atguigu.gmail.service.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class ConsumerMainApplication {
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
