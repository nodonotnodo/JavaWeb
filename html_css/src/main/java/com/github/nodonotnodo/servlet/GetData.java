package com.github.nodonotnodo.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;


/**
 *
 * request获取参数
 *      注意：get提交方法和post提交方法获取参数方式是不一样的
 *
 * 两种方法获取参数方法不一致，这样不够便捷，要使他们的获取参数方法通用
 *      1.通过表单名称获得单个参数--->req.getParameter(String)
 *      2.获取所有参数--->req.getParameterNames()
 *      3.获取所有参数对象--->req.getParameterMap()返回一个Map<String,String[]>对象，K-V[]
 *      4.获取一个参数（这个参数对应多个值）--->req.getParameterValues(String)
 *          注意：方式4使用时要先判断在使用，防止nullPointException
 */

public class GetData extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //get方式获取参数
        System.out.println(req.getQueryString());

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //post方式获取参数
        //使用流来获得

        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        resp.getWriter().write("post的提交方式");

        //1.得到流(二进制流)
        InputStream in = req.getInputStream();

        //定义一个字节数组
        byte[] bys = new byte[1024];
        int len = 0;
        while((len=in.read(bys)) != -1){
            System.out.println(new String(bys,0,len));
        }
        in.close();
    }
}
