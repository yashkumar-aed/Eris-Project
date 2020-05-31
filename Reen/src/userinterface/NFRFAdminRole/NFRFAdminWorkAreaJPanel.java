/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.NFRFAdminRole;

/**
 *
 * @author yashk
 */
public class NFRFAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NFRFAdminWorkAreaJPanel
     */
    public NFRFAdminWorkAreaJPanel() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        manageUserAccountJButton = new javax.swing.JButton();
        manageOrganizationJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        manageEmployeeJButton = new javax.swing.JButton();

        jPanel1.setMaximumSize(new java.awt.Dimension(1245, 1000));
        jPanel1.setMinimumSize(new java.awt.Dimension(1245, 1000));
        jPanel1.setPreferredSize(new java.awt.Dimension(1245, 1000));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("NFRF ADMINISTRATIVE WORK AREA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, -1, -1));

        manageUserAccountJButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        manageUserAccountJButton.setText("Manage User Account");
        manageUserAccountJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageUserAccountJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(manageUserAccountJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 460, 290, 50));

        manageOrganizationJButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        manageOrganizationJButton.setText("Manage Organization");
        manageOrganizationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrganizationJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(manageOrganizationJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 290, 50));

        enterpriseLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        enterpriseLabel.setText("ENTERPRISE:");
        jPanel1.add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 170, 30));

        valueLabel.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        valueLabel.setText("<value>");
        jPanel1.add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 400, -1));

        manageEmployeeJButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        manageEmployeeJButton.setText("Manage Employee");
        manageEmployeeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmployeeJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(manageEmployeeJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, 290, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 964, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 964, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 792, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 792, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageUserAccountJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageUserAccountJButtonActionPerformed

     
    }//GEN-LAST:event_manageUserAccountJButtonActionPerformed

    private void manageOrganizationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrganizationJButtonActionPerformed
 
    }//GEN-LAST:event_manageOrganizationJButtonActionPerformed

    private void manageEmployeeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmployeeJButtonActionPerformed

         
    }//GEN-LAST:event_manageEmployeeJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton manageEmployeeJButton;
    private javax.swing.JButton manageOrganizationJButton;
    private javax.swing.JButton manageUserAccountJButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
