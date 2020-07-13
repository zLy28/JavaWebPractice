package com.zly.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServletResponse extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.setCharacterEncoding("UTF-8");
//        resp.setHeader("Content-Type","text/html; charset=UTF-8");

//        resp.setContentType("text/html; charset=UTF-8"); //use it before getting a steam
//        PrintWriter writer = resp.getWriter();
//        writer.write("你好吗");

//        resp.setStatus(302);
//        resp.setHeader("Location","http://localhost:8080/ServletTest_1/helloHttp");

        resp.sendRedirect("http://localhost:8080/ServletTest_1/helloHttp");
    }
}
