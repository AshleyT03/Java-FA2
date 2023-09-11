package taskmanager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TaskManager {
    public static Connection getConnection() {
        Connection connection = null;

        try {
            // Load the SQLite JDBC driver
            Class.forName("org.sqlite.JDBC");

            // Specify the correct path to your SQLite database file
            String url = "jdbc:sqlite:C:/Users/ic westgate/Documents/SQL Lite Programmes/Task Manager.db";

            // Establish the connection
            connection = DriverManager.getConnection(url);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }

    public static void main(String[] args) {
        Connection connection = getConnection();

        if (connection != null) {
            System.out.println("Connection to SQLite database established.");
            try {
                connection.close(); // Close the connection
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            System.err.println("Failed to connect to SQLite database.");
        }
    }
}
