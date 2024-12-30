import java.sql.*;

public class MySql_Connection {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306";
        String username = "root";
        String password = "Yaswanth";

        System.out.println("Connecting to database...");

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Database connected!");
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect to the database!", e);
        }
    }
}