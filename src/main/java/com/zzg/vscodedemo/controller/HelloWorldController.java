package com.zzg.vscodedemo.controller;

import com.alibaba.fastjson2.JSON;
import com.zzg.common.result.R;
import com.zzg.vscodedemo.mapper.UserMapper;
import com.zzg.vscodedemo.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 测试
 *
 * @author zzg
 */
@RestController
@RequestMapping
public class HelloWorldController {
    @Resource
    private UserService userService;

    @GetMapping("hello")
    public R hello() {
        return R.ok(userService.queryAllUsers(0, 2));
    }
}
