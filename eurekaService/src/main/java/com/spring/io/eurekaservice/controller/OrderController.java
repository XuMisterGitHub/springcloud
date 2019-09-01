package com.spring.io.eurekaservice.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *  模拟订单Controller
 */
@RestController
@RequestMapping("/order")
public class OrderController {


        @RequestMapping("/find")
        public Object query(String s){

            return "order-Controller";
        }

}