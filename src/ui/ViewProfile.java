/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.Dimension;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import model.Address.City;
import model.Address.Community;
import model.Address.House;
import model.Address.HouseDirectory;
import model.Person.Person;
import model.Person.PersonDirectory;

/**
 *
 * @author Dell
 */
public class ViewProfile extends javax.swing.JPanel {

    /**
     * Creates new form PersonJpanel
     */
    PersonDirectory personListObj;
    HouseDirectory houseListObj; 
    public ViewProfile(PersonDirectory personListObj, 
                            ArrayList<String> cityNames,
                            HouseDirectory houseListObj) {
        initComponents();
        this.personListObj = personListObj;
        this.populateTable();   
        cityNames = cityNames;
        this.houseListObj = houseListObj;
        comboCity1.setModel(new DefaultComboBoxModel<String>(cityNames.toArray(new String[0])));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbFirstName = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        lbLastName = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        lbCommunityName = new javax.swing.JLabel();
        lbCity = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPersonDetails = new javax.swing.JTable();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        comboCommunity = new javax.swing.JComboBox<>();
        comboCity1 = new javax.swing.JComboBox<>();
        lbHouseNumber = new javax.swing.JLabel();
        txtHouseNumber = new javax.swing.JTextField();
        lbStreetName = new javax.swing.JLabel();
        txtStreetName = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 153, 255));

        lbFirstName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbFirstName.setText("First Name : ");

        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });

        lbLastName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbLastName.setText("Last Name :");

        txtLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNameActionPerformed(evt);
            }
        });

        lbCommunityName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbCommunityName.setText("Community : ");

        lbCity.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbCity.setText("City : ");

        tblPersonDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Person Id", "First Name", "Last Name", "House Number", "Street Name", "Community", "City"
            }
        ));
        jScrollPane1.setViewportView(tblPersonDetails);

        btnUpdate.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnView.setBackground(new java.awt.Color(255, 255, 255));
        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        comboCommunity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "American", "Asian" }));

        comboCity1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boston", "Cambridge", "Salem", "Amherst" }));

        lbHouseNumber.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbHouseNumber.setText("House Number :");

        txtHouseNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHouseNumberActionPerformed(evt);
            }
        });
        txtHouseNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtHouseNumberKeyReleased(evt);
            }
        });

        lbStreetName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbStreetName.setText("Street Name :");

        txtStreetName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStreetNameActionPerformed(evt);
            }
        });

        lblTitle.setBackground(new java.awt.Color(102, 255, 255));
        lblTitle.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("View Person Profile");
        lblTitle.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(179, 179, 179))
            .addGroup(layout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lbCity)
                                .addComponent(lbCommunityName)
                                .addComponent(lbStreetName))
                            .addGap(29, 29, 29)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtStreetName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(comboCommunity, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(comboCity1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lbFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lbLastName)
                                .addComponent(lbHouseNumber))
                            .addGap(29, 29, 29)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtHouseNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtLastName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnUpdate)
                        .addGap(32, 32, 32)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnView)
                    .addComponent(btnDelete))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbFirstName)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbLastName)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbHouseNumber)
                    .addComponent(txtHouseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStreetName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbStreetName))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCommunityName))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboCity1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCity))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUpdate)
                .addContainerGap(87, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstNameActionPerformed

    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastNameActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblPersonDetails.getSelectedRow();
        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to delete");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblPersonDetails.getModel();
        Person selectedPerson = (Person)model.getValueAt(selectedRowIndex, 0);
        
        boolean firstNameValidation = this.validateName(txtFirstName);
        boolean lastNameValidation = this.validateName(txtLastName);
        boolean houseNumberValidation = this.validateHouseNumber(txtHouseNumber);
        boolean streetNameValidation = this.validateName(txtStreetName);
        JTextField[] textFieldArray = {txtFirstName, txtLastName,
                                        txtHouseNumber, txtStreetName};
        if(firstNameValidation && lastNameValidation && houseNumberValidation
                && streetNameValidation){
            String firstName = txtFirstName.getText().toString();
            String lastName = txtLastName.getText().toString();
            String streetName = txtStreetName.getText().toString();
            int houseNumber = Integer.parseInt(txtHouseNumber.getText());
            String cityName = comboCity1.getSelectedItem().toString();
            String communityName = comboCommunity.getSelectedItem().toString();
            House hObj = new House(houseNumber, streetName,
                        new Community(communityName), new City(cityName));
            Person oldPersonData = personListObj.getPersonData(selectedPerson.getPersonId());
            Person newPerson = new Person(firstName, lastName, hObj, selectedPerson.getPersonId());
            newPerson.setEncounterHistory(oldPersonData.getEncounterHistory());
            this.personListObj.updatePersonDetails(newPerson, selectedRowIndex);
            JOptionPane.showMessageDialog(this, "Record updated successfully.");
            this.populateTable();
        }
        else{
             String errorMessage = String.format("First Name Validation : %s \n" +
                    "Last Name Validation : %s \n" + "HouseNumber Validaiton : %s",
                    firstNameValidation, lastNameValidation, houseNumberValidation);
            
            UIManager.put("OptionPane.minimumSize",new Dimension(100,200)); 
            JOptionPane.showMessageDialog(this, errorMessage);
            this.resetTextFields(textFieldArray);
        }
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblPersonDetails.getSelectedRow();
        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblPersonDetails.getModel();
        Person selectedPerson = (Person)model.getValueAt(selectedRowIndex, 0);
        /* model.setValueAt(txtBrandName.getText(), selectedRowIndex, 1);
            model.setValueAt(txtCity.getText(), selectedRowIndex, 2);
            model.setValueAt(txtMaintCerti.getText(), selectedRowIndex, 3);
            model.setValueAt(txtMfgYr.getText(), selectedRowIndex, 4);
            model.setValueAt(txtModelNum.getText(), selectedRowIndex, 5);
            model.setValueAt(txtSeatNum.getText(), selectedRowIndex, 6);
            model.setValueAt(txtAvailability.getText(), selectedRowIndex, 7);*/
        txtFirstName.setText("");
        txtFirstName.setText(selectedPerson.getFirstName());
        txtLastName.setText("");
        txtLastName.setText(selectedPerson.getLastName());
        txtHouseNumber.setText("");
        txtHouseNumber.setText(String.valueOf(selectedPerson.getHouseNumber()));
        txtStreetName.setText("");
        txtStreetName.setText(selectedPerson.getStreetName());
        comboCity1.setSelectedItem(selectedPerson.getCityName());
        comboCommunity.setSelectedItem(selectedPerson.getCommunityName());
        
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
         int selectedRowIndex = tblPersonDetails.getSelectedRow();
        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblPersonDetails.getModel();
        Person selectedCar = (Person)model.getValueAt(selectedRowIndex, 0);
        this.personListObj.removePerson(selectedCar);
        JOptionPane.showMessageDialog(this, "Record deleted.");
        this.populateTable();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtHouseNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHouseNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHouseNumberActionPerformed

    private void txtHouseNumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHouseNumberKeyReleased
        // TODO add your handling code here:
        try {
            Integer.parseInt(txtHouseNumber.getText());
            if(txtHouseNumber.getText().length() > 4){
                JOptionPane.showMessageDialog(this, "House Number cannot be more than 4 digits.");
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "House Number cannot be more than 4 digits.");
        }
    }//GEN-LAST:event_txtHouseNumberKeyReleased

    private void txtStreetNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStreetNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStreetNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JComboBox<String> comboCity1;
    private javax.swing.JComboBox<String> comboCommunity;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCity;
    private javax.swing.JLabel lbCommunityName;
    private javax.swing.JLabel lbFirstName;
    private javax.swing.JLabel lbHouseNumber;
    private javax.swing.JLabel lbLastName;
    private javax.swing.JLabel lbStreetName;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblPersonDetails;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtHouseNumber;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtStreetName;
    // End of variables declaration//GEN-END:variables

    private boolean validateName(JTextField name){
        String enteredText = name.getText();
        if(name.getText().isEmpty()){
            return false;
        }
        else{
            Pattern namePattern = Pattern.compile("[A-Za-z\\s-.]+");
            Matcher nameMatcher = namePattern.matcher(enteredText);
            if(nameMatcher.matches()){
                return true;
            }
        }
        return false;
    } 

    private boolean validateHouseNumber(JTextField house){
        String enteredText = house.getText();
        if(house.getText().isEmpty()){
            return false;
        }
        else{
            Pattern namePattern = Pattern.compile("[0-9A-Za-z\\s-,.]+");
            Matcher nameMatcher = namePattern.matcher(enteredText);
            if(nameMatcher.matches()){
                return true;
            }
        }
        return false;
    } 
    
    private void resetTextFields(JTextField[] arr){
        for(JTextField reset : arr){
            reset.setText("");
        }
    }

    private void populateTable(){
        DefaultTableModel model = (DefaultTableModel) tblPersonDetails.getModel();
        model.setRowCount(0);
        for(Person personModel : this.personListObj.getPersonList()){
            Object[] row = new Object[7];
            row[0] = personModel.getPersonId();
            row[1] = personModel;
            row[2] = personModel.getLastName();
            row[3] = String.valueOf(personModel.getHouseNumber());
            row[4] = personModel.getStreetName();
            row[5] = personModel.getCommunityName().toString();
            row[6] = personModel.getCityName().toString(); 
            model.addRow(row);
        }
    }
}
