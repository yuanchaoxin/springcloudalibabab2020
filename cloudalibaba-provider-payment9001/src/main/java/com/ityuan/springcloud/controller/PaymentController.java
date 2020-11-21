package com.ityuan.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName PaymentController
 * @Package com.ityuan.springcloud.controller
 * @Author yuanchaoxin
 * @Date 2020/11/21
 * @Version 1.0
 * @Description
 */
@RestController
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/payment/nacos/{id}")
    public String getPayment(@PathVariable("id") Integer id) {
        return "nacos registry,serverPost :" + serverPort + "\t id:" + id;
    }
}
