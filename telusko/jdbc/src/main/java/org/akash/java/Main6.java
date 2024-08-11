package org.akash.java;

import org.akash.java.util.JDBC;

import java.sql.*;

public class Main6 {
    public static void main(String[] args) throws  SQLException {
        Connection connection = null;
        Statement statement = null;
        try {
            connection = JDBC.getConnection();

            statement = connection.createStatement();
            String insertQuery = "INSERT into studentInfo (id, sname, sage, scity) values(2, 'Anil', 23, 'Hyderabad')";
            String fetchQuery = "SELECT * from studentInfo";
            String deleteQuery = "DELETE from studentInfo where id=2";

            boolean status = statement.execute(deleteQuery);

            if(status){
                ResultSet set = statement.getResultSet();
                while (set.next()){
                    int id = set.getInt(1);
                    String name = set.getString(2);
                    int age = set.getInt(3);

                    System.out.println(name + " "+ id+ " "+ age);
                }
            } else {
                int rows = statement.getUpdateCount();
                if(rows<=0)System. out. println("Operation failed! " ) ;
                else System.out.println("Operation successful!" ) ;
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            assert statement != null;
            JDBC.closeConnection(connection, statement);
        }


    }
}