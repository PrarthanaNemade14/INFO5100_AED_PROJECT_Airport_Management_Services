/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontend.Admin;

import Frontend.Airline.*;
import Backend.EcoSystem;
import Backend.airline.Airline;
import Backend.airport.Airport;
import Backend.Customer.Customer;
import Backend.employee.AirlineEmployee;
import Backend.restaurant.Restaurant;
import Backend.util.Constant;
import Backend.util.Role;
import Backend.util.Utils;
import java.awt.Graphics;
import java.util.List;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nemad
 */
public class AddRestaurant extends javax.swing.JPanel {

    /**
     * Creates new form EditCustomerPanel
     */
    EcoSystem ecoSystem;
    JFrame mainJFrame;
    public AddRestaurant(JFrame mainJFrame,EcoSystem ecoSystem) {
        initComponents();
        this.mainJFrame = mainJFrame;
        this.ecoSystem = ecoSystem;
//        jPanel1.setOpaque(false);
        for(Airport airport : ecoSystem.getAirportDirectory().getAirports())
        {
            jComboBoxAirport.addItem(airport.getAirportName());
        }
    }
    
    @Override
    public void paintComponent(Graphics g) 
    {
        super.paintComponent(g);
        ImageIcon img = new ImageIcon("src/Images/sky.jpeg");
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

        jLabel2 = new javax.swing.JLabel();
        btnBack2 = new javax.swing.JButton();
        txtUsername = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        jComboBoxAirport = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();

        setPreferredSize(new java.awt.Dimension(800, 800));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 3, 48)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Add Restaurant");

        btnBack2.setBackground(new java.awt.Color(255, 255, 255));
        btnBack2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnBack2.setForeground(new java.awt.Color(0, 102, 255));
        btnBack2.setText("<< Back");
        btnBack2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack2ActionPerformed(evt);
            }
        });

        txtUsername.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Username:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Name:");

        txtName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Airport:");

        btnSave.setBackground(new java.awt.Color(255, 255, 255));
        btnSave.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSave.setForeground(new java.awt.Color(153, 204, 0));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Password:");

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnBack2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(142, 142, 142)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(285, 285, 285)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel13))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtName)
                            .addComponent(txtUsername)
                            .addComponent(txtPassword)
                            .addComponent(jComboBoxAirport, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(1278, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jComboBoxAirport, txtPassword});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxAirport, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1593, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtName, txtUsername});

    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        String name = txtName.getText();
        String username = txtUsername.getText();
        String password = txtPassword.getText();
        String airportName = (String) jComboBoxAirport.getSelectedItem();
        
        if(username == null || "".equals(username.trim())) {
            showMessageDialog(this, "Please enter a valid username", "Error", ERROR_MESSAGE);
            return;
        }
        else if(name == null || "".equals(name.trim()) || !Pattern.matches("^(?![\\s.]+$)[a-zA-Z\\s.]*$", name)) {
            showMessageDialog(this, "Please enter a valid name", "Error", ERROR_MESSAGE);
            return;
        }
        
        else if(password == null || "".equals(password.trim())) {
            showMessageDialog(this, "Please enter a valid password", "Error", ERROR_MESSAGE);
            return;
        }
        else if(airportName == null || "".equals(airportName.trim())) {
            showMessageDialog(this, "Please select valid airport", "Error", ERROR_MESSAGE);
            return;
        }

        
        Restaurant restaurant = ecoSystem.getRestaurantDirectory().getRestaurantFromUsername(username);
        if(!ecoSystem.getUserAccountDirectory().checkIfUsernameIsUnique(username) || restaurant != null)
        {
            JOptionPane.showMessageDialog(this, "Username already exists", "Error", ERROR_MESSAGE);
            return;
        }
        
        restaurant = ecoSystem.getRestaurantDirectory().addRestaurant();
        restaurant.setUserName(username);
        restaurant.setName(name);
        restaurant.setAirport(ecoSystem.getAirportDirectory().getAirportFromName(airportName));
        ecoSystem.getAirportDirectory().getAirportFromName(airportName).getRestaurants().add(restaurant);
        
        ecoSystem.getUserAccountDirectory().createUserAccount(username, password, Role.restaurantRole);
        ecoSystem.getRole().addNewUserRole(username, Role.restaurantRole);
        showMessageDialog(this, "New restaurant added successfully");
        
        txtName.setText("");
        txtUsername.setText("");
        txtPassword.setText("");
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnBack2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack2ActionPerformed
        AdminPanel adminPanel = new AdminPanel(mainJFrame, ecoSystem);
        Utils.newPage(adminPanel);
    }//GEN-LAST:event_btnBack2ActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack2;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> jComboBoxAirport;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
