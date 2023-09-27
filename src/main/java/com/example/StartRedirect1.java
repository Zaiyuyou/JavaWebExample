package com.example;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StartRedirect1 extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //设置连接样式和字符编码格式
        response.setContentType("text/html;charset=utf-8");


        System.out.print("Hello,Redirect Get Starting! <br>");

        //累了，睡一会……
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //重定向get请求
        response.sendRedirect("FinishRedirect1");



    }
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //设置连接样式和字符编码格式
        response.setContentType("text/html;charset=utf-8");


        System.out.print("Hello,Redirect Post Starting! <br>");

        //累了，睡一会……
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //重定向Post请求
        response.sendRedirect("FinishRedirect1");

    }
}