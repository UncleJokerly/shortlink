package com.fanaobo.shortlink.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * ClassName: ShortLinkAdminApplication
 * Package: com.fanaobo.shortlink.admin
 * Desciption:
 *
 * @Author UncleJoker
 * @Create 2024/6/29 15:06
 * @Verison 1.0
 */

@SpringBootApplication
@MapperScan("com.fanaobo.shortlink.admin.dao.mapper")
public class ShortLinkAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShortLinkAdminApplication.class, args);
    }

}
