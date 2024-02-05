package DATABASE;

import java.sql.*;

public class DatabaseHandler {
    public static Connection getConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/acornmain","root","");
            return con;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            System.err.println("Connection error");
            return null;
        }
    }

    public static void closeConnection(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                System.err.println("Error closing connection");
            }
        }
    }
}