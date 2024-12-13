package employee.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class conn {
    Connection connection;
    Statement statement;

    public conn() {
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection with the new 'appuser' and the specified password
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeemanagement", "newusername", "newpassword");

            // Create a statement for executing queries
            statement = connection.createStatement();
            System.out.println("Database connected successfully");

        } catch (Exception e) {
            // Print stack trace for debugging if connection fails
            e.printStackTrace();
        }
    }
}
