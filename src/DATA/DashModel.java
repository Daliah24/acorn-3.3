package DATA;

import DATABASE.DatabaseHandler;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DashModel {
    private final Connection connection;
   public DashModel(Connection connection) {
        this.connection = connection;
    }
   public  boolean deleteAccount(String user) {
     String query = "DELETE FROM acornaccounts WHERE user = ?";
    try (Connection connection = DatabaseHandler.getConnection();
         PreparedStatement preparedStatement = connection.prepareStatement(query)) {

        preparedStatement.setString(1, user);

        // Execute the delete statement
        int rowsAffected = preparedStatement.executeUpdate();

        // Commit the transaction
       

        // Check if any rows were affected
        return rowsAffected > 0;

    } catch (SQLException e) {
        // Log the exception
        e.printStackTrace();
        // Handle or rethrow the exception based on your application's requirements
    }
    return false;
    }
   public void saveProduct(double quantitys, String products, double prices, String categorys) {
    try (Connection connection = DatabaseHandler.getConnection()) {
        String query = "INSERT INTO acornproducts (quantity, product, price, category) VALUES (?, ?, ?, ?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setDouble(1, quantitys);
            preparedStatement.setString(2, products);
            preparedStatement.setDouble(3, prices);
            preparedStatement.setString(4, categorys);


            preparedStatement.executeUpdate();
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
}

    }



