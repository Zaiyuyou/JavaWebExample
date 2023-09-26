package com.example;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StartDispatch extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //设置连接样式和字符编码格式
        response.setContentType("text/html;charset=utf-8");

        //随便新建一个屏幕打印器并打印一些字符
        PrintWriter out = response.getWriter();
        out.print("Hello,Dispatch Get 1 <br>");

        //获取请求中的对象并在屏幕中打印
        out.print("明文: ");
        out.print(request.getParameter("usertext"));
        out.print("<br>");

        //通过request类方法新建请求转发器并转发请求
        RequestDispatcher rd = request.getRequestDispatcher("s2");
        rd.include(request, response);

        //通过ServletContext类方法新建请求转发器并转发请求
        RequestDispatcher sc = getServletContext().getRequestDispatcher("/s2");
        sc.include(request, response);



    }
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //设置连接样式和字符编码格式
        response.setContentType("text/html;charset=utf-8");

        //随便新建一个屏幕打印器并打印一些字符
        PrintWriter out = response.getWriter();
        out.print("Hello,Dispatch Post 1 <br>");

        //获取请求中的对象并在屏幕中打印
        out.print("密文: ");
        out.print(request.getParameter("usertext"));
        out.print("<br>");

        //通过request类方法新建请求转发器并转发请求
        RequestDispatcher rd = request.getRequestDispatcher("s2");
        rd.include(request, response);

        //通过ServletContext类方法新建请求转发器并转发请求
        RequestDispatcher sc = getServletContext().getRequestDispatcher("/s2");
        sc.include(request, response);
    }
}