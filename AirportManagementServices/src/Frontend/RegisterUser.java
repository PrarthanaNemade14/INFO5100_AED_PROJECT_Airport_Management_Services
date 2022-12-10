/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontend;

import Backend.EcoSystem;
import Backend.Customer.Customer;
import Backend.userAccount.UserAccount;
import Backend.util.Role;
import java.awt.Graphics;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author mamthashetty
 */
public class RegisterUser extends javax.swing.JPanel {

    /**
     * Creates new form RegisterUser
     */
    JFrame mainJFrame;
    EcoSystem ecoSystem;
    public RegisterUser(JFrame mainJFrame, EcoSystem ecoSystem) {
        initComponents();
        this.mainJFrame = mainJFrame;
        this.ecoSystem = ecoSystem;
    }
    
    @Override
    public void paintComponent(Graphics g) 
    {
        super.paintComponent(g);
        ImageIcon img = new ImageIcon("src/Images/photo1.jpg");
        g.drawImage(img.getImage(), 0, 0, this.getWidth(), this.getHeight(), null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtConfrimPwd = new javax.swing.JPasswordField();
        txtPassword1 = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(255, 102, 102));
        setForeground(new java.awt.Color(204, 204, 255));
        setLayout(null);

        jButton1.setBackground(new java.awt.Color(153, 153, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-register-64.png"))); // NOI18N
        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(650, 620, 360, 70);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Username");
        add(jLabel1);
        jLabel1.setBounds(720, 130, 120, 70);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Email");
        add(jLabel2);
        jLabel2.setBounds(720, 250, 140, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Password");
        add(jLabel3);
        jLabel3.setBounds(720, 330, 130, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Re Enter");
        add(jLabel4);
        jLabel4.setBounds(720, 410, 170, 20);

        txtUsername.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        add(txtUsername);
        txtUsername.setBounds(720, 180, 280, 50);

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(txtEmail);
        txtEmail.setBounds(720, 270, 280, 50);

        jLabel5.setForeground(new java.awt.Color(0, 0, 51));
        jLabel5.setText("Already have an account?");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        add(jLabel5);
        jLabel5.setBounds(690, 700, 200, 50);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Name");
        add(jLabel6);
        jLabel6.setBounds(720, 500, 130, 20);

        txtName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        add(txtName);
        txtName.setBounds(720, 520, 280, 50);

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel8.setText("Register Customer");
        add(jLabel8);
        jLabel8.setBounds(630, -10, 420, 100);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-username-48.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        add(jLabel7);
        jLabel7.setBounds(650, 190, 50, 50);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-password-48.png"))); // NOI18N
        jLabel9.setText("jLabel9");
        add(jLabel9);
        jLabel9.setBounds(650, 430, 50, 60);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-name-48.png"))); // NOI18N
        jLabel10.setText("jLabel9");
        add(jLabel10);
        jLabel10.setBounds(650, 520, 50, 50);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-email-64.png"))); // NOI18N
        jLabel11.setText("jLabel9");
        add(jLabel11);
        jLabel11.setBounds(640, 280, 70, 40);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-password-48.png"))); // NOI18N
        jLabel13.setText("jLabel9");
        add(jLabel13);
        jLabel13.setBounds(650, 350, 50, 60);

        txtConfrimPwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConfrimPwdActionPerformed(evt);
            }
        });
        add(txtConfrimPwd);
        txtConfrimPwd.setBounds(720, 430, 280, 50);

        txtPassword1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassword1ActionPerformed(evt);
            }
        });
        add(txtPassword1);
        txtPassword1.setBounds(720, 350, 280, 50);
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        LoginUser loginUser = new LoginUser(mainJFrame, ecoSystem);
        mainJFrame.setContentPane(loginUser);
        mainJFrame.revalidate();
        mainJFrame.repaint();
        return;
    }//GEN-LAST:event_jLabel5MouseClicked

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String name = txtName.getText();
        String email = txtEmail.getText();
        String username = txtUsername.getText();
        String password = txtPassword1.getText();
        String confirmPassword = txtConfrimPwd.getText();
        
        if(username == null || "".equals(username.trim())) {
            showMessageDialog(this, "Please enter a valid username", "Error", ERROR_MESSAGE);
            return;
        }
        else if(email == null || "".equals(email.trim())|| !Pattern.matches("^[^\\s@]+@[^\\s@]+\\.[^\\s@]+$", email)) {
            showMessageDialog(this, "Please enter a valid email", "Error", ERROR_MESSAGE);
            return;
        }
        else if(password == null || "".equals(password.trim())) {
            showMessageDialog(this, "Please enter a valid password", "Error", ERROR_MESSAGE);
            return;
        }
        else if(!password.equals(confirmPassword)) {
            showMessageDialog(this, "Password does not match", "Error", ERROR_MESSAGE);
            return;
        }
        else if(name == null || "".equals(name.trim()) || !Pattern.matches("^(?![\\s.]+$)[a-zA-Z\\s.]*$", name)) {
            showMessageDialog(this, "Please enter a valid name", "Error", ERROR_MESSAGE);
            return;
        }
        
        Customer customer = ecoSystem.getCustomerDirectory().addCustomer();
        customer.setUsername(username);
        customer.setName(name);
        customer.setEmail(email);
        
        UserAccount ua = ecoSystem.getUserAccountDirectory().createUserAccount(username, password, Role.customerRole);
        ecoSystem.getRole().addNewUserRole(username, Role.customerRole);
        showMessageDialog(this, "Registered successfully");
        
        LoginUser loginUser = new LoginUser(mainJFrame, ecoSystem);
        mainJFrame.setContentPane(loginUser);
        mainJFrame.revalidate();
        mainJFrame.repaint();
        return;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtConfrimPwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConfrimPwdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConfrimPwdActionPerformed

    private void txtPassword1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassword1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassword1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField txtConfrimPwd;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword1;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
