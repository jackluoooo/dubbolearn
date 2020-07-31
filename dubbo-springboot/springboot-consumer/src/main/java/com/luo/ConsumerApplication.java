package com.luo;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @description:
 * @author: ljx
 * @create: 2020/07/30 16:57
 */
@SpringBootApplication
public class ConsumerApplication {

//    url = "dubbo://192.168.1.136:20880/com.luo.IHelloService",
    @Reference(timeout = 10000,version = "${demo.service.version}")
    private IHelloService iHelloService;

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class,args);
    }

    @Bean
    public ApplicationRunner runner(){
        return args ->System.out.println(iHelloService.sayHello("ljx"));
    }
}