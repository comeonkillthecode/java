package org.akash.java;

import java.sql.*;

public class Main4 {
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
            String deleteQuery = "DELETE from studentInfo where id=2";

            int noOfRowsEffect = statement.executeUpdate(deleteQuery);
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