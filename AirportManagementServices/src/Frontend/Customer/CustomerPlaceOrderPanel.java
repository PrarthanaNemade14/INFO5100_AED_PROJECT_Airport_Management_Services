/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontend.Customer;

import Backend.EcoSystem;
import Backend.airport.Airport;
import Backend.Customer.Customer;
import Backend.restaurant.Dish;
import Backend.restaurant.Restaurant;
import Backend.restaurantOrder.RestaurantOrder;
import Backend.restaurantOrder.RestaurantOrderItem;
import Backend.restaurantOrder.RestauratOrderStatus;
import Backend.util.Utils;
import java.awt.Graphics;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mamthashetty
 */
public class CustomerPlaceOrderPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerPlaceOrderPanel
     */
    EcoSystem ecoSystem;
    Customer customer;
    JFrame mainJFrame;
    public CustomerPlaceOrderPanel(JFrame mainJFrame, Customer customer,EcoSystem ecoSystem) {
        initComponents();
        this.mainJFrame = mainJFrame;
        this.ecoSystem = ecoSystem;
        this.customer = customer;
        
        List<Airport> airports = ecoSystem.getAirportDirectory().getAirports();
        for(Airport airport : ecoSystem.getAirportDirectory().getAirports())
        {
            airportComboBox.addItem(airport.getAirportName());
        }

        txtCustomerName.setText(customer.getName());
    }
    
    @Override
    public void paintComponent(Graphics g) 
    {
        super.paintComponent(g);
        ImageIcon img = new ImageIcon("src/Images/food_1.jpg");
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

        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        airportComboBox = new javax.swing.JComboBox<>();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        menuTbl = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnAddToCart = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAddToCart = new javax.swing.JTable();
        btnPlaceOrder = new javax.swing.JButton();
        txtCustomerName = new javax.swing.JLabel();
        btnDeleteCart = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        restaurantComboBox1 = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(153, 153, 255));

        btnBack.setText("<- Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Airport:");

        airportComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        airportComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                airportComboBoxItemStateChanged(evt);
            }
        });
        airportComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                airportComboBoxActionPerformed(evt);
            }
        });

        txtSearch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        btnSearch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        menuTbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        menuTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Dish Name", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(menuTbl);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Menu");

        btnAddToCart.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAddToCart.setText("Add to Cart");
        btnAddToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddToCartActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Cart");

        tblAddToCart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Restaurant", "Dish Name", "Price", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblAddToCart);

        btnPlaceOrder.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnPlaceOrder.setText("Place Order");
        btnPlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaceOrderActionPerformed(evt);
            }
        });

        txtCustomerName.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtCustomerName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCustomerName.setText("Restaurant Name:");

        btnDeleteCart.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDeleteCart.setText("Delete");
        btnDeleteCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteCartActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Restaurant Name:");

        restaurantComboBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        restaurantComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                restaurantComboBox1ItemStateChanged(evt);
            }
        });
        restaurantComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restaurantComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(334, 334, 334)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAddToCart, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnDeleteCart, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnPlaceOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSearch))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
                                        .addComponent(jScrollPane2))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(246, 246, 246)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(airportComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(restaurantComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(777, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(airportComboBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(restaurantComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(jLabel2)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAddToCart, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPlaceOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteCart, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(321, 321, 321))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void airportComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_airportComboBoxActionPerformed
        restaurantComboBox1.removeAllItems();
        String airportName = (String) airportComboBox.getSelectedItem();
        Airport airport = ecoSystem.getAirportDirectory().getAirportFromName(airportName);
        for(Restaurant r : airport.getRestaurants())
        {
            restaurantComboBox1.addItem(r.getName());
        }
    }//GEN-LAST:event_airportComboBoxActionPerformed

    private void btnAddToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddToCartActionPerformed
        int selectedRow = menuTbl.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to add dish to cart", "Error", ERROR_MESSAGE);
            return;
        }
        DefaultTableModel model = (DefaultTableModel) menuTbl.getModel();
        Dish dish = (Dish) model.getValueAt(selectedRow, 0);
        Restaurant restaurant = ecoSystem.getRestaurantDirectory().getRestaurantFromName(restaurantComboBox1.getSelectedItem().toString());
        populateAddToCartTable(restaurant, dish);
    }//GEN-LAST:event_btnAddToCartActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String search = txtSearch.getText();
        String restaurantName = (String) restaurantComboBox1.getSelectedItem();
        Restaurant restaurant = ecoSystem.getRestaurantDirectory().getRestaurantFromName(restaurantName);
        populateMenuTable(restaurant, search);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        CustomerPanel customerAreaJPanel = new CustomerPanel(ecoSystem, customer, mainJFrame);
        mainJFrame.setContentPane(customerAreaJPanel);
        mainJFrame.revalidate();
        mainJFrame.repaint();
        return;
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDeleteCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteCartActionPerformed
        int selectedRow = tblAddToCart.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete dish from cart", "Error", ERROR_MESSAGE);
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblAddToCart.getModel();
        model.removeRow(selectedRow);
    }//GEN-LAST:event_btnDeleteCartActionPerformed

    private void btnPlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaceOrderActionPerformed
        int rowCount = tblAddToCart.getRowCount();
        if(rowCount < 1)
        {
            JOptionPane.showMessageDialog(this, "Please add a dish to place order", "Error", ERROR_MESSAGE);
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblAddToCart.getModel();
        RestaurantOrder order = ecoSystem.getRestaurantOrderDirectory().createOrder();
        Restaurant restaurant = (Restaurant) model.getValueAt(0, 0);
        customer.getRestaurantOrders().add(order);
        restaurant.getOrders().add(order);
        order.setCustomer(customer);
        order.setRestaurant(restaurant);
        order.setDeliveryStatus(RestauratOrderStatus.orderPlaced);
        int orderTotal = 0;
        for(int i=0; i<rowCount; i++)
        {
            Dish dish = (Dish) model.getValueAt(i, 1);
            String quantity = (String)model.getValueAt(i, 3);
            RestaurantOrderItem orderItem = order.addOrderItem();
            orderItem.setDish(dish);
            orderItem.setQuantity(Integer.valueOf(quantity));
            Integer price = Integer.valueOf((String)model.getValueAt(i, 2));
            orderTotal += price;
        }
        order.setOrderTotal(orderTotal+"");
        
        String emailText = "Thank you for placing order, please find your order detail below \n";
        emailText += "Airport: "+restaurant.getAirport().getAirportName();
        emailText += "Restaurant Name: "+restaurant.getName();
        emailText += "Order detail: \n";
        for(RestaurantOrderItem restaurantOrderItem : order.getOrderItems())
        {
            Dish dish = restaurantOrderItem.getDish();
            emailText += dish.getName() + "  " + dish.getPrice() + "  " + restaurantOrderItem.getQuantity();
        }
        emailText += "Total: "+order.getOrderTotal();
        //Utils.emailFoodOrder(customer.getEmail(), emailText);
        JOptionPane.showMessageDialog(this, "Success!!! Order placed successfully");
        model.setRowCount(0);
    }//GEN-LAST:event_btnPlaceOrderActionPerformed

    private void restaurantComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restaurantComboBox1ActionPerformed

    }//GEN-LAST:event_restaurantComboBox1ActionPerformed

    private void airportComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_airportComboBoxItemStateChanged
        restaurantComboBox1.removeAllItems();
        String airportName = (String) airportComboBox.getSelectedItem();
        Airport airport = ecoSystem.getAirportDirectory().getAirportFromName(airportName);
        for(Restaurant r : airport.getRestaurants())
        {
            restaurantComboBox1.addItem(r.getName());
        }
    }//GEN-LAST:event_airportComboBoxItemStateChanged

    private void restaurantComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_restaurantComboBox1ItemStateChanged
        String restaurantName = (String) restaurantComboBox1.getSelectedItem();
        if(restaurantName == null || "".equals(restaurantName.trim()))
            return;
        Restaurant restaurant = ecoSystem.getRestaurantDirectory().getRestaurantFromName(restaurantName);
        populateMenuTable(restaurant, "");
        
        //Code to reset cart table
        DefaultTableModel model = (DefaultTableModel) tblAddToCart.getModel();
        if(model.getRowCount() > 0)
        {
            Restaurant res = (Restaurant) model.getValueAt(1, 0);
            if(res != restaurant)
                model.setRowCount(0);
        }
    }//GEN-LAST:event_restaurantComboBox1ItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> airportComboBox;
    private javax.swing.JButton btnAddToCart;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDeleteCart;
    private javax.swing.JButton btnPlaceOrder;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable menuTbl;
    private javax.swing.JComboBox<String> restaurantComboBox1;
    private javax.swing.JTable tblAddToCart;
    private javax.swing.JLabel txtCustomerName;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    private void populateMenuTable(Restaurant restaurant, String search)
    {
        DefaultTableModel model = (DefaultTableModel) menuTbl.getModel();
        model.setRowCount(0);
        List<Dish> menu = restaurant.getMenu();

        for(Dish dish : menu)
        {
            Object[] row = new Object[2];
            row[0] = dish;
            row[1] = dish.getPrice();
            if(!dish.getName().contains(search))
                continue;
            model.addRow(row);
        }
    }

    private void populateAddToCartTable(Restaurant restaurant, Dish dish) {
        DefaultTableModel model = (DefaultTableModel) tblAddToCart.getModel();
        int rowPosition = getDishRowValue(dish.getName());
        if(rowPosition < 0)
            model.addRow(new Object[]{restaurant, dish, dish.getPrice(), "1"});
        else
        {
            Integer quantity = Integer.valueOf((String)model.getValueAt(rowPosition, 3));
            Integer price = Integer.valueOf((String)model.getValueAt(rowPosition, 2));
            model.setValueAt(quantity+1+"", rowPosition, 3);
            model.setValueAt(price+Integer.valueOf(dish.getPrice())+"", rowPosition, 2);
        }
    }
    
    private int getDishRowValue(String dishName)
    {
        int rowCount = tblAddToCart.getRowCount();
        DefaultTableModel model = (DefaultTableModel) tblAddToCart.getModel();
        for(int i=0; i<rowCount; i++)
        {
            Dish dish = (Dish) model.getValueAt(i, 1);
            if(dishName.equals(dish.getName()))
                return i;
        }
        return -1;
    }
}
