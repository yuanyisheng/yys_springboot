package com.yys;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yys.mapper")
public class YysApp {

    public static void main(String[] args) {
        SpringApplication.run(YysApp.class, args);
    }

}
