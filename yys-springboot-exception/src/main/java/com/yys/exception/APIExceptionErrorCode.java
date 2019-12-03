package com.yys.exception;

/**
 * 自定义异常错误编码
 *      Exception
 * @author yys
 */
public class APIExceptionErrorCode {
    
    /**
     * 系统参数异常编码
     *  建议以1开头
     */
    public enum SysError {

    	APP_KEY_ERROR(10000, "APP_KEY错误，可能为非法请求"),
    	SYS_PARAM_ERROR(10001, "系统参数不正确"),
    	TIME_EXPIRE_ERROR(10002, "系统时间差超过预设值，可能为非法请求"),
    	ACCESS_TOKEN_ERROR(10003, "ACCESS_TOKEN错误，可能为非法请求"),
    	ACCESS_TOKEN_EXPIRE(10004, "ACCESS_TOKEN已过期"),
    	SIGN_ERROR(10005, "签名验证不通过"),
    	NOT_EXIST(10006, "为必填项"),
    	TRANSFORM_ERROR(10007, "类型转换错误"),
    	SERVICE_ERROR(10008, "服务异常,请求不可达");

        private int code;
        private String message;

        private SysError(int code, String message) {
            this.code = code;
            this.message = message;
        }

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

    }
    
    /**
     * 业务异常编码
     */
    public enum BizError {

    	/**
    	 * 公共业务异常================================================
    	 *  建议以9开头
    	 */
    	APP_KEY_NOT_EXIST(90001,"APP_KEY不存在"),
    	API_TYPE_NULL(90002, "请求接口类型为空"),
    	SPECIAL_CHARACTERS(90003, "上传路径存在特殊字符"),
    	BIZ_PARAM_ERROR(90004,"业务参数不正确"),
        DATA_NOT_BELONG_PRV(90005, "访问数据不属于此当前卖家"),
        FORM_DATA_IS_NULL(90006, "提交数据为空"),


    	/**
    	 * user业务异常================================================
    	 * 	建议以2开头
    	 */
        PROVIDER_NOT_EXIST(20001, "卖家不存在"),


    	/**
    	 * prod业务异常================================================
    	 * 	建议以3开头
    	 */
    	PROD_NOT_EXIST(30001, "商品不存在"),


        /**
    	 * order业务异常================================================
    	 * 	建议以4开头
    	 */
    	ORDER_NOT_EXIST(40002, "订单不存在");


        private int code;
        
        private String message;

        private BizError(int code, String message) {
            this.code = code;
            this.message = message;
        }

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

    }

}