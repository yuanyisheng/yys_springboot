package com.yys.exception;

import lombok.Data;

/**
 * 自定义异常类
 *      Exception
 * @author yys
 */
@Data
public class APIException extends Exception {

    private static final long serialVersionUID = 1L;

    /**
     * errorCode：异常编码
     * errorMsg：异常描述
     * resolvedMsg：解决方法描述
     */
    private Integer errorCode;
    private String errorMsg;
    private String resolvedMsg;

    public APIException(Integer errorCode) {
        super("");
        this.errorCode = errorCode;
        this.errorMsg = "";
        this.resolvedMsg = "";
    }

    public APIException(Integer errorCode, String errorMsg) {
        super(errorMsg);
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
        this.resolvedMsg = "";
    }

    public APIException(Integer errorCode, String errorMsg, String resolvedMsg) {
        super(errorMsg);
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
        this.resolvedMsg = resolvedMsg;
    }

}