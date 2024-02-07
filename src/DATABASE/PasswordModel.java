package DATABASE;

import DATABASE.DatabaseHandler;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class PasswordModel {

    private Connection connection;
    // Modify the constructor to accept a DatabaseHandler argument
    public PasswordModel(DatabaseHandler databaseHandler) {
    }

    // Add a no-argument constructor if needed
    public PasswordModel(Connection connection) {
      this.connection = connection;
    }

  

public void updatePassword(String username, String newPassword) {
    String query = "UPDATE acornaccounts SET pass = ? WHERE user = ?";
    
    try (Connection connection = DatabaseHandler.getConnection();
         PreparedStatement preparedStatement = connection.prepareStatement(query)) {

        preparedStatement.setString(1, newPassword);
        preparedStatement.setString(2, username);

        int rowsUpdated = preparedStatement.executeUpdate();
        if (rowsUpdated > 0) {
            System.out.println("Password updated successfully");
        } else {
            System.out.println("Password update failed");
            // Handle the case where the update failed
        }

    } catch (SQLException e) {
        e.printStackTrace();
        // Handle the exception based on your application's requirements
    }
}

public void deleteAccount(String username) {
    String query = "DELETE FROM acornaccounts WHERE user = ?";
    try (Connection connection = DatabaseHandler.getConnection();
         PreparedStatement preparedStatement = connection.prepareStatement(query)) {

        preparedStatement.setString(1, username);

        int rowsDeleted = preparedStatement.executeUpdate();
        if (rowsDeleted > 0) {
            System.out.println("Account deleted successfully");
        } else {
            System.out.println("Account deletion failed");
            // Handle the case where the deletion failed
        }

    } catch (SQLException e) {
        e.printStackTrace();
        // Handle the exception based on your application's requirements
    }
}


}
    


    
