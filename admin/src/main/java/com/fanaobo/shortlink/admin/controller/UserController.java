package com.fanaobo.shortlink.admin.controller;

import com.fanaobo.shortlink.admin.common.convention.result.Result;
import com.fanaobo.shortlink.admin.common.enums.UserErrorCodeEnum;
import com.fanaobo.shortlink.admin.dto.resp.UserRespDTO;
import com.fanaobo.shortlink.admin.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: UserController
 * Package: com.fanaobo.shortlink.admin.controller
 * Desciption:
 *
 * @Author UncleJoker
 * @Create 2024/6/29 16:18
 * @Verison 1.0
 *
 * 用户管理控制层
 */

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    /**
     * 根据用户名查询信息
     */
    @GetMapping("api/shortlink/v1/user/{username}")
    public Result<UserRespDTO> getUserByUsername(@PathVariable("username") String username) {
        UserRespDTO result = userService.getUserByUsername(username);
        if(result == null) {
            return new Result<UserRespDTO>().setCode(UserErrorCodeEnum.USER_NULL.code()).setMessage(UserErrorCodeEnum.USER_NULL.message());
        } else {
            return new Result<UserRespDTO>().setCode("0").setData(result);
        }
    }
}
