package com.github.nodonotnodo.servletContext_scope;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ScopeDeom2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");

        ServletContext sc = request.getServletContext();
        String name = (String) sc.getAttribute("name");

        response.getWriter().write("name:"+sc.getAttribute("name")+"<br>password:"+sc.getAttribute("password"));
    }
}
