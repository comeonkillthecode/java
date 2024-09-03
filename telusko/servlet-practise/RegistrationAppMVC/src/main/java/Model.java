import util.JDBCDriver;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Model {
    private String name;
    private String city;
    private String email;
    private String password;
    private Connection connection;
    private PreparedStatement ps;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int register() throws SQLException {
        connection = JDBCDriver.getConnection();
        String sql = "INSERT into personalinfoservlet(uname, email, password, city) values(?,?,?,?)";
        ps = connection.prepareStatement(sql);
        ps.setString(1, name);
        ps.setString(2, email);
        ps.setString(3, password);
        ps.setString(4, city);

        int rowsEffected = ps.executeUpdate();

        JDBCDriver.closeConnection(connection, ps);

        return rowsEffected;
    }
}
