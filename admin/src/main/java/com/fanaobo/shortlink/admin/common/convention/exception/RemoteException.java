package com.fanaobo.shortlink.admin.common.convention.exception;

/**
 * ClassName: RemoteException
 * Package: com.fanaobo.shortlink.admin.common.convention.exception
 * Desciption:
 *
 * @Author UncleJoker
 * @Create 2024/7/9 16:05
 * @Verison 1.0
 */

import com.fanaobo.shortlink.admin.common.convention.errorcode.BaseErrorCode;
import com.fanaobo.shortlink.admin.common.convention.errorcode.IErrorCode;

/**
 * 远程服务调用异常
 */
public class RemoteException extends AbstractException {

    public RemoteException(String message) {
        this(message, null, BaseErrorCode.REMOTE_ERROR);
    }

    public RemoteException(String message, IErrorCode errorCode) {
        this(message, null, errorCode);
    }

    public RemoteException(String message, Throwable throwable, IErrorCode errorCode) {
        super(message, throwable, errorCode);
    }

    @Override
    public String toString() {
        return "RemoteException{" +
                "code='" + errorCode + "'," +
                "message='" + errorMessage + "'" +
                '}';
    }
}