/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ACORN_SYSTEM;
import DATA.DashModel;
import DATA.DashController;
import DATA.PasswordController;
import DATABASE.DatabaseHandler;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import javax.swing.JButton;
import javax.swing.SwingUtilities;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;


/**
 *
 * @author Clarence Miole
 */
public class DashView extends javax.swing.JFrame {
    
      private DashController controller;
      private PasswordController controllers;
      private Timer timer;
      private RegisterView view;
      private static Connection connection;
      private static String user;
      private DashModel model;
      private double totalPrice;
      private double payments;
      
    /**
     * Creates new form DashView
     * @param user
     */
   public DashView(String user) {
        this.user = user;
        initComponents();
         this.model= new DashModel(connection);
         
        setTitle("Acorn Dashboard");
        setLocationRelativeTo(null);
        timer = new Timer(1000, (var e) -> {
            updateTime();
            
        });
        timer.start();
        
        
        DashModel model = new DashModel(connection);
    controller = new DashController();
    }

        public JButton getCatButton() {
        return cat;
    }

    public JButton getCat1Button() {
        return cat1;
    }
    public JButton getCat2Button() {
        return cat2;
    }

    public JButton getCat3Button() {
        return cat3;
    }

    public JButton getCat4Button() {
        return cat4;
    }

