package DATA;
import ACORN_SYSTEM.PasswordView;
import DATABASE.PasswordModel;
import DATABASE.DatabaseHandler;

public class PasswordController {

    private PasswordView view;
    private PasswordModel model;
  
   public PasswordController() {
        this.model = new PasswordModel(DatabaseHandler.getConnection());
    }

    // Other methods...

    public void updatePassword(String username, String newPassword) {
        model.updatePassword(username, newPassword);
    }


}
