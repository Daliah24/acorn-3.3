package Login_UI;

import DATABASE.DatabaseHandler;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginModel {
    private String enteredUsername;
    private String enteredPassword;
    private boolean REMEMBER;

    public void setEnteredUsername(String enteredUsername) {
        this.enteredUsername = enteredUsername;
    }

    public void setEnteredPassword(String enteredPassword) {
        this.enteredPassword = enteredPassword;
    }


    public boolean authenticateUser() {
        try (Connection connection = DatabaseHandler.connect()) {
            String query = "SELECT * FROM acornaccounts WHERE user = ? AND pass = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setString(1, enteredUsername);
                preparedStatement.setString(2, enteredPassword);

                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    return resultSet.next();
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

     void saveRememberedCredentials(String username, String password, boolean remember) {
        DatabaseHandler.closeConnection(null);

        System.out.println("Remember Me: " + REMEMBER);
        if (REMEMBER) {
            System.out.println("Saved credentials: " + enteredUsername + ", " + enteredPassword);
        }
    }

public boolean validateUserCredentials(String username, String password) {
    // Implement logic to validate the user's credentials in the database
    // You may use methods from the DatabaseHandler or another data access class
    // Return true if credentials are valid, otherwise return false
    return DatabaseHandler.validateUserCredentials(username, password);
}
}


    
