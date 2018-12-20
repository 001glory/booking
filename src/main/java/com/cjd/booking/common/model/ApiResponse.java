package com.cjd.booking.common.model;

import com.cjd.booking.common.erroercode.ErrorCode;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;

@Getter
public class ApiResponse<T> {

    /**
     * 操作成功标识
     */
    private Boolean  success;

    /**
     * 错误状态码
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer errorCode;

    /**
     *api状态消息
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String message;

    /**
     *api数据
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    protected T data;

    public ApiResponse(Boolean success, Integer errorCode, String message, T data) {
        this.success = success;
        this.errorCode = errorCode;
        this.message = message;
        this.data = data;
    }

    /**
     * 操作失败
     * @param errorCode 错误状态码
     * @return
     */
    public static ApiResponse fail(ErrorCode errorCode){
        return new ApiResponse(Boolean.FALSE,errorCode.getCode(),errorCode.getMessage(),null);
    }

    /**
     * 根据错误状态码和错误信息解决问题
     * @param errorCode 错误状态码
     * @param message 错误信息
     * @return
     */
    public static ApiResponse fail(ErrorCode errorCode,String message){
        return new ApiResponse(Boolean.FALSE,errorCode.getCode(),message,null);
    }

    /**
     * 操作成功
     * @return
     */
    public static ApiResponse success(){
        return new ApiResponse(Boolean.TRUE,null,"success",null);
    }

    /**
     * 操作成功并返回数据
     * @param data 接口数据
     * @return
     */
    public static<T> ApiResponse success(T data){
        return new ApiResponse(Boolean.TRUE,null,"success",data);
    }
}
