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
        //HTML只给了post请求，doGet留空
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //设置连接样式和字符编码格式
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");

        //随便新建一个屏幕打印器并打印一些字符
        PrintWriter out = response.getWriter();
        out.print("Hello,Http Post 2 <br>");

        //获取请求中的对象并在屏幕中打印
        out.print("<br>");
        out.print("姓名: ");
        out.print(request.getParameter("name"));

        out.print("<br>");
        out.print("密码: ");
        out.print(request.getParameter("pwd"));

        out.print("<br>");
        out.print("电子邮件: ");
        out.print(request.getParameter("email"));

        out.print("<br>");
        out.print("出生日期: ");
        out.print(request.getParameter("birthday"));

        out.print("<br>");
        out.print("性别: ");
        out.print(request.getParameter("sex"));

        out.print("<br>");
        out.print("所在城市: ");
        out.print(request.getParameter("city"));

        out.print("<br>");
        out.print("喜欢的颜色: ");
        out.print(request.getParameter("color"));

        out.print("<br>");
        out.print("头像: ");
        out.print(request.getParameter("file"));


    }
}