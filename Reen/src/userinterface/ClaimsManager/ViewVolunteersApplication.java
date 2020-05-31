/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ClaimsManager;

import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.io.File;
import java.util.Date;
import java.util.Properties;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author yashk
 */
public class ViewVolunteersApplication extends javax.swing.JPanel {

    /**
     * Creates new form 
     */
    JPanel userProcessContainer;
    private UserAccount account;
    private Enterprise enterprise;
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        notEducated = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        notPrepared = new javax.swing.JRadioButton();
        isPrepared = new javax.swing.JRadioButton();
        isChildrenOnBoard = new javax.swing.JRadioButton();
        notOnBoardChildren = new javax.swing.JRadioButton();
        notGuilty = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        isGuilty = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        notComfortable = new javax.swing.JRadioButton();
        txtEmail = new javax.swing.JTextField();
        isComfortable = new javax.swing.JRadioButton();
        txtUsername = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        isBigChange = new javax.swing.JRadioButton();
        notBigChange = new javax.swing.JRadioButton();
        isPromise = new javax.swing.JRadioButton();
        messageTxt = new javax.swing.JTextField();
        notPromise = new javax.swing.JRadioButton();
        patientID1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        isFinance = new javax.swing.JRadioButton();
        notSelectFinance = new javax.swing.JRadioButton();
        isEducated = new javax.swing.JRadioButton();
        btnReject = new javax.swing.JButton();
        btnAccept = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1245, 1000));
        setMinimumSize(new java.awt.Dimension(1245, 1000));
        setPreferredSize(new java.awt.Dimension(1245, 1000));

        notEducated.setText("No");
        notEducated.setEnabled(false);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setText("You are educated about the realities of the type of adoption you are pursuing.");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("You are financially prepared for the child.");

        notPrepared.setText("No");
        notPrepared.setEnabled(false);

        isPrepared.setText("Yes");
        isPrepared.setEnabled(false);

        isChildrenOnBoard.setText("Yes");
        isChildrenOnBoard.setEnabled(false);

        notOnBoardChildren.setText("No");
        notOnBoardChildren.setEnabled(false);

        notGuilty.setText("No");
        notGuilty.setEnabled(false);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("Your current children are on board with the situation.");

        isGuilty.setText("Yes");
        isGuilty.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("You are prepared for the “worst case scenario.”");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setText("You want to say “yes” not out of guilt.");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Email*:");

        notComfortable.setText("No");
        notComfortable.setEnabled(false);

        txtEmail.setEnabled(false);

        isComfortable.setText("Yes");
        isComfortable.setEnabled(false);

        txtUsername.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Your partner is comfortable with the situation.");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Username*:");

        isBigChange.setText("Yes");
        isBigChange.setEnabled(false);

        notBigChange.setText("No");
        notBigChange.setEnabled(false);

        isPromise.setText("Yes");
        isPromise.setEnabled(false);

        messageTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messageTxtActionPerformed(evt);
            }
        });

        notPromise.setText("No");
        notPromise.setEnabled(false);

        patientID1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        patientID1.setText("Message:");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setText("You plan to make promises or commitments you actually can or will keep");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("You are able or willing to make BIG changes.");

        isFinance.setText("Yes");
        isFinance.setEnabled(false);

        notSelectFinance.setText("No");
        notSelectFinance.setEnabled(false);

        isEducated.setText("Yes");
        isEducated.setEnabled(false);

        btnReject.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnReject.setText("Reject");

        btnAccept.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnAccept.setText("Accept");
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Volunteers Profile");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(isComfortable)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(notComfortable))
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(isBigChange)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(notBigChange))
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(isFinance)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(notSelectFinance))
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(isPrepared)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(notPrepared))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                            .addComponent(txtEmail))
                        .addGap(26, 26, 26)))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(isEducated)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(notEducated))
                    .addComponent(jLabel10)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(isGuilty)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(notGuilty))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(isPromise)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(notPromise))
                    .addComponent(jLabel11)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(isChildrenOnBoard)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(notOnBoardChildren))
                    .addComponent(jLabel9)
                    .addComponent(jLabel12))
                .addGap(101, 101, 101))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(343, 343, 343)
                        .addComponent(btnReject, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(187, 187, 187)
                        .addComponent(btnAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(308, 308, 308)
                        .addComponent(patientID1)
                        .addGap(44, 44, 44)
                        .addComponent(messageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(469, 469, 469)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(isPrepared)
                            .addComponent(notPrepared))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(isFinance)
                            .addComponent(notSelectFinance))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(isBigChange)
                            .addComponent(notBigChange))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(isComfortable)
                            .addComponent(notComfortable)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(isChildrenOnBoard)
                            .addComponent(notOnBoardChildren))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(isEducated)
                            .addComponent(notEducated))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(isPromise)
                            .addComponent(notPromise))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(isGuilty)
                            .addComponent(notGuilty))))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientID1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(messageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReject, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(213, 213, 213))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void messageTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messageTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_messageTxtActionPerformed

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_btnAcceptActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnReject;
    private javax.swing.JRadioButton isBigChange;
    private javax.swing.JRadioButton isChildrenOnBoard;
    private javax.swing.JRadioButton isComfortable;
    private javax.swing.JRadioButton isEducated;
    private javax.swing.JRadioButton isFinance;
    private javax.swing.JRadioButton isGuilty;
    private javax.swing.JRadioButton isPrepared;
    private javax.swing.JRadioButton isPromise;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField messageTxt;
    private javax.swing.JRadioButton notBigChange;
    private javax.swing.JRadioButton notComfortable;
    private javax.swing.JRadioButton notEducated;
    private javax.swing.JRadioButton notGuilty;
    private javax.swing.JRadioButton notOnBoardChildren;
    private javax.swing.JRadioButton notPrepared;
    private javax.swing.JRadioButton notPromise;
    private javax.swing.JRadioButton notSelectFinance;
    private javax.swing.JLabel patientID1;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}