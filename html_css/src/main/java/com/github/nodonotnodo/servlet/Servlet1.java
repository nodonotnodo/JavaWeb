package com.github.nodonotnodo.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Servlet1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().write("这是我第一个idea中的Servlet,以下是浏览器的请求信息:<br>");

        //获取请求行信息

        StringBuilder sb = new StringBuilder();

        //获取请求方式
        sb.append(request.getMethod()).append("<br>");

        //请求uri
        sb.append(request.getRequestURI()).append("<br>");

        //请求协议版本
        sb.append(request.getProtocol()).append("<br>");

        //获取指定请求头信息
        sb.append(request.getHeader("host")).append("<br>");

        response.getWriter().write(sb.toString());
    }
}
