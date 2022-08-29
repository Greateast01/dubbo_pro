package com.swd.controller;

import com.swd.service.UserService;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author SuWeiDong
 * @date 2022-08-24 9:35
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Reference
    private UserService userService;

    @GetMapping
    public String sayHello() {
        return userService.sayHello();
    }
}
