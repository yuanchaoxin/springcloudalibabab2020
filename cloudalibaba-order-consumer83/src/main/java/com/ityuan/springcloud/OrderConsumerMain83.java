package com.ityuan.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName OrderConsumerMain83
 * @Package com.ityuan.springcloud
 * @Author yuanchaoxin
 * @Date 2020/11/22
 * @Version 1.0
 * @Description
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderConsumerMain83 {
    
    public static void main(String[] args) {
         SpringApplication.run(OrderConsumerMain83.class, args);
    }
    
}
