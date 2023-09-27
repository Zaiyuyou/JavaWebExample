package com.example;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class OutJpg extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //设置连接样式
        response.setContentType("image/jpeg");

        //创建用于输出流的参数
        byte[] bs = new byte[1024];

        //新建一个OutputStream
        ServletOutputStream out = response.getOutputStream();

        //使用servletContext.getRealPath()获取路径中的文件
        ServletContext servletContext = getServletContext();
        String path = servletContext.getRealPath("/resource/image/orange1.jpg");
        System.out.print("actual path:" + path);
        FileInputStream fls = new FileInputStream(path);


        while ((fls.read(bs)) != 0 ){
            out.write((fls.read(bs)));
        }

    }
}
