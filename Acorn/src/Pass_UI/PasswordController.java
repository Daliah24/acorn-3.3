package Pass_UI;

import java.awt.event.ActionEvent;

public class PasswordController {

    private PasswordView view;
    private PasswordModel model;

    public PasswordController(PasswordView view) {
        this.view = view;
        this.model = new PasswordModel();
        // Attach action listeners or other setup as needed
    }
   public void showpassActionPerformed(ActionEvent e) {
    // Implement show password logic here
    boolean showPassword = view.getShowPassCheckBox().isSelected();

    System.out.println("Show Password Checkbox State: " + showPassword);

    // Assuming getPasswordFields() returns an array or list of JPasswordFields
    for (javax.swing.JPasswordField passwordField : view.getPasswordFields()) {
        System.out.println("Updating Password Field: " + passwordField.getName());

        passwordField.setEchoChar(showPassword ? (char) 0 : '*');
    }
}

    // Implement action listeners or other methods to handle user interactions
    // Example: public void handleRecoverPasswordButton() { ... }
}
