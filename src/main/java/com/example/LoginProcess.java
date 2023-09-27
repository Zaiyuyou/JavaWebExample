package com.example;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.NavigableMap;

public class LoginProcess extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //HTML只给了post请求，doGet留空
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String adminName = "zzb";
        String adminPwd = "1234567";

        //设置连接样式和字符编码格式
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");

        //随便新建一个屏幕打印器并打印一些字符
        PrintWriter out = response.getWriter();
        out.print("<br>Processing Your Login Request ...");

        //获取请求中的对象并在屏幕中打印
        String loginName = request.getParameter("name");
        String loginPwd = request.getParameter("pwd");



        if (loginName.equals(adminName)) {
            if (loginPwd.equals(adminPwd)){
                RequestDispatcher success = request.getRequestDispatcher("main.html");
                success.include(request, response);
            }
            else{
                out.print("<br>Password is Wrong!");
            }
        }
        else{
            out.print("<br>The user" + loginName + "dosen't exist!");
        }


    }
}