/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.restaurant;

import business.EcoSystem;
import business.restaurant.Dish;
import business.restaurant.Restaurant;
import business.restaurantOrder.RestaurantOrder;
import business.restaurantOrder.RestaurantOrderItem;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nemad
 */
public class RestaurantViewOrderPanel extends javax.swing.JPanel {

    /**
     * Creates new form RestaurantViewOrderPanel
     */
    EcoSystem ecoSystem;
    Restaurant restaurant;
    JFrame mainJFrame;
    public RestaurantViewOrderPanel(JFrame mainJFrame, Restaurant restaurant,EcoSystem ecoSystem) {
        initComponents();
        this.mainJFrame = mainJFrame;
        this.ecoSystem = ecoSystem;
        this.restaurant = restaurant;
        lblRestaurantName.setText("Restaurant Name: "+restaurant.getName());
        populateOrderTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblViewOrder = new javax.swing.JTable();
        btnOrderDetail = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblOrderDetail = new javax.swing.JTable();
        lblRestaurantName = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 255));

        tblViewOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Order Id", "Total", "Order Status", "Comment", "Restaurant Rating"
            }
        ));
        jScrollPane1.setViewportView(tblViewOrder);

        btnOrderDetail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnOrderDetail.setText("View Order Detail");
        btnOrderDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderDetailActionPerformed(evt);
            }
        });

        tblOrderDetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Dish Name", "Price", "Quantity"
            }
        ));
        jScrollPane2.setViewportView(tblOrderDetail);

        lblRestaurantName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblRestaurantName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRestaurantName.setText("Restaurant Name: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRestaurantName, javax.swing.GroupLayout.DEFAULT_SIZE, 1542, Short.MAX_VALUE)
                .addGap(28, 28, 28))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(122, 122, 122)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnOrderDetail)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1335, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(228, 228, 228)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(123, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(lblRestaurantName, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(875, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(310, 310, 310)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(35, 35, 35)
                    .addComponent(btnOrderDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(46, 46, 46)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(305, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnOrderDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderDetailActionPerformed
        int selectedRow = tblViewOrder.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to view order detail", "Error", ERROR_MESSAGE);
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblViewOrder.getModel();
        RestaurantOrder order = (RestaurantOrder) model.getValueAt(selectedRow, 0);
        populateOrderDetailTable(order);
    }//GEN-LAST:event_btnOrderDetailActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOrderDetail;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblRestaurantName;
    private javax.swing.JTable tblOrderDetail;
    private javax.swing.JTable tblViewOrder;
    // End of variables declaration//GEN-END:variables

    private void populateOrderTable()
    {
        DefaultTableModel model = (DefaultTableModel) tblViewOrder.getModel();
        model.setRowCount(0);
        List<RestaurantOrder> orders = restaurant.getOrders();

        for(RestaurantOrder order : orders)
        {
            Object[] row = new Object[8];
            row[0] = order;
            row[1] = order.getOrderTotal();
            row[2] = order.getDeliveryStatus();
            row[3] = order.getComment();
            row[4] = order.getRestaurantRating() == 0 ? "Not rated" : order.getRestaurantRating();
            model.addRow(row);
        }
    }

    private void populateOrderDetailTable(RestaurantOrder order)
    {
        DefaultTableModel model = (DefaultTableModel) tblOrderDetail.getModel();
        model.setRowCount(0);
        List<RestaurantOrderItem> orderItems = order.getOrderItems();

        for(RestaurantOrderItem orderItem : orderItems)
        {
            Object[] row = new Object[3];
            Dish dish = orderItem.getDish();
            row[0] = dish.getName();
            row[1] = dish.getPrice();
            row[2] = orderItem.getQuantity();
            model.addRow(row);
        }
    }
}
