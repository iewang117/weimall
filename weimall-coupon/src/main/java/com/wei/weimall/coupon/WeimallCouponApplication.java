package com.wei.weimall.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class WeimallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeimallCouponApplication.class, args);
    }

}
