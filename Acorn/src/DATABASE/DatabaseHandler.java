package DATABASE;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.util.HashMap;
import java.util.Map;

public class DatabaseHandler {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/acornmain";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "";
    private static final Map<String, String> userToPasswordMap = new HashMap<>();

    public static Connection connect() throws SQLException {
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
    }

    public static void closeConnection(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static boolean authenticateUser(String username, String password) {
    String query = "SELECT * FROM acornaccounts WHERE user = ? AND pass = ?";
    try (Connection connection = connect();
         PreparedStatement preparedStatement = connection.prepareStatement(query)) {

        // Set parameters in the PreparedStatement
        preparedStatement.setString(1, username);
        preparedStatement.setString(2, password);

        try (ResultSet resultSet = preparedStatement.executeQuery()) {
            // If there is a matching user, authentication is successful
            return resultSet.next();
        }

    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
}


    public static String getUserPassword(String username) {
         return userToPasswordMap.get(username);
    }

    public static boolean validateUserCredentials(String username, String password) {
        String storedPassword = userToPasswordMap.get(username);
        return storedPassword != null && storedPassword.equals(password);
    }

    public String recoverPassword(String username) {
        // TODO: Implement logic to recover the password
        // For example, you might interact with a database to verify the username
        // and retrieve the associated password.

        // Placeholder logic
        String userPassword = DatabaseHandler.getUserPassword(username);
        return userPassword;
    }
}
