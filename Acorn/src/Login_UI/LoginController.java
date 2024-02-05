// LoginController class

package Login_UI;

import Pass_UI.PasswordView;
import java.awt.event.ActionEvent;
import Register_UI.RegisterView;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

public class LoginController {
    private final LoginView view;
    private final LoginModel model;
    
    public LoginController(LoginView view, LoginModel model) {
        this.view = view;
        this.model = model;

        // Attach action listeners
        view.getLoginButton().addActionListener(this::loginActionPerformed);
        view.getShowPassCheckBox().addActionListener(this::showPassActionPerformed);
        view.getSignupButton().addActionListener(this::signupActionPerformed);
        view.getForgotPassJLabel().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                forgotMouseClicked(e);
            }
        });
    }

    public void loginActionPerformed(ActionEvent e) {
    String enteredUsername = view.getUsernameField().getText();
    String enteredPassword = new String(view.getPasswordField().getPassword());

    model.setEnteredUsername(enteredUsername);
    model.setEnteredPassword(enteredPassword);

    System.out.println("Debug: Entered Username: " + enteredUsername);
    System.out.println("Debug: Entered Password: " + enteredPassword);

    boolean loginSuccessful = model.authenticateUser();

    if (loginSuccessful) {
        System.out.println("Debug: Login successful");
        view.showLoginSuccessMessage();
        view.clearFields();
    } else {
        System.out.println("Debug: Login failed");
        view.showLoginFailureMessage();
    }
}


    public void showPassActionPerformed(ActionEvent e) {
        // Implement show password logic here
        boolean showPassword = view.getShowPassCheckBox().isSelected();
        view.getPasswordField().setEchoChar(showPassword ? (char) 0 : '*');
    }

    
    

public void signupActionPerformed(ActionEvent e) {
        // Handle signup button click
        // Example: Open the RegistrationView
        RegisterView regview = new RegisterView();
        regview.setVisible(true);

        // You might want to close the login view or handle visibility based on your application's flow
        
        view.dispose();
    }


public void forgotMouseClicked(MouseEvent e) {
        // Hide the current frame
        view.dispose();

        // Create and show the PasswordView frame
        PasswordView passwordViewFrame = new PasswordView();
        passwordViewFrame.setVisible(true);
    }
}