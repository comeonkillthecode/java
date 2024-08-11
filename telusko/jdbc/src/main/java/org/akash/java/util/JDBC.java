package org.akash.java.util;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class JDBC {
    Connection connection;
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/jdbc_learning";
        String user = "root";
        String password  = "root";
        return DriverManager.getConnection(url,user,password);
    }
    public static void closeConnection(Connection connection, Statement statement) throws SQLException {
        statement.close();
        connection.close();
    }
}
