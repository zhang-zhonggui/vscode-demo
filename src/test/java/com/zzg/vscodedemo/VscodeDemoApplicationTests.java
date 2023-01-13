package com.zzg.vscodedemo;

import com.alibaba.fastjson2.JSON;
import com.google.gson.Gson;
import com.zzg.common.json.gson.GsonUtils;
import com.zzg.vscodedemo.domain.SysUser;
import com.zzg.vscodedemo.mapper.SysUserMapper;
import com.zzg.vscodedemo.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@SpringBootTest
class VscodeDemoApplicationTests {
    @Resource
    private UserService userService;
    @Resource
    private SysUserMapper sysUserMapper;
    @Resource
    private RedisTemplate redisTemplate;

    @Test
    void contextLoads() {
        List<SysUser> sysUsers = sysUserMapper.selectList(null);
        System.out.println(sysUsers);
        redisTemplate.opsForValue().set("users",sysUsers);
    }

}
