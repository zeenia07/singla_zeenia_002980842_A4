/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.Dimension;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import model.Hospital.Encounter;
import model.Hospital.EncounterHistory;
import model.Hospital.VitalSigns;
import model.Person.Person;
import model.Person.PersonDirectory;

/**
 *
 * @author Dell
 */
public class AddEncounter extends javax.swing.JPanel {

    /**
     * Creates new form AddEncounter
     */
    PersonDirectory personDirec;
    EncounterHistory ecHistory;
    public AddEncounter(PersonDirectory pd) {
        initComponents();
        this.personDirec = pd;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbPersonId = new javax.swing.JLabel();
        txtPersonId = new javax.swing.JTextField();
        lbBloodPressure = new javax.swing.JLabel();
        txtBloodPressure = new javax.swing.JTextField();
        lbAge = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        lbDate = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 153, 255));

        lbPersonId.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbPersonId.setText("Person Id :");

        txtPersonId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPersonIdFocusLost(evt);
            }
        });

        lbBloodPressure.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbBloodPressure.setText("Blood Pressure :");

        txtBloodPressure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBloodPressureActionPerformed(evt);
            }
        });

        lbAge.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbAge.setText("Age :");

        btnSubmit.setText("Save");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        lbDate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbDate.setText("Encounter Date:");

        lblTitle.setBackground(new java.awt.Color(102, 255, 255));
        lblTitle.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Create Vital Signs");
        lblTitle.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 672, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbPersonId)
                    .addComponent(lbAge)
                    .addComponent(lbBloodPressure)
                    .addComponent(lbDate))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPersonId)
                    .addComponent(txtAge, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtBloodPressure, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btnSubmit)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblTitle)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPersonId)
                    .addComponent(txtPersonId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbBloodPressure))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAge))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSubmit)
                .addContainerGap(111, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtBloodPressureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBloodPressureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBloodPressureActionPerformed

    private void txtPersonIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPersonIdFocusLost
        // TODO add your handling code here:
        if (!txtPersonId.getText().isEmpty()) {
            String enteredText = txtPersonId.getText();
            Pattern namePattern = Pattern.compile("[0-9]+");
            Matcher nameMatcher = namePattern.matcher(enteredText);
            if(nameMatcher.matches()){
                boolean idMatch = false;
                int enteredTextInt = Integer.parseInt(enteredText);

                for(Person p : personDirec.getPersonList()){
                    if(p.getPersonId() == enteredTextInt){
                        idMatch = true;
                    }
                }
                
                if(idMatch == false){
                    JOptionPane.showMessageDialog(this, "Invalid Person Id.");
                    txtPersonId.requestFocus();
                }
            }
            else{
                JOptionPane.showMessageDialog(this, "Invalid Person Id.");
                txtPersonId.requestFocus();
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "Please enter a valid Person Id or Create a Person-id to submit Encounter");
            txtPersonId.requestFocus();
        }
        
    }//GEN-LAST:event_txtPersonIdFocusLost

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        boolean validateAge = this.validateAge(txtAge);
        boolean validateBloodPressure = this.validateBloodPressure(txtBloodPressure);
        boolean validateDate = this.validateDate(txtDate.getText());
        JTextField[] textFieldArray = { txtAge, txtBloodPressure, txtPersonId, txtDate}; 
        if(validateAge && validateBloodPressure && validateDate){
            
            Date dateOfEncounter; 
            try {
                dateOfEncounter = new SimpleDateFormat("MM/dd/yyyy").parse(txtDate.getText());
            } catch (ParseException ex) {
                  JOptionPane.showMessageDialog(this, "Invalid Date format input.");
                  dateOfEncounter = new Date();
            }
            int personId = Integer.parseInt(txtPersonId.getText());
            VitalSigns vs = new VitalSigns(
                    Integer.parseInt(txtBloodPressure.getText())
                    ,Integer.parseInt(txtAge.getText()));
            Encounter ec = new Encounter(vs, dateOfEncounter,
                                   personId );
            
            JOptionPane.showMessageDialog(this, "Data successfully inserted.");
            this.resetTextFields(textFieldArray);
            this.personDirec.AddEncounter(personId, ec);
        }   
        else{
             String errorMessage = String.format("Age Validation : %s \n" +
                    "Blood Pressure Validation : %s \n" + "Encounter Date Validation : %s \n",
                    validateAge, validateBloodPressure, validateDate);
            
            UIManager.put("OptionPane.minimumSize",new Dimension(100,200)); 
            JOptionPane.showMessageDialog(this, errorMessage);
            this.resetTextFields(textFieldArray);
        }
    }//GEN-LAST:event_btnSubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel lbAge;
    private javax.swing.JLabel lbBloodPressure;
    private javax.swing.JLabel lbDate;
    private javax.swing.JLabel lbPersonId;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtBloodPressure;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtPersonId;
    // End of variables declaration//GEN-END:variables

    private boolean validateAge(JTextField validateAge){
        String enteredText = validateAge.getText();
        if(validateAge.getText().isEmpty()){
            return false;
        }
        else{
            Pattern namePattern = Pattern.compile("[0-9]+");
            Matcher nameMatcher = namePattern.matcher(enteredText);
            if(nameMatcher.matches())
            {
                int age = Integer.parseInt(enteredText);
                if(age < 0 || age > 100){
                    return false;
                }
                return true;
            }
        }
        return false;
    } 

    private boolean validateBloodPressure(JTextField bp){
        String enteredText = bp.getText();
        if(bp.getText().isEmpty()){
            return false;
        }
        else{
            Pattern namePattern = Pattern.compile("[0-9]+");
            Matcher nameMatcher = namePattern.matcher(enteredText);
            if(nameMatcher.matches())
            {
                int bloodPressure = Integer.parseInt(enteredText);
                if(bloodPressure < 50 || bloodPressure > 300){
                    return false;
                }
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
    
    private boolean validateDate(String dateOfBirth){
        
        if (dateOfBirth.trim().length() == 10){ 
            String[] dateArr = dateOfBirth.split("/");
            int month, day, year;
            month = Integer.parseInt(dateArr[0]);
            day = Integer.parseInt(dateArr[1]);
            year = Integer.parseInt(dateArr[2]);
            if(year > 1950 && year < 2022){
               if (month==4 || month==6 || month==9 || month==11){
                   if (day >= 1 && day < 31){
                       return true;
                   }
               }
               else if(month==1 || month==3 || month==5|| month==7 || month==8 || month==10 || month==12){
                   if (day >= 1 && day < 31){
                       return true;
                   }
               }
               else{
                   if (year %4 ==0){
                       // leap year - 29days
                       if (day >= 1 && day < 30){
                            return true;
                        }
                   }
                   else{
                       // Feb 28 days
                       if (day >= 1 && day < 29){
                            return true;
                        }
                   }
               }
            }
        }
        
        return false;
    }
}
