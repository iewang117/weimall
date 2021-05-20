package com.wei.weimall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@EnableFeignClients(basePackages = "com.wei.weimall.member.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class WeimallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeimallMemberApplication.class, args);
    }

}
