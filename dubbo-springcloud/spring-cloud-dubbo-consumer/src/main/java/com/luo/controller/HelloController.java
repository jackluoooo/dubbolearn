package com.luo.controller;

import com.luo.IHelloService;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: ljx
 * @create: 2020/07/31 19:34
 */
@RestController
public class HelloController {
    @Reference(version = "0.0.1")
    private IHelloService iHelloService;

    @GetMapping("say")
    public String sayHello(){
        return iHelloService.sayHello("ljx");
    }
}