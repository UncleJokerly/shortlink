package com.fanaobo.shortlink.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fanaobo.shortlink.admin.dao.entity.UserDO;
import com.fanaobo.shortlink.admin.dto.resp.UserRespDTO;

/**
 * ClassName: UserService
 * Package: com.fanaobo.shortlink.admin.service
 * Desciption:
 *
 * @Author UncleJoker
 * @Create 2024/7/1 12:59
 * @Verison 1.0
 */
public interface UserService extends IService<UserDO> {

    /**
     * 根据用户名查询用户信息
     *
     * @param username 用户名
     * @return 用户返回实体
     */
    UserRespDTO getUserByUsername(String username);
}
