package org.akash.java.telusko;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/firstServlet")
public class FirstServlet extends HttpServlet {
    public FirstServlet() {
        System.out.println("Servlet Object created by container.");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("uname");
        String city = request.getParameter("ucity");


        response.sendRedirect("registerSuccess.jsp");
    }
}
