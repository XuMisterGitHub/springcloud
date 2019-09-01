package com.spring.io.eurekaclient.service.fallback;

import com.spring.io.eurekaclient.service.OrderService;
import org.springframework.stereotype.Component;

@Component
public class OrderHystric implements OrderService {
    @Override
    public String queryOrderByName(String name) {
        return name + "error";
    }
}
