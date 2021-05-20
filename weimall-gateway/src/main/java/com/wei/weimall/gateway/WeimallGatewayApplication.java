package com.wei.weimall.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class WeimallGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeimallGatewayApplication.class, args);
    }

}
