package com.example.action;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginProcessAction extends HttpServlet {

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
        out.print("Processing Your Login Request ...<br>");

        //获取请求中的对象并在屏幕中打印
        String loginName = request.getParameter("loginName");
        String loginPwd = request.getParameter("loginPwd");

        if (loginName.isEmpty()) {
            response.sendRedirect("main.html?loginName");
//            request.getRequestDispatcher("main.html").include(request, response);
            out.print("Login As a Visitor<br>");
            return;
        }

        if (loginName.equals(adminName)) {
            if (loginPwd.equals(adminPwd)){

                response.sendRedirect("main.html");
//                request.getRequestDispatcher("main.html").include(request, response);
                out.print("Login As a User!<br>");
                out.print("Username:" + loginName);
            }
            else{
                out.print("Password is Wrong!<br>");
            }
        }
        else{
            out.print("The user " + loginName + " doesn't exist!<br>");
        }


//        response



    }
}