    public void showTabs(String tabName) {
    switch (tabName) {
        case "CATEGORY" : DASHB.setSelectedComponent(CATEGORY);
        break;
        case "ABOUT US" : DASHB.setSelectedComponent(ABOUT);
        break;
        case "CART" : DASHB.setSelectedComponent(CART);
        break;
        case "PAYMENT" : DASHB.setSelectedComponent(PAYMENT);
        break;
        case "ACCOUNT": DASHB.setSelectedComponent(ACCOUNT);
        break;
        case "SINGLE": DASHB.setSelectedComponent(SINGLE);
        break;
        case "OTHERS": DASHB.setSelectedComponent(OTHERS);
        break;
        case "MULTI": DASHB.setSelectedComponent(MULTI);
        break;
        case "ENTER": DASHB.setSelectedComponent(ENTER);
        break;
        default: 
              break;
    }
}
    
 
    
    
     private void updateTime() {
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat(" HH:mm:ss");
        String formattedTime = dateFormat.format(now);

        time.setText(formattedTime);
  
    }

public void setController(DashController controller) {
        this.controller = controller;
    }
  
private String getSelectedItemName() {
    // Implement this method to get the selected item name
    return "Selected Item Name";
}

private double getSelectedItemPrice() {
    // Implement this method to get the selected item price
    return 10.99;
}


  
//private void clearTextFields() {
//    product10.setText("");
//    category10.setSelectedIndex(0); // Assuming the first item is a default or empty value
//    price10.setText("");
//    quantity10.setText("");
//}
  private void clearTextField() {
    quantityTextField.setText("");
    totalTextField.setText("");
    jTextField4.setText("");
   jTextField1.setText("");
}
//
//   private String date() {
//    // You can customize this method based on how you want to retrieve the current date
//    // Here, we are using the current system date as a placeholder
//    return java.time.LocalDate.now().toString();
//}   
// private void resetTable() {
//    // TODO: Implement logic to reset the table here
//    // For example, if you have a table model, you can clear it:
//    DefaultTableModel model = (DefaultTableModel) table.getModel();
//    model.setRowCount(0);
//
//    // Clear the total JTextField
//    total.setText("");
//}
// public double getTotalPrice() {
//    // TODO: Implement logic to calculate the total price based on your table data
//    // For example, iterate through the table rows and sum up the prices
//    double totalPrice = 0.0;
//    // Your logic here to calculate the total price
//
//    return totalPrice;
//}  
// 
// private int calculateTotalQuantity(int quantity) {
//    // Implement your logic to calculate total quantity
//    // For example, you can directly return the quantity or perform any calculation
//    return quantity;
//}
//
//private double calculateTotalPrice(int quantity, double price) {
//    // Implement your logic to calculate total price
//    // For example, you can return the product of quantity and price
//    return quantity * price;
//}
//    private boolean isNumeric(String str) {
//    if (str == null || str.isEmpty()) {
//        return false;
//    }
//    try {
//        Double.parseDouble(str);
//        return true;
//    } catch (NumberFormatException e) {
//        return false;
//    }
//}
//    private void showMessage(String message) {
//    // You can implement a method to display messages to the user
//    // For example, using a JOptionPane or updating a status label
//    JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.ERROR_MESSAGE);
//}
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        DASHB = new javax.swing.JTabbedPane();
        CATEGORY = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        single = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        CART = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ACCOUNT = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        upduser = new javax.swing.JButton();
        updpass = new javax.swing.JButton();
        create = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        ABOUT = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        PAYMENT = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        totalTextField = new javax.swing.JTextField();
        quantityTextField = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        ENTER = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        OTHERS = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        MULTI = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        SINGLE = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        cat2 = new javax.swing.JButton();
        cat3 = new javax.swing.JButton();
        cat1 = new javax.swing.JButton();
        cat4 = new javax.swing.JButton();
        time = new javax.swing.JLabel();
        cat = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CATEGORY.setBackground(new java.awt.Color(225, 239, 237));
        CATEGORY.setPreferredSize(new java.awt.Dimension(1000, 300));
        CATEGORY.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Kristen ITC", 1, 24)); // NOI18N
        jLabel1.setText("Hot Deals");
        CATEGORY.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 164, 50));

        single.setBackground(new java.awt.Color(148, 174, 137));
        single.setFont(new java.awt.Font("Kristen ITC", 1, 18)); // NOI18N
        single.setText("Single Player");
        single.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        single.setPreferredSize(new java.awt.Dimension(230, 90));
        single.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                singleActionPerformed(evt);
            }
        });
        CATEGORY.add(single, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jButton2.setBackground(new java.awt.Color(148, 174, 137));
        jButton2.setFont(new java.awt.Font("Kristen ITC", 1, 18)); // NOI18N
        jButton2.setText("Mutli-Player");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setPreferredSize(new java.awt.Dimension(230, 90));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        CATEGORY.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        jButton3.setBackground(new java.awt.Color(148, 174, 137));
        jButton3.setFont(new java.awt.Font("Kristen ITC", 1, 18)); // NOI18N
        jButton3.setText("Entertainment Apps");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.setPreferredSize(new java.awt.Dimension(230, 90));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        CATEGORY.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, -1, -1));

        jButton4.setBackground(new java.awt.Color(148, 174, 137));
        jButton4.setFont(new java.awt.Font("Kristen ITC", 1, 18)); // NOI18N
        jButton4.setText("Others");
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.setPreferredSize(new java.awt.Dimension(230, 90));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        CATEGORY.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ACORN_SYSTEM/skies and flowers.png"))); // NOI18N
        CATEGORY.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-220, 0, -1, 480));

        DASHB.addTab("DASHBOARD", CATEGORY);

        CART.setBackground(new java.awt.Color(225, 239, 237));
        CART.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Kristen ITC", 0, 36)); // NOI18N
        jLabel2.setText("Cart");
        CART.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 15, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ACORN_SYSTEM/skies and flowers.png"))); // NOI18N
        CART.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-220, 0, 860, 480));

        DASHB.addTab("Cart", CART);

        ACCOUNT.setBackground(new java.awt.Color(225, 239, 237));
        ACCOUNT.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Kristen ITC", 0, 36)); // NOI18N
        jLabel5.setText("Account");
        ACCOUNT.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        logout.setBackground(new java.awt.Color(148, 174, 137));
        logout.setFont(new java.awt.Font("Kristen ITC", 0, 18)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setText("Log Out");
        logout.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        logout.setPreferredSize(new java.awt.Dimension(168, 27));
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        ACCOUNT.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 200, 60));

        delete.setBackground(new java.awt.Color(148, 174, 137));
        delete.setFont(new java.awt.Font("Kristen ITC", 0, 18)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("Delete Account");
        delete.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        delete.setPreferredSize(new java.awt.Dimension(168, 27));
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        ACCOUNT.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 200, 60));

        upduser.setBackground(new java.awt.Color(148, 174, 137));
        upduser.setFont(new java.awt.Font("Kristen ITC", 0, 18)); // NOI18N
        upduser.setForeground(new java.awt.Color(255, 255, 255));
        upduser.setText("Update Username");
        upduser.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        upduser.setPreferredSize(new java.awt.Dimension(168, 27));
        upduser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upduserActionPerformed(evt);
            }
        });
        ACCOUNT.add(upduser, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 200, 60));

        updpass.setBackground(new java.awt.Color(148, 174, 137));
        updpass.setFont(new java.awt.Font("Kristen ITC", 0, 18)); // NOI18N
        updpass.setForeground(new java.awt.Color(255, 255, 255));
        updpass.setText("Update Password");
        updpass.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        updpass.setPreferredSize(new java.awt.Dimension(168, 27));
        updpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updpassActionPerformed(evt);
            }
        });
        ACCOUNT.add(updpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 200, 60));

        create.setBackground(new java.awt.Color(148, 174, 137));
        create.setFont(new java.awt.Font("Kristen ITC", 0, 18)); // NOI18N
        create.setForeground(new java.awt.Color(255, 255, 255));
        create.setText("Create New Account");
        create.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createActionPerformed(evt);
            }
        });
        ACCOUNT.add(create, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 200, 60));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ACORN_SYSTEM/skies and flowers.png"))); // NOI18N
        ACCOUNT.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(-220, 0, 860, 480));

        DASHB.addTab("Account", ACCOUNT);

        ABOUT.setBackground(new java.awt.Color(225, 239, 237));
        ABOUT.setPreferredSize(new java.awt.Dimension(460, 467));
        ABOUT.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(225, 239, 237));
        jLabel4.setFont(new java.awt.Font("Kristen ITC", 0, 36)); // NOI18N
        jLabel4.setText("About Us");
        ABOUT.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ACORN_SYSTEM/skies and flowers.png"))); // NOI18N
        ABOUT.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(-220, 0, -1, 480));

        DASHB.addTab("ABOUT US", ABOUT);

        PAYMENT.setBackground(new java.awt.Color(225, 239, 237));
        PAYMENT.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Kristen ITC", 0, 36)); // NOI18N
        jLabel3.setText("Payment");
        PAYMENT.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel10.setFont(new java.awt.Font("Kristen ITC", 0, 24)); // NOI18N
        jLabel10.setText("Enter Payment:");
        PAYMENT.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        jLabel11.setFont(new java.awt.Font("Kristen ITC", 0, 24)); // NOI18N
        jLabel11.setText("Total:");
        PAYMENT.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, -1, -1));

        jLabel12.setFont(new java.awt.Font("Kristen ITC", 0, 24)); // NOI18N
        jLabel12.setText("Quantity:");
        PAYMENT.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, -1, -1));

        jLabel13.setFont(new java.awt.Font("Kristen ITC", 0, 24)); // NOI18N
        jLabel13.setText("Change:");
        PAYMENT.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, -1, -1));

        jTextField1.setBackground(new java.awt.Color(148, 174, 137));
        jTextField1.setFont(new java.awt.Font("Kristen ITC", 0, 24)); // NOI18N
        jTextField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        PAYMENT.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 300, 50));

        totalTextField.setBackground(new java.awt.Color(148, 174, 137));
        totalTextField.setFont(new java.awt.Font("Kristen ITC", 0, 24)); // NOI18N
        totalTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        totalTextField.setEnabled(false);
        totalTextField.setFocusable(false);
        totalTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalTextFieldActionPerformed(evt);
            }
        });
        PAYMENT.add(totalTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 300, 50));

        quantityTextField.setBackground(new java.awt.Color(148, 174, 137));
        quantityTextField.setFont(new java.awt.Font("Kristen ITC", 0, 24)); // NOI18N
        quantityTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        quantityTextField.setEnabled(false);
        quantityTextField.setFocusable(false);
        PAYMENT.add(quantityTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 300, 50));

        jTextField4.setBackground(new java.awt.Color(148, 174, 137));
        jTextField4.setFont(new java.awt.Font("Kristen ITC", 0, 24)); // NOI18N
        jTextField4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextField4.setEnabled(false);
        jTextField4.setFocusable(false);
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        PAYMENT.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 300, 50));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ACORN_SYSTEM/skies and flowers.png"))); // NOI18N
        PAYMENT.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-220, 0, 860, 480));

        DASHB.addTab("Payment", PAYMENT);

        ENTER.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ACORN_SYSTEM/skies and flowers.png"))); // NOI18N
        ENTER.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(-220, 0, 860, 480));

        DASHB.addTab("ENTER", ENTER);

        OTHERS.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ACORN_SYSTEM/skies and flowers.png"))); // NOI18N
        OTHERS.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(-220, 6, -1, 470));

        DASHB.addTab("OTHERS", OTHERS);

        MULTI.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ACORN_SYSTEM/skies and flowers.png"))); // NOI18N
        MULTI.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(-220, 0, 860, 480));

        DASHB.addTab("MULTI", MULTI);

        SINGLE.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ACORN_SYSTEM/skies and flowers.png"))); // NOI18N
        SINGLE.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(-220, 0, 860, 480));

        DASHB.addTab("SINGLE", SINGLE);

        jPanel2.add(DASHB, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, -40, 640, 510));

        jPanel1.setBackground(new java.awt.Color(225, 239, 237));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cat2.setBackground(new java.awt.Color(148, 174, 137));
        cat2.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        cat2.setText("Cart");
        cat2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cat2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cat2ActionPerformed(evt);
            }
        });
        jPanel1.add(cat2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 100, 40));

        cat3.setBackground(new java.awt.Color(148, 174, 137));
        cat3.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        cat3.setText("Payment");
        cat3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cat3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cat3ActionPerformed(evt);
            }
        });
        jPanel1.add(cat3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 100, 40));

        cat1.setBackground(new java.awt.Color(148, 174, 137));
        cat1.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        cat1.setText("About Us");
        cat1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cat1.setPreferredSize(new java.awt.Dimension(106, 35));
        cat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cat1ActionPerformed(evt);
            }
        });
        jPanel1.add(cat1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 100, 40));

        cat4.setBackground(new java.awt.Color(148, 174, 137));
        cat4.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        cat4.setText("Account");
        cat4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cat4.setMaximumSize(new java.awt.Dimension(106, 35));
        cat4.setMinimumSize(new java.awt.Dimension(106, 35));
        cat4.setPreferredSize(new java.awt.Dimension(106, 35));
        cat4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cat4ActionPerformed(evt);
            }
        });
        jPanel1.add(cat4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 100, 40));

        time.setBackground(new java.awt.Color(148, 174, 137));
        time.setFont(new java.awt.Font("Kristen ITC", 1, 18)); // NOI18N
        time.setText(" 00:00:00");
        time.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 100, 40));

        cat.setBackground(new java.awt.Color(148, 174, 137));
        cat.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        cat.setText("Category");
        cat.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catActionPerformed(evt);
            }
        });
        jPanel1.add(cat, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 100, 40));

        jLabel7.setFont(new java.awt.Font("Kristen ITC", 1, 24)); // NOI18N
        jLabel7.setText("Acorn");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        name.setEditable(false);
        name.setBackground(new java.awt.Color(148, 174, 137));
        name.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        name.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        name.setEnabled(false);
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 49, 190, 90));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ACORN_SYSTEM/skies and flowers.png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 470));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 470));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed

    }//GEN-LAST:event_nameActionPerformed

    private void catActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catActionPerformed
        this.showTabs("CATEGORY");
    }//GEN-LAST:event_catActionPerformed

    private void cat4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cat4ActionPerformed
        this.showTabs("ACCOUNT");
    }//GEN-LAST:event_cat4ActionPerformed

    private void cat3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cat3ActionPerformed
        this.showTabs("PAYMENT");
    }//GEN-LAST:event_cat3ActionPerformed

    private void cat2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cat2ActionPerformed
        this.showTabs("CART");
    }//GEN-LAST:event_cat2ActionPerformed

    private void cat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cat1ActionPerformed
        this.showTabs("ABOUT US");
    }//GEN-LAST:event_cat1ActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // Open the registration frame
        int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to logout?", "Confirm Logout", JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, "Logged out Successfully", "Confirmed Logout", JOptionPane.INFORMATION_MESSAGE);

            // Open the login frame
            LoginView view = new LoginView();
            view.setVisible(true);

            // Close the current frame
            this.dispose();
        }
    }//GEN-LAST:event_logoutActionPerformed

    private void createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createActionPerformed
        RegisterView regview = new RegisterView();
        regview.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_createActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete your account?", "Confirm Account Deletion", JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            // Delete the account from the database
            controller.deleteAccount();

            // Display a message saying "Account successfully deleted"
            JOptionPane.showMessageDialog(this, "Account successfully deleted", "Account Deleted", JOptionPane.OK_OPTION);
            // Close the current frame and open the login frame
            LoginView view = new LoginView();
            view.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void upduserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upduserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_upduserActionPerformed

    private void updpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updpassActionPerformed
       PasswordView pass = new PasswordView(controllers);
        pass.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_updpassActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void totalTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalTextFieldActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void singleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_singleActionPerformed
        this.showTabs("SINGLE");
    }//GEN-LAST:event_singleActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       this.showTabs("MULTI");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.showTabs("ENTER");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.showTabs("ENTER");
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
     public static void main(String args[]) {
        SwingUtilities.invokeLater(() -> {
            DashModel model = new DashModel(connection);
        DashView view = new DashView(user);
        DashController controller = new DashController();

        // Simulate a successful login and initialize the view with the username
         // Replace with the actual username
      
        });
     }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ABOUT;
    private javax.swing.JPanel ACCOUNT;
    private javax.swing.JPanel CART;
    private javax.swing.JPanel CATEGORY;
    private javax.swing.JTabbedPane DASHB;
    private javax.swing.JPanel ENTER;
    private javax.swing.JPanel MULTI;
    private javax.swing.JPanel OTHERS;
    private javax.swing.JPanel PAYMENT;
    private javax.swing.JPanel SINGLE;
    private javax.swing.JButton cat;
    private javax.swing.JButton cat1;
    private javax.swing.JButton cat2;
    private javax.swing.JButton cat3;
    private javax.swing.JButton cat4;
    private javax.swing.JButton create;
    private javax.swing.JButton delete;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JButton logout;
    private javax.swing.JTextField name;
    private javax.swing.JTextField quantityTextField;
    private javax.swing.JButton single;
    private javax.swing.JLabel time;
    private javax.swing.JTextField totalTextField;
    private javax.swing.JButton updpass;
    private javax.swing.JButton upduser;
    // End of variables declaration//GEN-END:variables


}

