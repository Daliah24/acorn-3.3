// RegisterController.java
package Register_UI;

import Login_UI.LoginView;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class RegisterController {
    private final RegisterView view;
    private final RegisterModel model;

    public RegisterController(RegisterView view, RegisterModel model) {
        this.view = view;
        this.model = model;

        // Attach action listeners
        view.getSaveButton().addActionListener(this::saveActionPerformed);
        // Add other listeners if needed
    }

    public void saveActionPerformed(ActionEvent e) {
        UserRegistrationData userData = view.getUserRegistrationData();

        if (userData != null) {
            boolean registrationSuccessful = model.registerUser(userData);

            if (registrationSuccessful) {
                // Registration successful
                JOptionPane.showMessageDialog(view, "Registration successful", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                // Registration failed
                JOptionPane.showMessageDialog(view, "Registration failed", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            // Display a message if userData is null
            JOptionPane.showMessageDialog(view, "Invalid user data", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

public void loginActionPerformed(ActionEvent e) {
    LoginView login = new LoginView();
    login.setVisible(true);
   
    view.dispose();
    
}

public void showPassActionPerformed(ActionEvent e) {
        // Implement show password logic here
        boolean showPassword = view.getShowPassCheckBox().isSelected();
        view.getPasswordField().setEchoChar(showPassword ? (char) 0 : '*');
    }
}
