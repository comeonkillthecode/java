package org.akash.java;

import org.akash.java.util.JDBC;

import java.sql.*;
import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) throws  SQLException {
        Connection connection = null;
        Scanner sc = new Scanner(System.in);
        PreparedStatement preparedStatement = null;
        try {
            connection = JDBC.getConnection();
            String insertQuery = "INSERT into studentInfo (id, sname, sage, scity) values(?,?,?,?)";

            preparedStatement = connection.prepareStatement(insertQuery);

            int id  = sc.nextInt();
            String name  = sc.next();
            int age  = sc.nextInt();
            String city  = sc.next();

            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, name);
            preparedStatement.setInt(3, age);
            preparedStatement.setString(4, city);



            boolean status = preparedStatement.execute();

            if(status){
                ResultSet set = preparedStatement.getResultSet();
                while (set.next()){
                    id = set.getInt(1);
                    name = set.getString(2);
                    age = set.getInt(3);

                    System.out.println(name + " "+ id+ " "+ age);
                } 
            } else {
                int rows = preparedStatement.getUpdateCount();
                if(rows<=0)System. out. println("Operation failed! " ) ;
                else System.out.println("Operation successful!" ) ;
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            assert preparedStatement != null;
            JDBC.closeConnection(connection, preparedStatement);
        }


    }
}