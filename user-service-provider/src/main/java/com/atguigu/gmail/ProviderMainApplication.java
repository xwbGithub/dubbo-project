package com.atguigu.gmail;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ProviderMainApplication {
    public static void main(String[] args) {
        try {
            ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("provider.xml");
            ctx.start();
            System.out.println("容器启动中...");
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
