package com.shedule.dao;

import com.shedule.pojo.SysSchedule;
import com.shedule.pojo.SysUser;

import java.util.List;

/**
 * @version 1.0
 */
public interface SysUserDao {

    /**
     * 向数据库中增加一条用户记录的方法
     * @param sysUser 要增加的记录的username和user_pwd字段以SysUser实体类对象的形式接收
     * @return 增加成功返回 增加失败返回0
     */
    int addSysUser(SysUser sysUser);

    /**
     * 根据用户名字查询用户完整信息
     * @param username 用户名
     * @return 成功返回SysUser实体类对象，失败返回null
     */
    SysUser findByUsername(String username);
}
