package com.yys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Freemarker测试
 *      Controller
 * @author yys
 */
@Controller
public class FreemarkerController {

    @RequestMapping("/index")
    public String index(Map<String, Object> map) {
        // 花名
        map.put("name", "yys");
        // 性别
        map.put("sex", "1");
        // 爱好
        List<String> list = new ArrayList<String>(0);
        list.add("挑灯写博客");
        list.add("打羽毛球");
        list.add("健身");
        map.put("hobbys", list);
        return "/index";
    }

}
