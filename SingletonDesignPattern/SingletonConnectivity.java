package SingletonDesignPattern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class SingletonConnectivity {
    private static final String URL =  "jdbc:mysql://localhost:3306/db_patrick_maina_167052";
    private static final String USER = "root";
    private static final String PASSWORD ="Patrickmaina05$";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            if (connection != null) {
                System.out.println("Database connected successfully!");
            } else {
                System.out.println("Failed to connect to the database.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


