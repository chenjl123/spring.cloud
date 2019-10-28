package com.cn.order.controller;

import com.cn.order.service.api.GoodApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

@RefreshScope
@RestController
public class TestController {

    @Autowired
    private GoodApiService goodApiService;

    //@Autowired
    //private RestTemplate restTemplate;

    @Value("${app.name}")
    private String name;
    @GetMapping("hello")
    public String hello(HttpServletRequest request){
        Cookie[] cookies = request.getCookies();
        if(cookies != null && cookies.length > 0){
            for (Cookie cookie : cookies){
                System.out.println(cookie.getName() + " " + cookie.getValue());
            }
        }
        String list = goodApiService.goodsTYpeList("电脑");
        return list;
    }

    @GetMapping("config/hello")
    public String chello(){
        return name;
    }

    @GetMapping("api-order/hello")
    public String zhello(){
        //String bstr = restTemplate.getForObject("http://server-goods/api/typeList", String.class, "手机");
        return "request form getaway";
    }

    @GetMapping("list")
    public String list(){
        return "list 不能通过网关访问";
    }
}
