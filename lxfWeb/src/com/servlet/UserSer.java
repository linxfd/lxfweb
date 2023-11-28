package com.servlet;

import javax.servlet.ServletConfig;


import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * @version 1.0
 */
@WebServlet(name = "/lxf")
public class UserSer extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("Servlet阿萨的");
    }
}