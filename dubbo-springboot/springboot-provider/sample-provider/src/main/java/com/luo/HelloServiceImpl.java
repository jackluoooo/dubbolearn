package com.luo;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

/**
 * @description:
 * @author: ljx
 * @create: 2020/07/30 16:41
 */
@Service(version = "${demo.service.version}")
public class HelloServiceImpl implements  IHelloService {
    @Value("${dubbo.application.name}")
    private String serviceName;
    public String sayHello(String name) {
        return String.format("[%S]:hello,%S",serviceName,name);
    }
}