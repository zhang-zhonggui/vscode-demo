package com.zzg.vscodedemo.service;

import java.util.Map;

/**
 * @author zzg
 */

public interface UserService {
    /**
     * 查收所有用户
     * @param page 页数
     * @param pageSize 条数
     * @return
     */
    Map queryAllUsers(int page, int pageSize);
}
