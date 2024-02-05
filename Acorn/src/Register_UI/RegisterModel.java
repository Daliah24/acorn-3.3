package Register_UI;

import DATABASE.DatabaseHandler;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterModel {
    public boolean registerUser(UserRegistrationData user) {
        try {
            Connection connection = DatabaseHandler.connect();
            String query = "INSERT INTO acornaccounts (fname, lname, age, gender, address, user, pass) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, user.getFname());
            preparedStatement.setString(2, user.getLname());
            preparedStatement.setInt(3, user.getAge());
            preparedStatement.setString(4, user.getGender());
            preparedStatement.setString(5, user.getAddress());
            preparedStatement.setString(6, user.getUsername());
            preparedStatement.setString(7, user.getPassword());

            int rowsAffected = preparedStatement.executeUpdate();
            DatabaseHandler.closeConnection(connection);

            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

public boolean validateUserCredentials(String username, String password) {
    // Implement logic to validate the user's credentials in the database
    // You may use methods from the DatabaseHandler or another data access class
    // Return true if credentials are valid, otherwise return false
    return DatabaseHandler.validateUserCredentials(username, password);
}
}
