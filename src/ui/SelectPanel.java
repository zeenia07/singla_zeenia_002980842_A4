/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import model.Address.CityDirectory;
import model.Address.HouseDirectory;
import model.Hospital.EncounterHistory;
import model.Person.PersonDirectory;

/**
 *
 * @author Dell
 */
public class SelectPanel extends javax.swing.JPanel {

    /**
     * Creates new form SelectPanel
     */
    PersonDirectory personDirectory;
    HouseDirectory houseDirectory;
    CityDirectory cityNames;
    EncounterHistory encounterHistory;
    
    public SelectPanel(PersonDirectory personDirectory, 
                                CityDirectory cityList,
                                HouseDirectory houseDirectory) {
        initComponents();
        this.personDirectory = personDirectory;
        this.cityNames = cityList;
        this.houseDirectory = houseDirectory;
        this.encounterHistory = new EncounterHistory();
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
        personSplitPane = new javax.swing.JSplitPane();
        optionPanel = new javax.swing.JPanel();
        viewPanel = new javax.swing.JPanel();
        btnAddPanel = new javax.swing.JButton();
        btnUpdatePanel = new javax.swing.JButton();
        btnAddEncounter = new javax.swing.JButton();
        btnViewEncounterHistory = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));

        personSplitPane.setDividerLocation(500);
        personSplitPane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        personSplitPane.setPreferredSize(new java.awt.Dimension(944, 774));

        optionPanel.setBackground(new java.awt.Color(0, 51, 102));

        javax.swing.GroupLayout optionPanelLayout = new javax.swing.GroupLayout(optionPanel);
        optionPanel.setLayout(optionPanelLayout);
        optionPanelLayout.setHorizontalGroup(
            optionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 942, Short.MAX_VALUE)
        );
        optionPanelLayout.setVerticalGroup(
            optionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        personSplitPane.setLeftComponent(optionPanel);

        viewPanel.setBackground(new java.awt.Color(102, 153, 255));
        viewPanel.setPreferredSize(new java.awt.Dimension(1240, 713));

        btnAddPanel.setBackground(new java.awt.Color(255, 255, 255));
        btnAddPanel.setText("Add Person");
        btnAddPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPanelActionPerformed(evt);
            }
        });

        btnUpdatePanel.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdatePanel.setText("View Person");
        btnUpdatePanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdatePanelActionPerformed(evt);
            }
        });

        btnAddEncounter.setBackground(new java.awt.Color(255, 255, 255));
        btnAddEncounter.setText("Add Encounter");
        btnAddEncounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEncounterActionPerformed(evt);
            }
        });

        btnViewEncounterHistory.setBackground(new java.awt.Color(255, 255, 255));
        btnViewEncounterHistory.setText("Encounter History");
        btnViewEncounterHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewEncounterHistoryActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\Desktop\\person.png")); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\Desktop\\vitals.png")); // NOI18N

        javax.swing.GroupLayout viewPanelLayout = new javax.swing.GroupLayout(viewPanel);
        viewPanel.setLayout(viewPanelLayout);
        viewPanelLayout.setHorizontalGroup(
            viewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btnAddPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUpdatePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(btnAddEncounter, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnViewEncounterHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(125, Short.MAX_VALUE))
        );
        viewPanelLayout.setVerticalGroup(
            viewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewPanelLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(viewPanelLayout.createSequentialGroup()
                .addGroup(viewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewPanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(viewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUpdatePanel)
                            .addComponent(btnViewEncounterHistory)
                            .addComponent(btnAddEncounter)
                            .addComponent(btnAddPanel)))
                    .addGroup(viewPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addContainerGap(480, Short.MAX_VALUE))
        );

        personSplitPane.setRightComponent(viewPanel);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(personSplitPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(personSplitPane, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1062, Short.MAX_VALUE))
        );

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPanelActionPerformed
        // TODO add your handling code here:
        CreateProfile personPanelObj = new CreateProfile(this.personDirectory, 
                                this.cityNames.getCityNames(),
                                this.houseDirectory);
        personSplitPane.setBottomComponent(personPanelObj);
    }//GEN-LAST:event_btnAddPanelActionPerformed

    private void btnUpdatePanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdatePanelActionPerformed
        // TODO add your handling code here:
        ViewProfile updatePersonPanelObj = new ViewProfile(personDirectory,
                                   this.cityNames.getCityNames(), this.houseDirectory);
        personSplitPane.setBottomComponent(updatePersonPanelObj);     
    }//GEN-LAST:event_btnUpdatePanelActionPerformed

    private void btnAddEncounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEncounterActionPerformed
        // TODO add your handling code here:
        AddEncounter addEncounterPanelObj = new AddEncounter(personDirectory);
        personSplitPane.setBottomComponent(addEncounterPanelObj);     
    }//GEN-LAST:event_btnAddEncounterActionPerformed

    private void btnViewEncounterHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewEncounterHistoryActionPerformed
        // TODO add your handling code here:
        ViewEncounterHistory encounterHistPanelObj = new ViewEncounterHistory(personDirectory);
        personSplitPane.setBottomComponent(encounterHistPanelObj);
    }//GEN-LAST:event_btnViewEncounterHistoryActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddEncounter;
    private javax.swing.JButton btnAddPanel;
    private javax.swing.JButton btnUpdatePanel;
    private javax.swing.JButton btnViewEncounterHistory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel optionPanel;
    private javax.swing.JSplitPane personSplitPane;
    private javax.swing.JPanel viewPanel;
    // End of variables declaration//GEN-END:variables
}