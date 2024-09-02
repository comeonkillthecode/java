package org.akash.java;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Control in first service");

        String name = req.getParameter("uname");
        String city = req.getParameter("ucity");

        HttpSession session = req.getSession();
        session.setAttribute("name", name);
        session.setAttribute("city", city);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/SecondServlet");

//        requestDispatcher.forward(req, resp);
        requestDispatcher.include(req, resp);

        PrintWriter printWriter = resp.getWriter();
        printWriter.println("<h1>Response from Servlet one<h1>");
        printWriter.close();

        System.out.println("Control in again first service");

    }
}
