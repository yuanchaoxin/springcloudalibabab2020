package com.ityuan.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName FlowLimitController
 * @Package com.ityuan.springcloud.controller
 * @Author yuanchaoxin
 * @Date 2020/11/25
 * @Version 1.0
 * @Description
 */
@RestController
public class FlowLimitController {

    @GetMapping("/testA")
    public String testA() {
        return "test A";
    }

    @GetMapping("/testB")
    public String testB() {
        return "test B";
    }
}
