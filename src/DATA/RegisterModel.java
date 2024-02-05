package DATA;

import DATABASE.DatabaseHandler;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class RegisterModel {

    public RegisterModel(Connection connection) {
    }
    public void registerUser(String fname, String lname, int age, String gender,String address, String user, String pass , String securityAnswer1 , String securityAnswer2) throws SQLException {
    String query = "INSERT INTO acornaccounts (fname, lname, age, gender, address, user, pass, securityAnswer1, securityAnswer2) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

    try (Connection connection = DatabaseHandler.getConnection();
         PreparedStatement preparedStatement = connection.prepareStatement(query)) {

        preparedStatement.setString(1, fname);
        preparedStatement.setString(2, lname);
        preparedStatement.setInt(3, age);
        preparedStatement.setString(4, gender);
        preparedStatement.setString(5, address);
        preparedStatement.setString(6, user);
        preparedStatement.setString(7, pass);
        preparedStatement.setString(8, securityAnswer1);
        preparedStatement.setString(9, securityAnswer2);
        preparedStatement.executeUpdate();
    }
    }
    
    public boolean doesUsernameExist(String user) {
        String query = "SELECT * FROM acornaccounts WHERE user = ?";
        try (Connection connection = DatabaseHandler.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, user);
            ResultSet resultSet = preparedStatement.executeQuery();

            return resultSet.next(); // If there are results, username exists

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false; // Default to false in case of an exception
    }
    
}
