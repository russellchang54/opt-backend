package com.aek56.platform.system.api.exception;


import com.aek56.platform.system.api.exception.base.BusinessException;

/**
 * 无效验证码
 *
 * @author zj@aek56.com
 */
public class InvalidCaptchaException extends BusinessException {

    public InvalidCaptchaException(String message) {
        super(message);
    }

}
