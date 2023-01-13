package com.zzg.vscodedemo.service;

import com.zzg.common.result.R;
import com.zzg.vscodedemo.domain.SysUser;
import com.zzg.vscodedemo.domain.dto.LoginDto;

/**
 * 登录接口
 */
public interface LoginService {
    /**
     * 用户登录
     *
     * @param sysUser
     * @return
     */
    R login(LoginDto loginDto);
}
