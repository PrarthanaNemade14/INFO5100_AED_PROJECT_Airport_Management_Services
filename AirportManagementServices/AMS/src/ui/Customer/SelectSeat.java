/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Customer;

import business.EcoSystem;
import business.airline.Airline;
import business.airline.Airplane;
import business.customer.Customer;
import business.order.Order;
import business.util.Constant;
import business.util.Utils;
import java.awt.Graphics;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author nemad
 */
public class SelectSeat extends javax.swing.JPanel {

    /**
     * Creates new form SelectSeat
     */
    EcoSystem ecoSystem;
    Customer customer;
    Airplane airplane;
    String flghtDate;
    String passengerCount;
    private JFrame mainJFrame;
    DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
    public SelectSeat(EcoSystem ecoSystem, Customer customer, Airplane airplane, String flghtDate, String passengerCount, JFrame mainJFrame) {
        initComponents();
        //jScrollPane1.getColumnHeader().setVisible(false);
        tblSeat.setTableHeader(null);
        this.ecoSystem = ecoSystem;
        this.customer = customer;
        this.airplane = airplane;
        this.flghtDate = flghtDate;
        this.passengerCount = passengerCount;
        this.mainJFrame = mainJFrame;
        
        lblDeparture.setText(airplane.getDepartureAirport().getAirportName());
        lblArrival.setText(airplane.getArrivalAirport().getAirportName());
        lblDate.setText(flghtDate);
        populateTable();
    }
    
    @Override
    public void paintComponent(Graphics g) 
    {
        super.paintComponent(g);
        ImageIcon img = new ImageIcon("src/Images/sky.jpeg");
        g.drawImage(img.getImage(), 0, 0, this.getWidth(), this.getHeight(), null);
    }
    
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblSeat.getModel();
        model.setRowCount(0);
        int noOfRows = Constant.noOfSeats / 6;
        for (int i = 0; i < noOfRows; i++) {
            Object[] row = new Object[7];
            List<Integer> bookedSeat = airplane.getBooking().get(flghtDate);
            row[0] = new ImageIcon("src/Images/car-seat.png");
            row[1] = new ImageIcon("src/Images/car-seat.png");
            row[2] = new ImageIcon("src/Images/car-seat.png");
            row[3] = "";
            row[4] = new ImageIcon("src/Images/car-seat.png");
            row[5] = new ImageIcon("src/Images/car-seat.png");
            row[6] = new ImageIcon("src/Images/car-seat.png");
            
            if(bookedSeat != null)
            {
                for(int j=0; j<bookedSeat.size(); j++)
                {
                    if(bookedSeat.get(j) / 6 != i)
                        continue;
                    int seatOccupied = bookedSeat.get(j) % 6;
                    if(seatOccupied == 0)
                        row[6] = new ImageIcon("src/Images/seat-selected.png");
                    else
                        row[seatOccupied-1] = new ImageIcon("src/Images/seat-selected.png");
                }
            }
            model.addRow(row);
        }
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
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblDeparture = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblArrival = new javax.swing.JLabel();
        btnBack2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSeat = new javax.swing.JTable(){
            public Class getColumnClass(int column) {
                return Icon.class;
            }
        };

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Arrival Airport");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Departure Airport");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Date");

        lblDeparture.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDeparture.setText("Departure Airport");

        lblDate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDate.setText("Destination Airport");

        lblArrival.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblArrival.setText("Destination Airport");

        btnBack2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnBack2.setForeground(new java.awt.Color(0, 102, 204));
        btnBack2.setText("<< Back");
        btnBack2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Book Seat");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tblSeat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ));
        tblSeat.setRowHeight(65);
        tblSeat.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tblSeat);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(52, 52, 52)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblDeparture, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblArrival, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                        .addComponent(lblDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btnBack2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btnBack2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDeparture, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblArrival, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBack2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack2ActionPerformed
        BookTicketPanel bookTicketPanel = new BookTicketPanel(ecoSystem, customer, mainJFrame);
        Utils.previosPage(bookTicketPanel);
    }//GEN-LAST:event_btnBack2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int selectedRow = tblSeat.getSelectedRow();
        int selectedColumn = tblSeat.getSelectedColumn();
        if(selectedRow < 0 || selectedColumn == 3) {
            JOptionPane.showMessageDialog(this, "Please select a seat", "Error", ERROR_MESSAGE);
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblSeat.getModel();
        ImageIcon icon = (ImageIcon) model.getValueAt(selectedRow, selectedColumn);
        int length = icon.getDescription().split("/").length;
        String fileName = icon.getDescription().split("/")[length-1];
        if("seat-selected.png".equals(fileName))
        {
            showMessageDialog(this, "Seat already seleted, please choose non-selected seat", "Error", ERROR_MESSAGE);
            return;
        }
        String seatNo = String.valueOf((6 * selectedRow) + selectedColumn+1);
        Order order = ecoSystem.getOrderDirectory().createOrder();
        order.setDepartureAirport(airplane.getDepartureAirport());
        order.setArrivalAirport(airplane.getArrivalAirport());
        order.setCustomer(customer);
        customer.getOrders().add(order);
        order.setPrice(airplane.getPrice());
        order.setBookingTime(new Date());
        order.setFlightDate(this.flghtDate);
        order.setSeatNo(seatNo);
        order.setAirplane(airplane);
        showMessageDialog(this, "Booking done successfully, booking details has been sent to your mail id");
        if(airplane.getBooking().get(this.flghtDate) == null)
        {
            airplane.getBooking().put(this.flghtDate, new ArrayList<Integer>());
            airplane.getBooking().get(this.flghtDate).add(Integer.valueOf(seatNo));
        }
        else
            airplane.getBooking().get(this.flghtDate).add(Integer.valueOf(seatNo));
        
        try {
            Utils.createPdf(order.getCustomer().getName(), order.getAirplane().getAirline().getName(), df.format(order.getBookingTime()), order.getDepartureAirport().getAirportName(), order.getArrivalAirport().getAirportName(), order.getFlightDate(),
                    order.getAirplane().getDepartureTime(), order.getAirplane().getTotalHours(), order.getAirplane().getAirplaneNo(), order.getSeatNo(), order.getAirplane().getDepartureTerminal(), order.getAirplane().getArrivalTerminal(),
                    order.getAirplane().getDepartureGate(), order.getAirplane().getArrivalGate()
            );
        } catch (IOException ex) {
            Logger.getLogger(SelectSeat.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Utils.emailTicket(customer.getEmail());
        CustomerPanel customerPanel = new CustomerPanel(ecoSystem, customer, mainJFrame);
        Utils.newPage(customerPanel);
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblArrival;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDeparture;
    private javax.swing.JTable tblSeat;
    // End of variables declaration//GEN-END:variables
}
