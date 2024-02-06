/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ACORN_SYSTEM;

import DATA.PasswordController;
import DATABASE.DatabaseHandler;
import javax.swing.JOptionPane;
import java.util.Arrays;
import javax.swing.SwingUtilities;
/**
 *
 * @author Clarence Miole
 */
public class PasswordView extends javax.swing.JFrame {
   
   private PasswordController controllers;
   private  DatabaseHandler handler;
    private String user;
   
   
    public PasswordView(PasswordController controller) {
        initComponents();
        setTitle("Password Recovery");
        setLocationRelativeTo(null);
        this.handler = new DatabaseHandler();
        this.controllers = controllers;
    }
    
     public javax.swing.JCheckBox checkboxes() {
        return showpass;
    }

    // Other existing methods...

     

    
    
     
    public String getUsername() {
        // Implement the logic to get the username from the UI component
        return username.getText();
    }
    
    
    
    public javax.swing.JButton getLoginButton(){
        return login;
    }
    public javax.swing.JButton getSaveButton(){
        return save;
    }
    
   
    
public javax.swing.JCheckBox getShowPassCheckBox() {
        return showpass;
    }
     
    /**
     *
     * @param error_updating_password
     */
    public void displayMessage(String error_updating_password) {
    System.out.println("Displaying message: " + error_updating_password);
    JOptionPane.showMessageDialog(this, error_updating_password, "Message", JOptionPane.INFORMATION_MESSAGE);
}

    public void handlePasswordUpdateSuccess() {
    displayMessage("Password updated successfully");
}

public void handlePasswordUpdateError(String errorMessage) {
    displayMessage(errorMessage);
}
public void setVisibility(boolean isVisible) {
    setVisible(isVisible);
}
    

   

    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        passe = new javax.swing.JPasswordField();
        login = new javax.swing.JButton();
        save = new javax.swing.JButton();
        passe1 = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        showpass = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(225, 239, 237));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Kristen ITC", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Username");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 28, -1, -1));

        jLabel5.setFont(new java.awt.Font("Kristen ITC", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("New Password");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 113, -1, -1));

        username.setBackground(new java.awt.Color(148, 174, 137));
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        jPanel3.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 73, 312, 34));

        passe.setBackground(new java.awt.Color(148, 174, 137));
        jPanel3.add(passe, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 158, 312, 34));

        login.setBackground(new java.awt.Color(148, 174, 137));
        login.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        login.setText("Login");
        login.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        jPanel3.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 110, 50));

        save.setBackground(new java.awt.Color(148, 174, 137));
        save.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        save.setText("Save");
        save.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel3.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 110, 50));

        passe1.setBackground(new java.awt.Color(148, 174, 137));
        jPanel3.add(passe1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 243, 312, 34));

        jLabel6.setFont(new java.awt.Font("Kristen ITC", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Confirm Password");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 204, -1, -1));

        showpass.setFont(new java.awt.Font("Kristen ITC", 0, 12)); // NOI18N
        showpass.setText("Show  Passwords");
        showpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpassActionPerformed(evt);
            }
        });
        jPanel3.add(showpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 283, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ACORN_SYSTEM/reversebgplain2.png"))); // NOI18N
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 380));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        String username = getUsername();
char[] pass1 = passe.getPassword();
char[] pass2 = passe1.getPassword();

// Check if passwords match
if (!Arrays.equals(pass1, pass2)) {
    displayMessage("Passwords do not match");
    return;
}

String newPassword = new String(pass1); // Convert char array to String

// Pass data to controller for further processing
controllers.updatePassword(username, newPassword);
JOptionPane.showMessageDialog(this, "Password updated successfully", "Success", JOptionPane.INFORMATION_MESSAGE);        
    LoginView viewer = new LoginView();
    viewer.setVisible(true);
    this.dispose();
    
    }//GEN-LAST:event_saveActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
     this.setVisible(false);
        // Assuming you have a LoginView class for the login frame
        LoginView loginView = new LoginView();
        loginView.setVisible(true);
    }//GEN-LAST:event_loginActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void showpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showpassActionPerformed
        javax.swing.JPasswordField[] passwordFields = {passe, passe1};
    boolean showPassword = getShowPassCheckBox().isSelected();

    for (javax.swing.JPasswordField passwordField : passwordFields) {
        passwordField.setEchoChar(showPassword ? '\0' : '*');
    }
    }//GEN-LAST:event_showpassActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PasswordView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PasswordView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PasswordView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PasswordView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PasswordView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PasswordView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PasswordView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PasswordView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        SwingUtilities.invokeLater(() -> {
        PasswordController controller = new PasswordController();
        PasswordView passwordView = new PasswordView(controller);
        passwordView.setVisible(true);
        
    });
    }
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField passe;
    private javax.swing.JPasswordField passe1;
    private javax.swing.JButton save;
    private javax.swing.JCheckBox showpass;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables

}
