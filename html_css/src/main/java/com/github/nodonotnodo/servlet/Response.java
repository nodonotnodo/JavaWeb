package com.github.nodonotnodo.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * HttpServletResponse对象
 */

public class Response extends HttpServlet {

    //1.tomcat：
    //2.服务器响应时：例如：携带（cookie：饼干 小甜点）  将cookie携带给浏览器

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=utf-8");

        //3.设置响应参数

        //3.1设置响应头
        //setHeader("KEY","VALUE")
        //tomcat：server：apache-tomcat
        response.setHeader("server","apache-tomcat");

        //3.2设置响应状态码
        /**
         * 200  响应成功
         * 500  服务器有问题
         * 404  一般情况：路径有问题（url-pattern）
         * 406  异步请求出现问题
         * 400  项目下找不到资源
         * 302  进一步请求   +   location响应头：重定向
         *      302进一步请求的使用：
         *          1.response.setStatus(302);
         *          2.设置location响应头：response.setHeader("location","新页面")
         *      302进一步请求的简便方式：
         *          response.sendRedirect(location)
         */
//        response.setStatus(404);

        //3.3使用字符流向浏览器输出内容

        //3.4使用字节流向浏览器输出内容（一般为图片，视频，音频等文件）

    }
}
