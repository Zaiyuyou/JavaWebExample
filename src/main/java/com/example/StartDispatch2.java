package com.example;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class StartDispatch2 extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //HTML只给了post请求，doGet留空
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //设置连接样式和字符编码格式，只负责传递request和response,但是不负责响应，因此可以不设置编码格式
//        response.setContentType("text/html;charset=UTF-8");
//        request.setCharacterEncoding("UTF-8");

        //随便新建一个屏幕打印器并打印一些字符
        PrintWriter out = response.getWriter();
        out.print("Hello,Dispatching Post 2 <br>");


        //通过request类方法新建请求转发器并转发请求
        //从request中得到的RequestDispatcher对象是由服务器解析的，因此使用的是相对与本java的路径，不需要加"/"
        RequestDispatcher rd = request.getRequestDispatcher("s2");
        rd.include(request, response);

        //通过ServletContext类方法新建请求转发器并转发请求
        //从getServletContext中得到的RequestDispatcher对象是由浏览器解析的，因此使用的是相对与根目录的路径，必须要加"/"
//        RequestDispatcher sc = getServletContext().getRequestDispatcher("/s2");
//        sc.include(request, response);
    }
}