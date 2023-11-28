package com.shedule.controller;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * @version 1.0
 *
 */
@WebServlet("/schedule/*")
public class SysScheduleController extends BaseContoller {


    protected void add(HttpServletRequest req, HttpServletResponse resp){
        System.out.println("增加日程");
    }
    protected void find(HttpServletRequest req, HttpServletResponse resp){
        System.out.println("查询日程");
    }
    protected void update(HttpServletRequest req, HttpServletResponse resp){
        System.out.println("修改日程");
    }
    protected void remove(HttpServletRequest req, HttpServletResponse resp){
        System.out.println("删除日程");
    }

}
