package com.luo;

import com.luo.service.IUserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description:
 * @author: ljx
 * @create: 2020/07/30 15:48
 */
public class Consumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new
                ClassPathXmlApplicationContext("classpath:META-INFO/spring/consumer.xml");
        IUserService iUserService = classPathXmlApplicationContext.getBean("userService",IUserService.class);
        System.out.println(iUserService.getNameById("111111"));

    }
}