package com.yys.freemarker;

import com.yys.service.UserService;
import freemarker.core.Environment;
import freemarker.template.TemplateDirectiveBody;
import freemarker.template.TemplateException;
import freemarker.template.TemplateModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Map;

/**
 * 用户管理
 *      Directive
 * @author yys
 */
@Component
public class UserDirective extends BaseDirective {

    @Autowired
    private UserService userService;

    public UserDirective() {
        super(UserDirective.class.getName());
    }

    /**
     * 自定义标签的方法
     * @param params
     * @return
     */
    public Object user(Map params) {
        return userService.getUserByName(params.get("name").toString());
    }

    public Object userList(Map params) {
        return userService.getUserList();
    }

}
