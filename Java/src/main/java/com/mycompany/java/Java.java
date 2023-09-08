package java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Java {

    public static Connection getConnection() {
        Connection connection = null;

        try {
            // Load the Oracle JDBC driver
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // Replace 'your_db_url', 'your_username', and 'your_password' with your actual database credentials and URL
            String dbUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
            String username = "system";
            String password = "1234";

            // Establish the connection
            connection = DriverManager.getConnection(dbUrl, username, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Connection connection = Java.getConnection();

        if (connection != null) {
            System.out.println("Connection to Oracle database established.");
            try {
                connection.close(); // Close the connection
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            System.err.println("Failed to connect to Oracle database.");
        }
    }
}
