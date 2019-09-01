package com.spring.io.eurekaclient.service;

import com.spring.io.eurekaclient.service.fallback.OrderHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "orderServer", fallback = OrderHystric.class)
public interface OrderService {

    /*
        查询订单
     */
    @RequestMapping("/order/find")
    String queryOrderByName(@RequestParam(value = "name") String name);
}
