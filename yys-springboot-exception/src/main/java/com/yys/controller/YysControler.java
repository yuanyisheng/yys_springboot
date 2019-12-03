package com.yys.controller;

import com.yys.exception.APIException;
import com.yys.exception.APIExceptionErrorCode;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 全局异常捕获测试
 *      Controller
 * @author yys
 */
@RestController
@RequestMapping("/test")
public class YysControler {

    /**
     * 系统异常测试
     * @return
     */
    @RequestMapping("/exception")
    public String exception() {
        int i = 1 / 0;
        return "success";
    }

    /**
     * 自定义异常测试
     * @return
     * @throws APIException
     */
    @RequestMapping("/apiException")
    public String apiException() throws APIException {
        throw new APIException(APIExceptionErrorCode.SysError.SYS_PARAM_ERROR.getCode(),
                APIExceptionErrorCode.SysError.SYS_PARAM_ERROR.getMessage());
    }

}
