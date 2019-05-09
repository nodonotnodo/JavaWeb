package com.github.nodonotnodo.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 302  进一步请求   +   location响应头：重定向
 *               302进一步请求的使用：
 *                   1.response.setStatus(302);
 *                   2.设置location响应头：response.setHeader("location","新页面")
 *               302进一步请求的简便方式：
 *                   response.sendRedirect(location)
 */

public class Status extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");

        response.setStatus(302);
        response.setHeader("location","servlet");

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
