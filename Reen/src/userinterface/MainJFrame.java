/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import Business.EcoSystem;
import Business.DB4OUtil.DB4OUtil;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userinterface.friendbot.BotUI;


/**
 *
 * @author Lingfeng
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    public EcoSystem system;
    public DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    public BotUI bot;

    public MainJFrame() {
        initComponents();
        system = dB4OUtil.retrieveSystem();
        LandingPage lp=new LandingPage();
        this.setSize(1680, 1050);
        container.add("LandingPanel", lp);
        CardLayout layout = (CardLayout)this.container.getLayout();
        layout.next(container);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        loginJButton = new javax.swing.JButton();
        loginJLabel = new javax.swing.JLabel();
        logoutJButton = new javax.swing.JButton();
        chat = new javax.swing.JButton();
        container = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        loginJButton.setText("Login");
        loginJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginJButtonActionPerformed(evt);
            }
        });

        logoutJButton.setText("Logout");
        logoutJButton.setEnabled(false);
        logoutJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutJButtonActionPerformed(evt);
            }
        });

        chat.setText("Virtual Assistant");
        chat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(loginJLabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(logoutJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(loginJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(chat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(235, 235, 235)
                .addComponent(loginJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loginJLabel)
                .addGap(18, 18, 18)
                .addComponent(logoutJButton)
                .addGap(104, 104, 104)
                .addComponent(chat, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(585, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        container.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(container);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginJButtonActionPerformed
        // Get user name
        
          SigninOptions so = new SigninOptions(container,system);
        container.add("loginOptions", so);
        CardLayout layout = (CardLayout)this.container.getLayout();
        layout.next(container);
        logoutJButton.setEnabled(true);
        loginJButton.setEnabled(false);
      //  btnRegister.setEnabled(false);
         
    }//GEN-LAST:event_loginJButtonActionPerformed

    private void logoutJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutJButtonActionPerformed
        logoutJButton.setEnabled(false);
         loginJButton.setEnabled(true);

 
        container.removeAll();
        JPanel blankJP = new JPanel();
        container.add("blank", blankJP);
        CardLayout crdLyt = (CardLayout) container.getLayout();
        crdLyt.next(container);
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_logoutJButtonActionPerformed

    private void chatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chatActionPerformed
        BotUI bot=new BotUI();
        bot.setVisible(true);    }//GEN-LAST:event_chatActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton chat;
    private javax.swing.JPanel container;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton loginJButton;
    private javax.swing.JLabel loginJLabel;
    private javax.swing.JButton logoutJButton;
    // End of variables declaration//GEN-END:variables
}
