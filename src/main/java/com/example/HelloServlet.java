package com.example;
import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;
public class HelloServlet implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws
            ServletException {
    }
    @Override
    public ServletConfig getServletConfig() {
        return null;
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse
            servletResponse) throws ServletException, IOException {
        System.out.println("Hello Servlet!!");
        PrintWriter out = servletResponse.getWriter();
        out.print("Hello Servlet!\nPlease check Your server log");
    }
    @Override
    public String getServletInfo() {
        return null;
    }
    @Override
    public void destroy() {
    }
}