package com.github.nodonotnodo.servletContext_scope;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ScopeDemo1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");

        ServletContext sc = request.getServletContext();

        sc.setAttribute("name","李耀");
        sc.setAttribute("password","1234");

        response.getWriter().write("用户李耀的密码是1234");
        response.sendRedirect("/scope2");

    }
}
