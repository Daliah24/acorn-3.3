package DATA;

import DATABASE.LoginModel;
import DATABASE.DatabaseHandler;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginController {
    private LoginModel model;
    
    public LoginController() {
        this.model = new LoginModel(DatabaseHandler.getConnection());
    }
    public boolean doesAccountExist(String user, String pass) {
        String query = "SELECT * FROM acornaccounts WHERE user = ? AND pass = ?";
        
        try (Connection connection = DatabaseHandler.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, user);
            preparedStatement.setString(2, pass);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                return resultSet.next(); // Returns true if there is at least one matching row
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return false; // Handle the exception based on your application's requirements
        }
    }
    public void loginUser(String user, String pass) {
        try {
            model.loginUser(user, pass);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
   public boolean checkSecurityAnswers(String user,String securityAnswer1, String securityAnswer2){
       try {
           model.checkSecurityAnswers(user,securityAnswer1, securityAnswer2);
           
       }catch (Exception e) {
           e.printStackTrace();;
       }
        return false;
   }
}
    