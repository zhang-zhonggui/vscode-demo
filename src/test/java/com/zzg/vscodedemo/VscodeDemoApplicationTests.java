package com.zzg.vscodedemo;

import com.alibaba.fastjson2.JSON;
import com.zzg.vscodedemo.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Map;

@SpringBootTest
class VscodeDemoApplicationTests {
    @Resource
    private UserService userService;

    @Test
    void contextLoads() {
        Map map = userService.queryAllUsers(1, 2);
        System.out.println(JSON.toJSON(map));
    }

}
