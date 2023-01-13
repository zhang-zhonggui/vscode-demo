package com.zzg.vscodedemo.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;

/**
    * 用户表
    */
@TableName(value = "sys_user")
public class SysUser {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 用户名
     */
    @TableField(value = "user_name")
    private String userName;

    /**
     * 昵称
     */
    @TableField(value = "nick_name")
    private String nickName;

    /**
     * 密码
     */
    @TableField(value = "`password`")
    private String password;

    /**
     * 账号状态（0正常 1停用）
     */
    @TableField(value = "`status`")
    private String status;

    /**
     * 邮箱
     */
    @TableField(value = "email")
    private String email;

    /**
     * 手机号
     */
    @TableField(value = "phonenumber")
    private String phonenumber;

    /**
     * 用户性别（0男，1女，2未知）
     */
    @TableField(value = "sex")
    private String sex;

    /**
     * 头像
     */
    @TableField(value = "avatar")
    private String avatar;

    /**
     * 用户类型（0管理员，1普通用户）
     */
    @TableField(value = "user_type")
    private String userType;

    /**
     * 创建人的用户id
     */
    @TableField(value = "create_by")
    private Long createBy;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private LocalDateTime createTime;

    /**
     * 更新人
     */
    @TableField(value = "update_by")
    private Long updateBy;

    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    private LocalDateTime updateTime;

    /**
     * 删除标志（0代表未删除，1代表已删除）
     */
    @TableField(value = "del_flag")
    private Integer delFlag;

    public static final String COL_ID = "id";

    public static final String COL_USER_NAME = "user_name";

    public static final String COL_NICK_NAME = "nick_name";

    public static final String COL_PASSWORD = "password";

    public static final String COL_STATUS = "status";

    public static final String COL_EMAIL = "email";

    public static final String COL_PHONENUMBER = "phonenumber";

    public static final String COL_SEX = "sex";

    public static final String COL_AVATAR = "avatar";

    public static final String COL_USER_TYPE = "user_type";

    public static final String COL_CREATE_BY = "create_by";

    public static final String COL_CREATE_TIME = "create_time";

    public static final String COL_UPDATE_BY = "update_by";

    public static final String COL_UPDATE_TIME = "update_time";

    public static final String COL_DEL_FLAG = "del_flag";

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取用户名
     *
     * @return user_name - 用户名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户名
     *
     * @param userName 用户名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取昵称
     *
     * @return nick_name - 昵称
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 设置昵称
     *
     * @param nickName 昵称
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取账号状态（0正常 1停用）
     *
     * @return status - 账号状态（0正常 1停用）
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置账号状态（0正常 1停用）
     *
     * @param status 账号状态（0正常 1停用）
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取邮箱
     *
     * @return email - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取手机号
     *
     * @return phonenumber - 手机号
     */
    public String getPhonenumber() {
        return phonenumber;
    }

    /**
     * 设置手机号
     *
     * @param phonenumber 手机号
     */
    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    /**
     * 获取用户性别（0男，1女，2未知）
     *
     * @return sex - 用户性别（0男，1女，2未知）
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置用户性别（0男，1女，2未知）
     *
     * @param sex 用户性别（0男，1女，2未知）
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 获取头像
     *
     * @return avatar - 头像
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * 设置头像
     *
     * @param avatar 头像
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    /**
     * 获取用户类型（0管理员，1普通用户）
     *
     * @return user_type - 用户类型（0管理员，1普通用户）
     */
    public String getUserType() {
        return userType;
    }

    /**
     * 设置用户类型（0管理员，1普通用户）
     *
     * @param userType 用户类型（0管理员，1普通用户）
     */
    public void setUserType(String userType) {
        this.userType = userType;
    }

    /**
     * 获取创建人的用户id
     *
     * @return create_by - 创建人的用户id
     */
    public Long getCreateBy() {
        return createBy;
    }

    /**
     * 设置创建人的用户id
     *
     * @param createBy 创建人的用户id
     */
    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新人
     *
     * @return update_by - 更新人
     */
    public Long getUpdateBy() {
        return updateBy;
    }

    /**
     * 设置更新人
     *
     * @param updateBy 更新人
     */
    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取删除标志（0代表未删除，1代表已删除）
     *
     * @return del_flag - 删除标志（0代表未删除，1代表已删除）
     */
    public Integer getDelFlag() {
        return delFlag;
    }

    /**
     * 设置删除标志（0代表未删除，1代表已删除）
     *
     * @param delFlag 删除标志（0代表未删除，1代表已删除）
     */
    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }
}