package Dashboard_UI;

import DATABASE.DatabaseHandler;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DashModel {
    // Other model-related methods...

    public static String fetchDataFromDatabase() {
        String query = "SELECT data_column FROM your_table";
        try (Connection connection = DatabaseHandler.connect();
             PreparedStatement preparedStatement = connection.prepareStatement(query);
             ResultSet resultSet = preparedStatement.executeQuery()) {
            if (resultSet.next()) {
                return resultSet.getString("data_column");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
