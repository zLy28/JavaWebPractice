package com.zly.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServletContext extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        javax.servlet.ServletContext servletContext = getServletConfig().getServletContext();
        //ServletContext can get init parameters
        String initParameter = servletContext.getInitParameter("");
//        Can get context path
        String contextPath = servletContext.getContextPath();
//        can get the real path in computer
        String realPath = servletContext.getRealPath("/");
//        use servletContext to store data
        servletContext.setAttribute("key","value");
    }
}
