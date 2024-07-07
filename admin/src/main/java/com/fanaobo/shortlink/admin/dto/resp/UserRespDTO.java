package com.fanaobo.shortlink.admin.dto.resp;

import lombok.Data;

/**
 * ClassName: UserRespDTO
 * Package: com.fanaobo.shortlink.admin.dto.resp
 * Desciption:用户返回参数响应
 *
 * @Author UncleJoker
 * @Create 2024/7/1 13:14
 * @Verison 1.0
 */

@Data
public class UserRespDTO {
    /**
     * id
     */
    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 邮箱
     */
    private String mail;

    /**
     * 注销时间戳
     */
}
