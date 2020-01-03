package com.fun.uncle.hello.dubbo.service.user.consumer.controller;

import com.fun.uncle.hello.dubbo.service.user.api.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: Xian
 * @CreateDate: 2020/1/3  11:22
 * @Version: 0.0.1-SNAPSHOT
 */

@RestController
public class UserController {

    @Reference(version = "${user.service.version}")
    private UserService userService;

    @RequestMapping(value = "hi")
    public String sayHi() {
        return userService.sayHi();
    }
}
