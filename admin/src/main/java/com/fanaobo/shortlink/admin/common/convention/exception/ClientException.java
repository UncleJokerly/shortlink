package com.fanaobo.shortlink.admin.common.convention.exception;

/**
 * ClassName: ClientException
 * Package: com.fanaobo.shortlink.admin.common.convention.exception
 * Desciption:
 *
 * @Author UncleJoker
 * @Create 2024/7/9 16:04
 * @Verison 1.0
 */

import com.fanaobo.shortlink.admin.common.convention.errorcode.BaseErrorCode;
import com.fanaobo.shortlink.admin.common.convention.errorcode.IErrorCode;

/**
 * 客户端异常
 */
public class ClientException extends AbstractException {

    public ClientException(IErrorCode errorCode) {
        this(null, null, errorCode);
    }

    public ClientException(String message) {
        this(message, null, BaseErrorCode.CLIENT_ERROR);
    }

    public ClientException(String message, IErrorCode errorCode) {
        this(message, null, errorCode);
    }

    public ClientException(String message, Throwable throwable, IErrorCode errorCode) {
        super(message, throwable, errorCode);
    }

    @Override
    public String toString() {
        return "ClientException{" +
                "code='" + errorCode + "'," +
                "message='" + errorMessage + "'" +
                '}';
    }
}