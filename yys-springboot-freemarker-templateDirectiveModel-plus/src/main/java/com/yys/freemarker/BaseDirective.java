package com.yys.freemarker;

import freemarker.core.Environment;
import freemarker.ext.beans.BeansWrapper;
import freemarker.ext.beans.BeansWrapperBuilder;
import freemarker.template.*;
import org.springframework.util.StringUtils;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/**
 * 所有自定义标签的父类，负责调用具体的子类方法
 *      Directive
 * @author yys
 */
public abstract class BaseDirective implements TemplateDirectiveModel {

    private String clazzPath = null;

    public BaseDirective(String targetClassPath) {
        clazzPath = targetClassPath;
    }

    private String getMethod(Map params) {
        return this.getParam(params, "method");
    }

    protected int getPageSize(Map params) {
        int pageSize = 10;
        String pageSizeStr = this.getParam(params, "pageSize");
        if (!StringUtils.isEmpty(pageSizeStr)) {
            pageSize = Integer.parseInt(pageSizeStr);
        }
        return pageSize;
    }

    private void verifyParameters(Map params) throws TemplateModelException {
        String permission = this.getMethod(params);
        if (permission == null || permission.length() == 0) {
            throw new TemplateModelException("The 'name' tag attribute must be set.");
        }
    }

    String getParam(Map params, String paramName) {
        Object value = params.get(paramName);
        return value instanceof SimpleScalar ? ((SimpleScalar) value).getAsString() : null;
    }

    private DefaultObjectWrapper getBuilder() {
        return new DefaultObjectWrapperBuilder(Configuration.VERSION_2_3_25).build();
    }

    private TemplateModel getModel(Object o) throws TemplateModelException {
        return this.getBuilder().wrap(o);
    }


    @Override
    public void execute(Environment environment, Map map, TemplateModel[] templateModels,
                        TemplateDirectiveBody templateDirectiveBody) throws TemplateException, IOException {
        this.verifyParameters(map);
        String funName = getMethod(map);
        Method method = null;
        try {
            Class clazz = Class.forName(clazzPath);
            method = clazz.getDeclaredMethod(funName, Map.class);
            if (method != null) {
                Object res = method.invoke(this, map);
                environment.setVariable(funName, getModel(res));
            }
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        templateDirectiveBody.render(environment.getOut());
    }

}
