package com.zzg.vscodedemo.service.impl;

import com.alibaba.fastjson2.JSON;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.google.common.collect.Maps;
import com.zzg.vscodedemo.domain.User;
import com.zzg.vscodedemo.mapper.UserMapper;
import com.zzg.vscodedemo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public Map queryAllUsers(int current, int size) {
        IPage<User> page = new Page<>(current, size);
        log.info("json分页数据{}", JSON.toJSONString(page));
        IPage<User> users = userMapper.selectPage(page, null);

        log.info("data数据{}", JSON.toJSONString(users));
        HashMap<@Nullable String, @Nullable Object> data = Maps.newHashMap();
        data.put("code", 200);
        data.put("msg", "success");
        data.put("data", JSON.toJSON(users));
        return data;
    }
}
