
package DATABASE;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginModel {
    private Connection connection;
    
    public LoginModel(Connection connection) {
        this.connection = connection;
    }
    
    public void loginUser(String user, String pass) {
        String sql = "SELECT * FROM acornaccounts WHERE user=? and pass=?";
        
        try (PreparedStatement  ps = connection.prepareStatement(sql)) {
            ps.setString(1, user);
            ps.setString(2, pass);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
 public boolean checkSecurityAnswers(String user, String securityAnswer1, String securityAnswer2) {
        // SQL query to check security answers
        String sql = "SELECT * FROM acornaccounts WHERE user = ? AND securityAnswer1 = ? AND securityAnswer2 = ?";
        
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, user);
            statement.setString(2, securityAnswer1);
            statement.setString(3, securityAnswer2);
            
            ResultSet resultSet = statement.executeQuery();
            
            // If resultSet.next() returns true, it means a row with matching username and security answers exists
            return resultSet.next();
            
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle the exception appropriately
            return false;
        }
    }
}
 