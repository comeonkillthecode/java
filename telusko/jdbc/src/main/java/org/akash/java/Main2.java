package org.akash.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main2 {
    public static void main(String[] args) throws  SQLException {
        String url = "jdbc:mysql://localhost:3306/jdbc_learning";
        String user = "root";
        String password  = "root";
        Connection connection = null;
        Statement statement = null;
        try {
            connection = DriverManager.getConnection(url,user,password);
            System.out.println(connection.getClientInfo());

            statement = connection.createStatement();

            String updateQuery = "UPDATE studentInfo set sage=40 where id=2";

            int noOfRowsEffect = statement.executeUpdate(updateQuery);
            if(noOfRowsEffect == 0){
                System.out.println("Something is wrong");
            }else {
                System.out.println("No of Rows effected: "+ noOfRowsEffect);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());

        }finally {
            assert statement != null;
            statement.close();
            connection.close();
        }


    }
}