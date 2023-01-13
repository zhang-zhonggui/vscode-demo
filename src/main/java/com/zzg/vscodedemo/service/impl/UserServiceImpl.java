package com.zzg.vscodedemo.service.impl;

import com.alibaba.fastjson2.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.Mapper;
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
import java.util.List;
import java.util.Map;
import java.util.Queue;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public Map queryAllUsers(Integer num, Integer size) {
        if (num == null) {
            num = 0;
        }
        if (size == null) {
            num = 10;
        }
        Page<User> page = new Page<>(num, size);
        page.setOptimizeCountSql(false);
        QueryWrapper<User> queryWrapper = new QueryWrapper<User>().ge("id", 2);
        Page<User> users = userMapper.selectPage(page, queryWrapper);
        System.out.println("总页数： " + users.getPages());
        System.out.println("总记录数： " + users.getTotal());
        users.getRecords().forEach(System.out::println);

        return null;
    }
}
