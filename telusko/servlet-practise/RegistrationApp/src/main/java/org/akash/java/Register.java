package org.akash.java;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;



@WebServlet("/Register")
public class Register extends HttpServlet {
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Control in first service");

        String name = req.getParameter("uname");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String city = req.getParameter("city");

        System.out.println(name+" "+email+" "+password+" "+city);

        String url = "jdbc:mysql://localhost:3306/telusko_db";

        String user = "root";
        String passwordSql  = "root";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            Class .forName( "com.mysql.cj.jdbc.Driver" ) ;
            connection = DriverManager.getConnection(url,user,passwordSql);

            preparedStatement = connection.prepareStatement("INSERT into personalinfoservlet  (uname, email, password, city) values(?,?,?,?)");
            System.out.println("Hey");

            preparedStatement.setString(1, name);
            preparedStatement.setString(2, email);
            preparedStatement.setString(3, password);
            preparedStatement.setString(4, city);

            int noOfRowsEffect = preparedStatement.executeUpdate();
            if(noOfRowsEffect == 0){
                System.out.println("Something is wrong");
            }else {
                System.out.println("No of Rows effected: "+ noOfRowsEffect);
            }
            preparedStatement.close();
            connection.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

}
