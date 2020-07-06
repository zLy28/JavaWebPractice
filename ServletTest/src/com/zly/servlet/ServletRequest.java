package com.zly.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServletRequest extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("URI: "+req.getRequestURI());
        System.out.println("URL: "+req.getRequestURL());
//        When the address is localhost. Get 127.0.0.1
        System.out.println("Client IP Adress: "+req.getRemoteHost());
        System.out.println("Header: "+req.getHeader("Accept"));
        System.out.println("Type of request: "+ req.getMethod());
    }
}
