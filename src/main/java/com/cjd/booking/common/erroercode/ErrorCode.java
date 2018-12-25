package com.cjd.booking.common.erroercode;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@AllArgsConstructor
public class ErrorCode {

    /**
     * 错误code
     */
    private int code;

    /**
     *状态消息
     */
    private String message;
}
