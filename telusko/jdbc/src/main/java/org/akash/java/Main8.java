package org.akash.java;

import org.akash.java.util.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) throws  SQLException {
        Connection connection = null;
        Scanner sc = new Scanner(System.in);
        PreparedStatement preparedStatement = null;
        try {
            connection = JDBC.getConnection();
            String updateQuery = "UPDATE studentInfo set sage=? where id=?";

            preparedStatement = connection.prepareStatement(updateQuery);

            int id  = sc.nextInt();
            int age  = sc.nextInt();

            preparedStatement.setInt(2, id);
            preparedStatement.setInt(1, age);



            boolean status = preparedStatement.execute();

            if(status){
                ResultSet set = preparedStatement.getResultSet();
                while (set.next()){
                    id = set.getInt(1);
                    age = set.getInt(3);

                    System.out.println(id+ " "+ age);
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