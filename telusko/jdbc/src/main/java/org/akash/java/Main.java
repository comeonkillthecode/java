package org.akash.java;
import java.sql.*;

public class Main {
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
//            String insertQuery = "INSERT into studentInfo (id, sname, sage, scity) values(1, 'Akash', 25, 'Karimnagar')";
            String insertQuery = "INSERT into studentInfo (id, sname, sage, scity) values(2, 'Anil', 23, 'Hyderabad')";

            int noOfRowsEffect = statement.executeUpdate(insertQuery);
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