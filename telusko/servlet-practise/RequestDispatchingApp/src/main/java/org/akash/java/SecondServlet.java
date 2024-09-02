package org.akash.java;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Control in second service");

        HttpSession session = req.getSession(false);

        String name = (String) session.getAttribute("name");
        String city = (String) session.getAttribute("city");

        PrintWriter printWriter = resp.getWriter();
        printWriter.println("<h1>Response from Servlet two<h1>"+"<h2>"+name+ city +"</h2>");
        printWriter.close();
    }
}
