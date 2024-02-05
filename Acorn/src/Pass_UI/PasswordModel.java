package Pass_UI;

import DATABASE.DatabaseHandler;

public class PasswordModel {
    public String recoverPassword(String username) {
    // Implement logic to recover the user's password from the database
    // You may use methods from the DatabaseHandler or another data access class
    return DatabaseHandler.getUserPassword(username);
    }
    public boolean validateUserCredentials(String username, String password) {
    // Implement logic to validate the user's credentials in the database
    // You may use methods from the DatabaseHandler or another data access class
    // Return true if credentials are valid, otherwise return false
    return DatabaseHandler.validateUserCredentials(username, password);
}

}


    
