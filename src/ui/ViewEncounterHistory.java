/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Hospital.Encounter;
import model.Hospital.EncounterHistory;
import model.Person.Person;
import model.Person.PersonDirectory;

/**
 *
 * @author Dell
 */
public class ViewEncounterHistory extends javax.swing.JPanel {

    /**
     * Creates new form ViewEncounterHistory
     */
    PersonDirectory personDirec;
    public ViewEncounterHistory(PersonDirectory personDirec) {
        initComponents();
        this.personDirec = personDirec;
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
        btnViewHistory = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEncounter = new javax.swing.JTable();
        lblTitle = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 153, 255));

        lbPersonId.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbPersonId.setText("Enter Person Id :");

        txtPersonId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPersonIdActionPerformed(evt);
            }
        });

        btnViewHistory.setText("View");
        btnViewHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewHistoryActionPerformed(evt);
            }
        });

        tblEncounter.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Person Id", "Age", "Blood Pressure", "Date of Encounter"
            }
        ));
        jScrollPane1.setViewportView(tblEncounter);

        lblTitle.setBackground(new java.awt.Color(102, 255, 255));
        lblTitle.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("View Encounter History");
        lblTitle.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(329, 329, 329)
                                .addComponent(lbPersonId)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPersonId, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 126, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnViewHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(393, 393, 393))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblTitle)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPersonId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPersonId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnViewHistory)
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(212, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewHistoryActionPerformed
        // TODO add your handling code here:
        boolean validatePersonData =  this.validatePersonId();
        if(validatePersonData){
            int personId = Integer.parseInt(txtPersonId.getText());
            Person p = this.personDirec.getPersonData(personId);
            this.populateEncounterHistory(p.getEncounterHistory());
        }
        else{
            JOptionPane.showMessageDialog(this, "Person Id is invalid.");
        }
                
    }//GEN-LAST:event_btnViewHistoryActionPerformed

    private void txtPersonIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPersonIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPersonIdActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnViewHistory;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbPersonId;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblEncounter;
    private javax.swing.JTextField txtPersonId;
    // End of variables declaration//GEN-END:variables
    private boolean validatePersonId(){
        if (!txtPersonId.getText().isEmpty()) {
            String input = txtPersonId.getText();
            Pattern id = Pattern.compile("[0-9]+");
            Matcher nameMatcher = id.matcher(input);
            if(nameMatcher.matches()){
                boolean idMatch = false;
                int enteredTextInt = Integer.parseInt(input);

                for(Person p : personDirec.getPersonList()){
                    if(p.getPersonId() == enteredTextInt){
                        idMatch = true;
                    }
                }
                
                if(idMatch == true){
                    return true;
                }
            }   
        }
        return false;
    }

    private void populateEncounterHistory(ArrayList<Encounter> encounterArr){
        DefaultTableModel model = (DefaultTableModel) tblEncounter.getModel();
        model.setRowCount(0);
        for(Encounter enc : encounterArr){
            Object[] row = new Object[4];
            row[1] = enc;
            row[2] = enc.getBloodPressure();
            row[3] = enc.getEncounteredDate();
            row[0] = txtPersonId.getText();
            model.addRow(row);
        } 
    }
}