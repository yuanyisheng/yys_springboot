package com.yys.freemarker;

import freemarker.ext.beans.BeansWrapper;
import freemarker.ext.beans.BeansWrapperBuilder;
import freemarker.template.Configuration;
import freemarker.template.TemplateDirectiveModel;

/**
 * 自定义标签父类
 *      Directive
 * @author yys
 */
public abstract class BaseDirective implements TemplateDirectiveModel {

    public static BeansWrapper getBeansWrapper(){
        return new BeansWrapperBuilder(Configuration.VERSION_2_3_21).build();
    }

}
