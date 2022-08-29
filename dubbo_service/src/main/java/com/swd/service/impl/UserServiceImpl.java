package com.swd.service.impl;

import com.swd.service.UserService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author SuWeiDong
 * @date 2022-08-24 9:20
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public String sayHello() {
        return "Hello Dubbo";
    }
}
