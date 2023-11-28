package com.shedule.service.impl;

import com.shedule.dao.SysUserDao;
import com.shedule.dao.impl.SysUserDaoImpl;
import com.shedule.pojo.SysUser;
import com.shedule.service.SysUserService;
import com.shedule.util.MD5Util;

/**
 * @version 1.0
 */
public class SysUserServiceImpl implements SysUserService {
    private SysUserDao userDao = new SysUserDaoImpl();
    @Override
    public int regist(SysUser sysUser) {
        //将用户的明文密码加密
        String userpwd = sysUser.getUserPwd();
        String encrypt = MD5Util.encrypt(userpwd);
        sysUser.setUserPwd(encrypt);
        //将sysUser信息存入数据库
       return userDao.addSysUser(sysUser);

    }

    @Override
    public SysUser findByUsername(String username) {
        SysUser sysUser = userDao.findByUsername(username);
        return sysUser;
    }


}
