package com.ityuan.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName PaymentMain9001
 * @Package com.ityuan.springcloud
 * @Author yuanchaoxin
 * @Date 2020/11/21
 * @Version 1.0
 * @Description
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain9001 {
    
    public static void main(String[] args) {
         SpringApplication.run(PaymentMain9001.class, args);
    }
    
}
