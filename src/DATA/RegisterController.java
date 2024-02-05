package DATA;

import DATABASE.DatabaseHandler;
import java.sql.SQLException;

public class RegisterController {
    private RegisterModel model;

    public RegisterController(DatabaseHandler databaseHandler) {
        this.model = new RegisterModel(databaseHandler.getConnection());
    }

    public void registerUser(String fname, String lname, int age, String gender, String address, String user, String pass) {
        try {
            model.registerUser(fname, lname, age, gender, address, user, pass);
        } catch (SQLException e) {
            // Handle database-related errors
            e.printStackTrace();
        } catch (Exception e) {
            // Handle other exceptions
            e.printStackTrace();
        }
    }
    
    public boolean doesUsernameExist(String user) {
        return model.doesUsernameExist(user);
    }
    
}
