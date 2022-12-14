/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Airline;

import business.EcoSystem;
import business.airline.Airline;
import business.airline.Airplane;
import business.airport.Airport;
import business.employee.AirlineEmployee;
import business.employee.Employee;
import business.util.Constant;
import business.util.Utils;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import javax.swing.table.DefaultTableModel;

import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author mamthashetty
 */
public class EditFlight extends javax.swing.JPanel {

    /**
     * Creates new form AddFlight
     */
    EcoSystem ecoSystem;
    Airline airline;
    Airplane airplane;
    JFrame mainJFrame;
    public EditFlight(EcoSystem ecoSystem, Airline airline, JFrame mainJFrame, Airplane airplane) {
        initComponents();
        this.ecoSystem = ecoSystem;
        this.airline = airline;
        this.mainJFrame = mainJFrame;
        this.airplane = airplane;
        jPanel1.setOpaque(false);
        populatePilotTable();
        populateCabinCrewTable();
        
        List<Airport> airports = ecoSystem.getAirportDirectory().getAirports();
        for(Airport airport : airports)
        {
            comboBoxDeprature.addItem(airport.getAirportName());
            comboBoxArrival.addItem(airport.getAirportName());
        }
        
        txtFlightNo.setText(airplane.getAirplaneNo());
        comboBoxDeprature.setSelectedItem(airplane.getDepartureAirport().getAirportName());
        txtModelNo.setText(airplane.getModelNo());
        txtDepartureTime.setText(airplane.getDepartureTime());
        comboBoxArrival.setSelectedItem(airplane.getArrivalAirport().getAirportName());
        txtTotalHours.setText(airplane.getTotalHours());
        txtNoOfPilot.setText(airplane.getNoOfPilot());
        txtNoOfCabinCrew.setText(airplane.getNoOfAirHostess());
        txtPrice.setText(airplane.getPrice());
        
        
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

        jPanel1 = new javax.swing.JPanel();
        txtFlightNo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNoOfCabinCrew = new javax.swing.JTextField();
        txtDepartureTime = new javax.swing.JTextField();
        txtModelNo = new javax.swing.JTextField();
        btnAddFlight = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTotalHours = new javax.swing.JTextField();
        txtNoOfPilot = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPilot = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCabinCrew = new javax.swing.JTable();
        comboBoxArrival = new javax.swing.JComboBox<>();
        comboBoxDeprature = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnBack2 = new javax.swing.JButton();

        jPanel1.setPreferredSize(new java.awt.Dimension(800, 800));

        txtFlightNo.setEditable(false);
        txtFlightNo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Model No:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Destination:");

        txtNoOfCabinCrew.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtDepartureTime.setFont(new java.awt.Font("Agency FB", 0, 14)); // NOI18N
        txtDepartureTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDepartureTimeActionPerformed(evt);
            }
        });

        txtModelNo.setFont(new java.awt.Font("Agency FB", 0, 14)); // NOI18N

        btnAddFlight.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAddFlight.setForeground(new java.awt.Color(153, 204, 0));
        btnAddFlight.setText("Save Changes");
        btnAddFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddFlightActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Departure:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("No of Pilot:");

        txtTotalHours.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTotalHours.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalHoursActionPerformed(evt);
            }
        });

        txtNoOfPilot.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Departure Time:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("No of Cabin Crew:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Total hours:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Flight No:");

        tblPilot.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tblPilot.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Username", "Name", "Experience"
            }
        ));
        tblPilot.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jScrollPane1.setViewportView(tblPilot);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Add Pilot's:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Add Cabin Crew: ");

        tblCabinCrew.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tblCabinCrew.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Username", "Name", "Experience"
            }
        ));
        tblCabinCrew.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jScrollPane2.setViewportView(tblCabinCrew);

        comboBoxDeprature.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comboBoxDeprature.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxDepratureActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Price:");

        txtPrice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))
                        .addGap(2, 2, 2)))
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFlightNo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtModelNo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPrice)
                    .addComponent(comboBoxDeprature, 0, 281, Short.MAX_VALUE)
                    .addComponent(txtDepartureTime)
                    .addComponent(comboBoxArrival, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTotalHours)
                    .addComponent(txtNoOfPilot)
                    .addComponent(txtNoOfCabinCrew, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(573, 573, 573))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addComponent(btnAddFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(706, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(31, 31, 31)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFlightNo, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxDeprature, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtModelNo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDepartureTime, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxArrival, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTotalHours, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNoOfPilot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtNoOfCabinCrew, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(btnAddFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(912, 912, 912))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(119, 119, 119)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(28, 28, 28)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 38, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(28, 28, 28)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(975, Short.MAX_VALUE)))
        );

        jLabel11.setBackground(new java.awt.Color(0, 102, 102));
        jLabel11.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel11.setText("Edit Flight Detail");

        btnBack2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBack2.setForeground(new java.awt.Color(0, 102, 204));
        btnBack2.setText("<< Back");
        btnBack2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1191, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnBack2)
                .addGap(212, 212, 212)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(btnBack2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1514, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtDepartureTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDepartureTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDepartureTimeActionPerformed

    private void txtTotalHoursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalHoursActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalHoursActionPerformed

    private void btnAddFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddFlightActionPerformed
        String flightNo = (String) txtFlightNo.getText();
        String modelNo = (String) txtModelNo.getText();
        String departureAirport = (String) comboBoxDeprature.getSelectedItem();
        String departureTime = (String) txtDepartureTime.getText();
        String arrivalAirport = (String) comboBoxArrival.getSelectedItem();
        String totalHours = (String) txtTotalHours.getText();
        String noOfPilot = (String) txtNoOfPilot.getText();
        String noOfCabinCrew = (String) txtNoOfCabinCrew.getText();
        String price = (String) txtPrice.getText();

        if(flightNo == null || "".equals(flightNo.trim())) {
            showMessageDialog(this, "Please enter a valid Flight No", "Error", ERROR_MESSAGE);
            return;
        }
        else if(modelNo == null || "".equals(modelNo.trim())) {
            showMessageDialog(this, "Please enter a valid Flight No", "Error", ERROR_MESSAGE);
            return;
        }
        else if(departureTime == null || "".equals(departureTime.trim())) {
            showMessageDialog(this, "Please enter a valid departure time", "Error", ERROR_MESSAGE);
            return;
        }
        else if(totalHours == null || "".equals(totalHours.trim())) {
            showMessageDialog(this, "Please enter a valid total hour journey", "Error", ERROR_MESSAGE);
            return;
        }
        else if(noOfPilot == null || "".equals(noOfPilot.trim()) || !Pattern.matches("^[0-9]+$", noOfPilot.trim())) {
            showMessageDialog(this, "Please enter a valid no of pilot", "Error", ERROR_MESSAGE);
            return;
        }
        else if(noOfCabinCrew == null || "".equals(noOfCabinCrew.trim()) || !Pattern.matches("^[0-9]+$", noOfCabinCrew.trim())) {
            showMessageDialog(this, "Please enter a valid no of cabin crew", "Error", ERROR_MESSAGE);
            return;
        }
        else if(price == null || "".equals(price.trim()) || !Pattern.matches("^[0-9]+$", price.trim())) {
            showMessageDialog(this, "Please enter a valid price", "Error", ERROR_MESSAGE);
            return;
        }
        
        Airport departure = ecoSystem.getAirportDirectory().getAirportFromName(departureAirport);
        Airport arrival = ecoSystem.getAirportDirectory().getAirportFromName(arrivalAirport);

        if(departureAirport.equals(arrivalAirport))
        {
            showMessageDialog(this, "Departure and Arrival airport cannot be same", "Error", ERROR_MESSAGE);
            return;
        }

        int[] pilotSelected = tblPilot.getSelectedRows();
        int[] cabinCrewSelected = tblCabinCrew.getSelectedRows();
        if(pilotSelected.length != Integer.parseInt(noOfPilot))
        {
            showMessageDialog(this, "Please select " + noOfPilot + " no of pilot", "Error", ERROR_MESSAGE);
            return;
        }
        else if(cabinCrewSelected.length != Integer.parseInt(noOfCabinCrew))
        {
            showMessageDialog(this, "Please select " + noOfCabinCrew + " no of cabin crew", "Error", ERROR_MESSAGE);
            return;
        }

        airplane.setEmployees(new ArrayList<Employee>());
        airplane.setAirline(airline);
        airplane.setAirplaneNo(flightNo);
        airplane.setModelNo(modelNo);
        airplane.setDepartureAirport(departure);
        airplane.setDepartureTime(departureTime);
        airplane.setArrivalAirport(arrival);
        airplane.setTotalHours(totalHours);
        airplane.setNoOfPilot(noOfPilot);
        airplane.setNoOfAirHostess(noOfPilot);
        airplane.setPrice(price);

        DefaultTableModel model = (DefaultTableModel) tblPilot.getModel();

        for (int i = 0; i < pilotSelected.length; i++) {
            airplane.getEmployees().add((AirlineEmployee) model.getValueAt(pilotSelected[i], 0));
            AirlineEmployee airlineEmployee = (AirlineEmployee) model.getValueAt(pilotSelected[i], 0);
            airlineEmployee.getAirplanes().add(airplane);
        }

        model = (DefaultTableModel) tblCabinCrew.getModel();
        for (int i = 0; i < cabinCrewSelected.length; i++) {
            airplane.getEmployees().add((AirlineEmployee) model.getValueAt(cabinCrewSelected[i], 0));
            AirlineEmployee airlineEmployee = (AirlineEmployee) model.getValueAt(cabinCrewSelected[i], 0);
            airlineEmployee.getAirplanes().add(airplane);
        }

        showMessageDialog(this, "Flight detail edited successfully");
        ViewFlight viewFlight = new ViewFlight(mainJFrame, airline, ecoSystem);
        
    }//GEN-LAST:event_btnAddFlightActionPerformed

    private void comboBoxDepratureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxDepratureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxDepratureActionPerformed

    private void btnBack2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack2ActionPerformed
        ViewFlight viewFlight = new ViewFlight(mainJFrame, airline, ecoSystem);
        Utils.previosPage(viewFlight);
    }//GEN-LAST:event_btnBack2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddFlight;
    private javax.swing.JButton btnBack2;
    private javax.swing.JComboBox<String> comboBoxArrival;
    private javax.swing.JComboBox<String> comboBoxDeprature;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblCabinCrew;
    private javax.swing.JTable tblPilot;
    private javax.swing.JTextField txtDepartureTime;
    private javax.swing.JTextField txtFlightNo;
    private javax.swing.JTextField txtModelNo;
    private javax.swing.JTextField txtNoOfCabinCrew;
    private javax.swing.JTextField txtNoOfPilot;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtTotalHours;
    // End of variables declaration//GEN-END:variables

    private void populatePilotTable() {
        DefaultTableModel model = (DefaultTableModel) tblPilot.getModel();
        model.setRowCount(0);
        List<AirlineEmployee> airlineEmployees = ecoSystem.getAirlineEmployeeDirectory().getAirlineEmployees();

        for(AirlineEmployee airlineEmployee : airlineEmployees)
        {
            if(!airline.equals(airlineEmployee.getAirline()))
                continue;
            if(!Constant.pilot.equals(airlineEmployee.getPosition()))
                continue;
            Object[] row = new Object[3];
            row[0] = airlineEmployee;
            row[1] = airlineEmployee.getName();
            row[2] = airlineEmployee.getAirplanes().size();
            model.addRow(row);
        }
    }

    private void populateCabinCrewTable() {
        DefaultTableModel model = (DefaultTableModel) tblCabinCrew.getModel();
        model.setRowCount(0);
        List<AirlineEmployee> airlineEmployees = ecoSystem.getAirlineEmployeeDirectory().getAirlineEmployees();

        for(AirlineEmployee airlineEmployee : airlineEmployees)
        {
            if(!airline.equals(airlineEmployee.getAirline()))
                continue;
            if(!Constant.cabinCrew.equals(airlineEmployee.getPosition()))
                continue;
            Object[] row = new Object[3];
            row[0] = airlineEmployee;
            row[1] = airlineEmployee.getName();
            row[2] = airlineEmployee.getAirplanes().size();
            model.addRow(row);
        }
    }
}
