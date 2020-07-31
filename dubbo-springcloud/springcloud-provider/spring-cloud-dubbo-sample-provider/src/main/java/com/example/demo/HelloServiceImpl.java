package com.example.demo;

import com.luo.IHelloService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

/**
 * @description:
 * @author: ljx
 * @create: 2020/07/31 15:10
 */
@Service(version = "0.0.1")
public class HelloServiceImpl implements IHelloService {
    @Value("${dubbo.application.name}")
    private String serviceName;

    public String sayHello(String name) {
        System.out.println(String.format("[%s]:Hello,%s",serviceName,name));
        return String.format("[%s]:Hello,%s",serviceName,name);
    }
}