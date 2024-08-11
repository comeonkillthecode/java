package org.akash.java;

import org.akash.java.util.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) throws  SQLException {
        Connection connection = null;
        Scanner sc = new Scanner(System.in);
        PreparedStatement preparedStatement = null;
        try {
            connection = JDBC.getConnection();
            String updateQuery = "UPDATE studentInfo set sage=? where id=?";

            preparedStatement = connection.prepareStatement(updateQuery);


            preparedStatement.setInt(2, 1);
            preparedStatement.setInt(1, 28);
            preparedStatement.addBatch();

            preparedStatement.setInt(2, 2);
            preparedStatement.setInt(1, 24);
            preparedStatement.addBatch();

             preparedStatement.execute();

            int rows = preparedStatement.executeUpdate();
            if(rows<=0)System. out. println("Operation failed! " ) ;
            else System.out.println("Operation successful!" ) ;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            assert preparedStatement != null;
            JDBC.closeConnection(connection, preparedStatement);
        }


    }
}