package com.zzg.vscodedemo.controller;

import com.zzg.common.result.R;
import com.zzg.vscodedemo.domain.dto.LoginDto;
import com.zzg.vscodedemo.service.LoginService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 用户登录模块
 *
 * @author zzg
 */
@RestController
@RequestMapping("user")
public class LoginController {
    @Resource
    private LoginService loginService;
    @PostMapping()
    public R login(@RequestBody LoginDto login) {

        return loginService.login(login);
    }
}
