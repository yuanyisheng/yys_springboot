package com.yys.config.order;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "spring.datasource.order")
@Data
public class OrderConfig {

    private String url;

    private String userName;

    private String password;

    private int minPoolSize;

    private int maxPoolSize;

    private int maxLifeTime;

    private int maxIdleTime;

    private int loginTimeout;

    private int maintenanceInterval;

    private int borrowConnectionTimeout;

    private String testQuery;

    private String uniqueResourceName;

}
