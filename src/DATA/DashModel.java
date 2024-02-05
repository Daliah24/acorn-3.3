package DATA;

import DATABASE.DatabaseHandler;
import static DATABASE.DatabaseHandler.getConnection;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

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
public void deleteProduct(int productId) {
        // SQL query to delete a product by ID
        String deleteQuery = "DELETE FROM acornproducts WHERE product = ?";

        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery)) {

            // Set the product ID in the prepared statement
            preparedStatement.setInt(1, productId);

            // Execute the DELETE query
            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Product deleted successfully.");
            } else {
                System.out.println("Product not found or not deleted.");
            }

        } catch (SQLException e) {
            // Handle SQL exceptions (e.g., log, show an error message)
            e.printStackTrace();
        }
    }
    public void fetchDataFromDatabase(DefaultTableModel table2) {
    try {
        // Replace the following lines with your actual database connection code
        Connection connection = DatabaseHandler.getConnection();
        String query = "SELECT quantity, product, price, date, category FROM acornproducts"; // Replace with your table name
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        ResultSet resultSet = preparedStatement.executeQuery();

        // Populate the table with the retrieved data
        while (resultSet.next()) {
            // Assuming you have columns named "quantity", "product", "price", "date", "category", adjust accordingly
            Object column1Value = resultSet.getObject("quantity");
            Object column2Value = resultSet.getObject("product");
            Object column3Value = resultSet.getObject("price");
            Object column4Value = resultSet.getObject("date");
            Object column5Value = resultSet.getObject("category");
            // Add a new row to the table model
            table2.addRow(new Object[]{column1Value, column2Value, column3Value, column4Value, column5Value});
        }

        // Close resources
        resultSet.close();
        preparedStatement.close();
        connection.close();
    } catch (SQLException exception) {
        exception.printStackTrace(); // Handle the exception according to your needs
    }
}
 public void deleteAllRecords() throws SQLException {
        try (Connection connection = DatabaseHandler.getConnection()) {
            String sql = "DELETE FROM acornproducts";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.executeUpdate();
            }
        }
    }
}





