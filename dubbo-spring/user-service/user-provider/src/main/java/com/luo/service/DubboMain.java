package com.luo.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.rmi.rmic.newrmic.Main;


import java.io.IOException;

/**
 * @description:
 * @author: ljx
 * @create: 2020/07/30 14:46
 */
public class DubboMain {
    public static void main(String[] args) throws IOException {
        //
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new
                ClassPathXmlApplicationContext("classpath:META-INF/spring/user-provider.xml");
        classPathXmlApplicationContext.start();
        System.in.read();

    }
}