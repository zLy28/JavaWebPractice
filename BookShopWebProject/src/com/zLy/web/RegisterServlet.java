package com.zLy.web;

import com.zLy.pojo.User;
import com.zLy.service.UserService;
import com.zLy.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegisterServlet extends HttpServlet {
    private UserService userService = new UserServiceImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        String code = req.getParameter("code");

        if ("qwer".equals(code)) {
            if (userService.CheckUserExistence(username)) {
                System.out.println("The username has already exists.");
                req.getRequestDispatcher("/pages/user/regist.html").forward(req,resp);
            } else {
                userService.registerUser(new User(username,password,email));
                req.getRequestDispatcher("/pages/user/regist_success.html").forward(req,resp);

            }
        } else {
            System.out.println("the check code entered is not correct");
            req.getRequestDispatcher("/pages/user/regist.html").forward(req,resp);
        }
    }
}
