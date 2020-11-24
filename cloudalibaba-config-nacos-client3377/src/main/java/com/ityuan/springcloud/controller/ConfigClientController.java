package com.ityuan.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.annotation.Retention;

/**
 * @ClassName ConfigClientController
 * @Package com.ityuan.springcloud.controller
 * @Author yuanchaoxin
 * @Date 2020/11/22
 * @Version 1.0
 * @Description
 */
@RestController
@RefreshScope
public class ConfigClientController {

    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/config/info")
    public String getInfo() {
        return configInfo;
    }
}
