package com.aek56.platform.system.api.exception;


import com.aek56.platform.system.api.exception.base.BusinessException;

/**
 * 用户已存在
 *
 * @author zj@aek56.com
 */
public class UserExistException extends BusinessException {

    public UserExistException(String message) {
        super(message);
    }

}
