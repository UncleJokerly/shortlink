package com.fanaobo.shortlink.admin.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fanaobo.shortlink.admin.dao.entity.UserDO;
import com.fanaobo.shortlink.admin.dao.mapper.UserMapper;
import com.fanaobo.shortlink.admin.dto.resp.UserRespDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

/**
 * ClassName: UserServiceImpl
 * Package: com.fanaobo.shortlink.admin.service
 * Desciption: 用户接口实现层
 *
 * @Author UncleJoker
 * @Create 2024/7/1 13:01
 * @Verison 1.0
 */

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserDO> implements UserService{


    @Override
    public UserRespDTO getUserByUsername(String username) {
        LambdaQueryWrapper<UserDO> queryWrapper = Wrappers.lambdaQuery(UserDO.class)
                .eq(UserDO::getUsername, username);
        UserDO userDO = baseMapper.selectOne(queryWrapper);
        UserRespDTO result = new UserRespDTO();

        if(userDO != null) {
            BeanUtils.copyProperties(userDO, result); // 此方法需要判空，否则会报错
            return result;
        } else {
            return null;
        }
    }
}
