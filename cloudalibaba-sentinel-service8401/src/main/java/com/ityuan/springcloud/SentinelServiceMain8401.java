package com.ityuan.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName SentinelServiceMain8401
 * @Package com.ityuan.springcloud
 * @Author yuanchaoxin
 * @Date 2020/11/25
 * @Version 1.0
 * @Description
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SentinelServiceMain8401 {
    
    public static void main(String[] args) {
         SpringApplication.run(SentinelServiceMain8401.class, args);
    }
    
}
