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


        PrintWriter pr = response.getWriter();
        pr.println("<html> <head> <title> Second App</title></head>");
        pr.println("<body> <hl><marquee> Welcome to our dynamic app </marquee></hl>");
        pr.println( "<table>" ) ;
        pr.println("<tr> <th>NAME</th> <th>CITY</th> </tr>");
        pr.println("<tr> <th>"+name+"</th> <th>"+city +"</th> </tr>");
        pr.println("</table></body>");
        pr.println("</html>");
        pr.close();
    }
}
