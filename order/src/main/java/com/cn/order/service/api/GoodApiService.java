package com.cn.order.service.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 商品相关服务接口调用
 */

@FeignClient(name = "server-goods", fallback = GoodApiFallBackService.class)
public interface GoodApiService {
    /**
     * 获取商品类型列表
     * @param type
     * @return
     */
    @RequestMapping(value = "api/typeList", method = RequestMethod.GET)
    String goodsTYpeList(@RequestParam("type") String type);
}
