package com.shedule.service;

import com.shedule.pojo.SysUser;

/**
 * @version 1.0
 */
public interface SysUserService {
    /**
     * 注册用户的方法
     * @param sysUser 要注册的用户名和明文密码以SysUser对象的形式接收
     * @return 注册成功返回1 注册失败返回0
     */
    int regist(SysUser sysUser);

    /**
     * 根据用户名获得用户完整信息的方法
     * @param username 要查询的用户名
     * @return 成功返回SysUser对象 失败返回null
     */
    SysUser findByUsername(String username);
}
