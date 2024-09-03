package util;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCDriver {

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("hey");
            System.out.println(e.getMessage());
        }
        System.out.println("Driver is registered");
    }
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/telusko_db";
        String user = "root";
        String password  = "root";
        return DriverManager.getConnection(url,user,password);
    }
    public static void closeConnection(Connection connection, PreparedStatement statement) throws SQLException {
        statement.close();
        connection.close();
    }
}
