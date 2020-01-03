package com.fun.uncle.hello.dubbo.service.user.provider.api.impl;

import com.fun.uncle.hello.dubbo.service.user.api.UserService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

/**
 * @Description:
 * @Author: Xian
 * @CreateDate: 2020/1/3  10:31
 * @Version: 0.0.1-SNAPSHOT
 */
@Service(version = "${user.service.version}")
public class UserServiceImpl implements UserService {

    @Value(value = "${dubbo.protocol.port}")
    private String port;

    @Override
    public String sayHi() {
        return "hello DUBBO, I am " + port ;
    }
}
