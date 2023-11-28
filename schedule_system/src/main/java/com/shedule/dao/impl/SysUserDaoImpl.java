package com.shedule.dao.impl;

import com.shedule.dao.BaseDao;
import com.shedule.dao.SysUserDao;
import com.shedule.pojo.SysUser;

import java.util.List;

/**
 * @version 1.0
 */
public class SysUserDaoImpl extends BaseDao implements SysUserDao {

    @Override
    public int addSysUser(SysUser sysUser) {
        String sql = "INSERT into sys_user values(DEFAULT,?,?)";
        int rows = baseUpdate(sql, sysUser.getUsername(), sysUser.getUserPwd());
        return rows;
    }

    @Override
    public SysUser findByUsername(String username) {
        String sql = "SELECT uid,username,user_pwd userPwd from sys_user where username = ?";
        List<SysUser> sysUserList = baseQuery(SysUser.class, sql, username);
        if (sysUserList != null && sysUserList.size() > 0) {
            return sysUserList.get(0);
        }else {
            return null;
        }

    }
}
