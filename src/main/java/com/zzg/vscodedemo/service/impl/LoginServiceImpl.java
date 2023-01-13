package com.zzg.vscodedemo.service.impl;

import com.alibaba.fastjson2.JSON;
import com.google.common.collect.Maps;
import com.zzg.common.result.R;
import com.zzg.vscodedemo.domain.LoginUser;
import com.zzg.vscodedemo.domain.dto.LoginDto;
import com.zzg.vscodedemo.service.LoginService;
import com.zzg.vscodedemo.util.RedisCache;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zzg
 */
@Service
@Slf4j
public class LoginServiceImpl implements LoginService {
    @Resource
    private AuthenticationManager authenticationManager;
    @Resource
    private RedisCache redisCache;

    @Override
    public R<Map<String,String>> login(LoginDto loginDto) {
        if (StringUtils.isBlank(loginDto.getUsername()) && StringUtils.isBlank(loginDto.getUsername())) {
            log.error("未填写账号或密码:{}", JSON.toJSON(loginDto));
            throw new NullPointerException("Invalid username or password");
        }
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(loginDto.getUsername(), loginDto.getPassword());
        Authentication authenticate = authenticationManager.authenticate(authenticationToken);
        if (ObjectUtils.isEmpty(authenticate)) {
            log.info("账号或者密码错误");
            throw new RuntimeException("Authentication not found");
        }
        LoginUser loginUser = (LoginUser) authenticate.getPrincipal();
        String userId = loginUser.getUser().getId().toString();
        redisCache.setCacheObject("loginId" + userId, JSON.toJSON(loginUser));
        HashMap<@Nullable String, @Nullable String> map = Maps.newHashMap();
        map.put("token", userId);
        return R.ok(map, "登录成功");
    }
}
