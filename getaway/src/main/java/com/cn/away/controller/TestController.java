package com.cn.away.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Value("${app.name}")
    private String name;

    @GetMapping("hello")
    public String hello(){
        return name;
    }
}
