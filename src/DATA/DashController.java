package DATA;

import ACORN_SYSTEM.DashView;
import ACORN_SYSTEM.RegisterView;
import DATABASE.DatabaseHandler;

public class DashController {
    private final DashModel model;
    private final DashView view = null;
    
    private String user;

    public DashController() {
        
        this.model = new DashModel(DatabaseHandler.getConnection());
    }

    // Other methods in DashController...

    public void deleteAccount() {
        // Add logic to delete the account from the database
        // For example, you can call a method from the model to perform the deletion
        model.deleteAccount(user);
    }
    public void logout() {
    // Log out the user
    // ...
}

public void setUsername(String username) {
    this.user = username;
}

public String getUsername() {
    return user;
}
}
