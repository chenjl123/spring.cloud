package com.cn.goods.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class TestController {
    @Value("${app.name}")
    private String name;
    @GetMapping("hello")
    public String hello(){
        return "hello order";
    }

    @GetMapping("config/hello")
    public String chello(){
        return name;
    }
}
