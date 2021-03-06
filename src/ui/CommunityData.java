/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;
import javax.swing.table.DefaultTableModel;
import model.Patient.Patient;
import model.Patient.PatientDirectory;
import model.Person.Person;

/**
 *
 * @author Dell
 */
public class CommunityData extends javax.swing.JPanel {

    /**
     * Creates new form CommunityData
     */
    PatientDirectory patientDirectory;
    public CommunityData(PatientDirectory patientDirec) {
        initComponents();
        this.patientDirectory = patientDirec;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCommunity = new javax.swing.JLabel();
        comboCommunity = new javax.swing.JComboBox<>();
        btnSummary = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCommunity = new javax.swing.JTable();
        lblTitle = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 153, 255));

        lblCommunity.setText("Community Name :");

        comboCommunity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "American", "Asian" }));

        btnSummary.setText("View Summary");
        btnSummary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSummaryActionPerformed(evt);
            }
        });

        tblCommunity.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Age Group", "Abnormal Vitals Patient Count"
            }
        ));
        jScrollPane1.setViewportView(tblCommunity);

        lblTitle.setBackground(new java.awt.Color(102, 255, 255));
        lblTitle.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(51, 0, 51));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Community Data");
        lblTitle.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(lblCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(comboCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnSummary))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(264, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCommunity)
                    .addComponent(comboCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSummary))
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(312, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSummaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSummaryActionPerformed
        // TODO add your handling code here:
        String community = comboCommunity.getSelectedItem().toString();
        ArrayList<Patient> patientList = new ArrayList<Patient>();
        
        for(Patient p : this.patientDirectory.getPatientDirectory()){
            if(p.getCommunityName().equals(community)){
                patientList.add(p);
            }
        }
        long[] count = this.getAgeGroupCount(patientList);
        String[] category = {"0-15", "16-30", "31-45", "46-60", "61-75",
                            "76-90", "91-100"};
        this.populateTable(category, count);
       
    }//GEN-LAST:event_btnSummaryActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSummary;
    private javax.swing.JComboBox<String> comboCommunity;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblCommunity;
    // End of variables declaration//GEN-END:variables
    
    private long[] getAgeGroupCount(ArrayList<Patient> tempPatientList){
        long[] abnormalCount = new long[10];
        abnormalCount[0] = tempPatientList.stream().
                filter(c -> c.getAge() > 0 && c.getAge() <= 15).count();
        abnormalCount[1] = tempPatientList.stream().
                filter(c -> c.getAge() > 15 && c.getAge() <= 30).count();
        abnormalCount[2] = tempPatientList.stream().
                filter(c -> c.getAge() > 30 && c.getAge() <= 45).count();
        abnormalCount[3] = tempPatientList.stream().
                filter(c -> c.getAge() > 45 && c.getAge() <= 60).count();
        abnormalCount[4] = tempPatientList.stream().
                filter(c -> c.getAge() > 60 && c.getAge() <= 75).count();
        abnormalCount[5] = tempPatientList.stream().
                filter(c -> c.getAge() > 75 && c.getAge() <= 90).count();
        abnormalCount[6] = tempPatientList.stream().
                filter(c -> c.getAge() > 90).count();
        return abnormalCount;
    }

    
    private void populateTable(String[] ageGroup, long[] patientNo){
        DefaultTableModel model = (DefaultTableModel) tblCommunity.getModel();
        model.setRowCount(0);
        for(int i=0; i < ageGroup.length ; i++){
            Object[] row = new Object[2];
            row[0] = ageGroup[i];
            row[1] = patientNo[i];
            model.addRow(row);
        }
        
    }
}
