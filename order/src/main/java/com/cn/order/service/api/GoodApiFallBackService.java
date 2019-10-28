package com.cn.order.service.api;

import org.springframework.stereotype.Service;

@Service
public class GoodApiFallBackService implements GoodApiService{

    @Override
    public String goodsTYpeList(String type) {
        System.out.println("服务器太拥挤，请刷新后重试");
        return "服务器太拥挤，请刷新后重试";
    }
}
