package com.example;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Servlet2 extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //设置连接样式和字符编码格式
        response.setContentType("text/html;charset=utf-8");

        //随便新建一个屏幕打印器并打印一些字符
        PrintWriter out = response.getWriter();
        out.print("Hello,Http Get 2 <br>");

        //获取请求中的对象并在屏幕中打印
        out.print("明文: ");
        out.print(request.getParameter("usertext"));
        out.print("<br>");
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //设置连接样式和字符编码格式
        response.setContentType("text/html;charset=utf-8");

        //随便新建一个屏幕打印器并打印一些字符
        PrintWriter out = response.getWriter();
        out.print("Hello,Http Post 2 <br>");

        //获取请求中的对象并在屏幕中打印
        out.print("密文: ");
        out.print(request.getParameter("usertext"));
        out.print("<br>");
    }
}