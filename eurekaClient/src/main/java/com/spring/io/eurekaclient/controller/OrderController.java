package com.spring.io.eurekaclient.controller;


import com.spring.io.eurekaclient.service.OrderService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    /**
     * 查询订单
     * @param name
     * @return
     */
    @RequestMapping("/query")
    public Object queryOrder(String name) {

        if (StringUtils.isBlank(name)) {
            name = "car";
        }
        return orderService.queryOrderByName(name);

    }
}
