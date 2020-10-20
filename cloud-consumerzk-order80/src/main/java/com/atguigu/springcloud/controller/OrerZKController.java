package com.atguigu.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class OrerZKController {

    private static  final String INVOKE_URL = "http://cloud-provider-paymnet";

    @Resource
    private RestTemplate restTemplate;


    @GetMapping(value = "/consumer/paymnet/zk")
    public String paymetnInfo(){
        String result = restTemplate.getForObject(INVOKE_URL + "/payment/zk", String.class);
        return result;
    }
}
