package com.shedule.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;

/**
 * @version 1.0
 */
public class BaseContoller extends HttpServlet {
    /**
     * 增加日程的请求 /schedule/add
     * 查询日程的请求 /schedule/find
     * 修改日程的请求 /schedule/update
     * 删除日程的请求 /schedule/remove
     */
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String requestURI = req.getRequestURI();   //  /schedule/add
        String[] split = requestURI.split("/");
        String methodName  = split[split.length - 1];   //  add
        Class<?> aClass;
        aClass = this.getClass();

        try {
            Method method = aClass.getDeclaredMethod(methodName, HttpServletRequest.class,HttpServletResponse.class);
            //暴力 破的访问权限
            method.setAccessible(true);
            method.invoke(this, req, resp);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
