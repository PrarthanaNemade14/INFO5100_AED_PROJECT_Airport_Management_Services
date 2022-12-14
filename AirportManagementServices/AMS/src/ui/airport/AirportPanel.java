/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.airport;

import ui.Customer.*;
import business.DB40Util.DB4OUtil;
import business.EcoSystem;
import business.airport.Airport;
import business.customer.Customer;
import business.util.Utils;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import ui.HomePage;

/**
 *
 * @author nemad
 */
public class AirportPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerPanel
     */
    private EcoSystem ecoSystem;
    private Airport airport;
    private JFrame mainJFrame;
    public AirportPanel(EcoSystem ecoSystem, Airport airport, JFrame mainJFrame) {
        initComponents();
        this.ecoSystem = ecoSystem;
        this.airport = airport;
        this.mainJFrame = mainJFrame;
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

        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        btn_bookTickets = new javax.swing.JButton();
        btn_bookingHistory = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btn_orderFood = new javax.swing.JButton();

        jLabel1.setBackground(new java.awt.Color(204, 102, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Airport Dashboard");
        jLabel1.setMaximumSize(new java.awt.Dimension(102, 100));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("Logout");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btn_bookTickets.setBackground(new java.awt.Color(255, 255, 255));
        btn_bookTickets.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_bookTickets.setForeground(new java.awt.Color(0, 51, 204));
        btn_bookTickets.setText("Add Terminal");
        btn_bookTickets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bookTicketsActionPerformed(evt);
            }
        });

        btn_bookingHistory.setBackground(new java.awt.Color(255, 255, 255));
        btn_bookingHistory.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_bookingHistory.setForeground(new java.awt.Color(0, 0, 204));
        btn_bookingHistory.setText("Edit Terminal");
        btn_bookingHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bookingHistoryActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 204));
        jButton4.setText("View Flight details");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        btn_orderFood.setBackground(new java.awt.Color(255, 255, 255));
        btn_orderFood.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_orderFood.setForeground(new java.awt.Color(0, 0, 204));
        btn_orderFood.setText("Process Request");
        btn_orderFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_orderFoodActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_bookTickets, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_bookingHistory, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_orderFood, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(410, 410, 410))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_bookTickets, btn_bookingHistory, btn_orderFood, jButton4});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_bookTickets, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_bookingHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_orderFood, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(263, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_bookTicketsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bookTicketsActionPerformed
        AddTerminal addTerminal = new AddTerminal(ecoSystem, airport, mainJFrame);
        Utils.newPage(addTerminal);
    }//GEN-LAST:event_btn_bookTicketsActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        AirportFlightDetail airportFlightDetail = new AirportFlightDetail(ecoSystem, airport, mainJFrame);
        Utils.newPage(airportFlightDetail);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        DB4OUtil dB4OUtil = DB4OUtil.getInstance();
        dB4OUtil.storeSystem(ecoSystem);
        HomePage newMainJFrame = new HomePage();
        newMainJFrame.setVisible(true);
        mainJFrame.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btn_bookingHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bookingHistoryActionPerformed
        EditTerminal editTerminal = new EditTerminal(ecoSystem, airport, mainJFrame);
        Utils.newPage(editTerminal);
    }//GEN-LAST:event_btn_bookingHistoryActionPerformed

    private void btn_orderFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_orderFoodActionPerformed
        ProcessRequest processRequest = new ProcessRequest(ecoSystem, airport, mainJFrame);
        Utils.newPage(processRequest);
    }//GEN-LAST:event_btn_orderFoodActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_bookTickets;
    private javax.swing.JButton btn_bookingHistory;
    private javax.swing.JButton btn_orderFood;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
