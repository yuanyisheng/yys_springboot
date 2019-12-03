package com.yys.handler;

import com.yys.exception.APIException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * 全局异常捕获
 *      Handler
 * @author yys
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    // @ControllerAdvice 异常切面类

    /**
     * 全局运行时异常捕获
     * @return
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Map<String, Object> exceptionHandler(Exception ex) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        if(ex instanceof APIException) {
            map.put("errorCode", ((APIException) ex).getErrorCode());
            map.put("errorMsg", ((APIException) ex).getErrorMsg());
        } else {
            map.put("errorCode", 500);
            map.put("errorMsg", "系统错误");
        }
        System.err.println("错误位置：[" + ex.getStackTrace()[0] + "]");
        System.err.println("异常信息：[" + ex.getClass().getName() + "]");
        System.err.println("错误信息：[" + ex.getMessage() + "]");
        return map;
    }

}
