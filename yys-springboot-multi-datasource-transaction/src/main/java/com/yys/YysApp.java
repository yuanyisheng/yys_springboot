package com.yys;

import com.yys.config.order.OrderConfig;
import com.yys.config.user.UserConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({UserConfig.class, OrderConfig.class})
public class YysApp {

    public static void main(String[] args) {
        SpringApplication.run(YysApp.class, args);
    }

}
