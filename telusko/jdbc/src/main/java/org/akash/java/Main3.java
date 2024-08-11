package org.akash.java;

import java.sql.*;

public class Main3 {
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
            String fetchQuery = "SELECT * from studentInfo";

            ResultSet set = statement.executeQuery(fetchQuery);
            while (set.next()){
                int id = set.getInt(1);
                String name = set.getString(2);
                int age = set.getInt(3);

                System.out.println(name + " "+ id+ " "+ age);
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