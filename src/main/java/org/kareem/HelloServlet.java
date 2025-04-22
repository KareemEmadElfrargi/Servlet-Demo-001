package org.kareem;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;


public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("In service ");
        String userName =  request.getParameter("userName");
        if (userName == null || userName.trim().isEmpty()){
            userName = "Guest";
        }


        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Hello "+userName+" !</h1>");

    }
}
