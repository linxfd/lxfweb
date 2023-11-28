package com.shedule.controller;

import com.shedule.pojo.SysUser;
import com.shedule.service.SysUserService;
import com.shedule.service.impl.SysUserServiceImpl;
import com.shedule.util.MD5Util;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @version 1.0
 */
@WebServlet("/user/*")
public class SysUserController extends BaseContoller  {

    private SysUserService userService = new SysUserServiceImpl();
    /**
     * 接收用户注册请求的业务处理方法（业务接口）
     * @param req
     * @param resp
     */
    protected void regist(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        //1 接收客户端请求参数
        String username = req.getParameter("username");
        String userPwd = req.getParameter("userPwd");
        //2 调用服务层方法，完成注册功能
            //将参数放入一个SysUser对象，在调用regist方法传入(如果参数过多可以将参数封装到一个对象中)
        SysUser sysUser = new SysUser(null, username, userPwd);

        int rows = userService.regist(sysUser);

        //3 响应注册结果（成功 失败）
        if(rows > 0){
            resp.sendRedirect("/registSuccess.html");
        }else{
            resp.sendRedirect("/registFail.html");
        }
    }

    /**
     * 接收用户登录请求的业务处理方法（业务接口）
     * @param req
     * @param resp
     * @throws IOException
     */
    protected void login(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        //1 接收客户端请求参数
        String username = req.getParameter("username");
        String userPwd = req.getParameter("userPwd");
        //2 调用服务层方法，完成登录功能
        SysUser loginUser = userService.findByUsername(username);
        //3 响应登录结果（成功 失败）
        if(loginUser == null){
            resp.sendRedirect("/loginUsernameError.html");
        }else if(!MD5Util.encrypt(userPwd).equals(loginUser.getUserPwd())){
            //密码错误
            resp.sendRedirect("/loginUserPwdError.html");
        }else{
            //密码正确
            resp.sendRedirect("/showSchedule.html");
        }
    }
}

