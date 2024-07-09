package com.fanaobo.shortlink.admin.common.convention.errorcode;

/**
 * ClassName: IErrorCode
 * Package: com.fanaobo.shortlink.admin.common.convention.errorcode
 * Desciption:
 *
 * @Author UncleJoker
 * @Create 2024/7/9 15:31
 * @Verison 1.0
 */
/**
 * 平台错误码
 */
public interface IErrorCode {

    /**
     * 错误码
     */
    String code();

    /**
     * 错误信息
     */
    String message();
}