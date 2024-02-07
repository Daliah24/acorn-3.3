
package DATABASE;

import java.sql.Connection;
import java.sql.PreparedStatement;

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
}
 