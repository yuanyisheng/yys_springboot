package com.yys.config;

import com.yys.freemarker.UserDirective;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

/**
 * Freemarker自定义指令(宏)
 *      Config
 * @author yys
 */
@Configuration
public class FreeMarkerConfig {

    @Autowired
    private freemarker.template.Configuration configuration;

    @Autowired
    private UserDirective userDirective;

    @PostConstruct
    public void setSharedVariable() {
        // userDirective即为页面上调用的标签名
        configuration.setSharedVariable("userDirective", userDirective);
    }

}
