/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import Business.EcoSystem;
import Business.Organization.Organization;
import java.awt.CardLayout;
import javax.swing.JPanel;


/**
 *
 * @author yashk
 */
public class SigninOptions extends javax.swing.JPanel {

    /**
     * Creates new form SigninOptiona
     */
    JPanel userProcessContainer;
    EcoSystem system;
    Organization.Type type;
            
    
    public SigninOptions(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        
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
        btnClaimsManager = new javax.swing.JButton();
        btnResponders = new javax.swing.JButton();
        btnVolunteers = new javax.swing.JButton();
        btnNFRFAid = new javax.swing.JButton();
        btnAdmin = new javax.swing.JButton();
        btnNFRFInsurance = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setMaximumSize(new java.awt.Dimension(1245, 1000));
        jPanel1.setMinimumSize(new java.awt.Dimension(1245, 1000));

        btnClaimsManager.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnClaimsManager.setText("Claims Manager");
        btnClaimsManager.setMaximumSize(new java.awt.Dimension(153, 73));
        btnClaimsManager.setMinimumSize(new java.awt.Dimension(153, 73));
        btnClaimsManager.setPreferredSize(new java.awt.Dimension(153, 73));
        btnClaimsManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClaimsManagerActionPerformed(evt);
            }
        });

        btnResponders.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnResponders.setText("Responders");
        btnResponders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRespondersActionPerformed(evt);
            }
        });

        btnVolunteers.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnVolunteers.setText("Volunteers");
        btnVolunteers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolunteersActionPerformed(evt);
            }
        });

        btnNFRFAid.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnNFRFAid.setText("NFRF AID");
        btnNFRFAid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNFRFAidActionPerformed(evt);
            }
        });

        btnAdmin.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnAdmin.setText("Admin");
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });

        btnNFRFInsurance.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnNFRFInsurance.setText("NFRF Insurance");
        btnNFRFInsurance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNFRFInsuranceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(488, 488, 488)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnClaimsManager, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                    .addComponent(btnAdmin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVolunteers, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNFRFAid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNFRFInsurance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnResponders, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(512, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(btnAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnResponders, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnClaimsManager, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVolunteers, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnNFRFAid, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnNFRFInsurance, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(301, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1245, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnClaimsManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClaimsManagerActionPerformed
        // TODO add your handling code here:
        LoginPage ls = new LoginPage(userProcessContainer, system, type.ClaimsManager);
        userProcessContainer.add("LoginPage", ls);
        CardLayout layout = (CardLayout)this.userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnClaimsManagerActionPerformed

    private void btnRespondersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRespondersActionPerformed
        // TODO add your handling code here:
         LoginPage ls = new LoginPage(userProcessContainer, system, type.ResponderOrg);
        userProcessContainer.add("LoginPage", ls);
        CardLayout layout = (CardLayout)this.userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnRespondersActionPerformed

    private void btnVolunteersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolunteersActionPerformed
        // TODO add your handling code here:
       LoginPage ls = new LoginPage(userProcessContainer, system, type.VolunteerOrg);
        userProcessContainer.add("LoginPage", ls);
        CardLayout layout = (CardLayout)this.userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnVolunteersActionPerformed

    private void btnNFRFAidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNFRFAidActionPerformed
        // TODO add your handling code here:
      LoginPage ls = new LoginPage(userProcessContainer,system, type.NFRFAidManager);
        userProcessContainer.add("LoginPage", ls);
        CardLayout layout = (CardLayout)this.userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnNFRFAidActionPerformed

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
        // TODO add your handling code here:
      LoginPage ls = new LoginPage(userProcessContainer, system, type.ReenAdmin);
        userProcessContainer.add("LoginPage", ls);
        CardLayout layout = (CardLayout)this.userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAdminActionPerformed

    private void btnNFRFInsuranceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNFRFInsuranceActionPerformed
        // TODO add your handling code here:
          LoginPage ls = new LoginPage(userProcessContainer,system, type.NFRFInsuranceManager);
        userProcessContainer.add("LoginPage", ls);
        CardLayout layout = (CardLayout)this.userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnNFRFInsuranceActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnClaimsManager;
    private javax.swing.JButton btnNFRFAid;
    private javax.swing.JButton btnNFRFInsurance;
    private javax.swing.JButton btnResponders;
    private javax.swing.JButton btnVolunteers;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}