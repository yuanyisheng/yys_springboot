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

    @Override
    public void execute(Environment env, Map map, TemplateModel[] templateModels,
                        TemplateDirectiveBody body) throws TemplateException, IOException {
        // 通过名称获取用户宏
        env.setVariable("user", getBeansWrapper().wrap(userService.getUserByName(map.get("name").toString())));
        // 获取用户列表宏
        env.setVariable("userList", getBeansWrapper().wrap(userService.getUserList()));
        body.render(env.getOut());
    }

}
