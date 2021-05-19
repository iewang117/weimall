package com.wei.weimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.wei.weimall.product.dao")
@SpringBootApplication
public class WeimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeimallProductApplication.class, args);
    }

}
