/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.NFRFAidManager;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ReenAdminToNFRFAid;
import java.awt.CardLayout;
import java.util.Random;
import userinterface.friendbot.BotUI;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.friendbot.BotUI;
/**
 *
 * @author yashk
 */
public class ViewClaimsAccountRequest extends javax.swing.JPanel {

    /**
     * Creates new form ViewClaimsAccountRequest
     */
 private JPanel userProcessContainer;
    private Organization organization;
    private UserAccount userAccount;
    private Enterprise enterprise;

    
      public ViewClaimsAccountRequest(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
     
        valueLabel.setText(organization.getName());
        populateRequestTable();
    }

    
    public void populateRequestTable(){
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        
        model.setRowCount(0);
        for (ReenAdminToNFRFAid request : enterprise.getWorkQueue().getReenadminToNFRFAid()){
            Object[] row = new Object[4];
            row[0] = request;
            row[1] = request.getResponder().getBranch();
            
            row[2] = request.getResponder().getFirstName();
            row[3] = request.getStatus();
            
            
            model.addRow(row);
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        viewResponders = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        refreshTestJButton = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        TA11 = new javax.swing.JTextArea();
        jScrollPane13 = new javax.swing.JScrollPane();
        TA12 = new javax.swing.JTextArea();
        jButton8 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setMaximumSize(new java.awt.Dimension(1245, 1000));
        jPanel1.setMinimumSize(new java.awt.Dimension(1245, 1000));

        workRequestJTable.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Message", "Branch", "Responders Name", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        viewResponders.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        viewResponders.setText("VIEW RESPONDERS DETAILS");
        viewResponders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRespondersActionPerformed(evt);
            }
        });

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        enterpriseLabel.setText("ORGANIZATION:");

        valueLabel.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        valueLabel.setText("<value>");

        refreshTestJButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        refreshTestJButton.setText("Refresh");
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));

        jScrollPane12.setBorder(null);
        jScrollPane12.setToolTipText("");

        TA11.setEditable(false);
        TA11.setColumns(20);
        TA11.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        TA11.setRows(5);
        TA11.setBorder(null);
        jScrollPane12.setViewportView(TA11);

        jScrollPane13.setBorder(null);
        jScrollPane13.setForeground(new java.awt.Color(122, 71, 221));
        jScrollPane13.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane13.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        TA12.setColumns(20);
        TA12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        TA12.setRows(5);
        TA12.setBorder(null);
        TA12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TA12KeyPressed(evt);
            }
        });
        jScrollPane13.setViewportView(TA12);

        jButton8.setText("SEND");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane12)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(213, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnBack)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(149, 149, 149)
                                    .addComponent(enterpriseLabel)
                                    .addGap(18, 18, 18)
                                    .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(viewResponders)
                                .addGap(526, 526, 526))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(refreshTestJButton)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 849, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(183, 183, 183))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refreshTestJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(viewResponders, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(178, Short.MAX_VALUE))
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

    private void viewRespondersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRespondersActionPerformed
        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row from the table");
            return;
        }
        else{
            ReenAdminToNFRFAid request = (ReenAdminToNFRFAid)workRequestJTable.getValueAt(selectedRow,0);
            if(request.getStatus().equals("Pending")){
                request.setStatus("Processing");
                request.setReceiver(userAccount);

                //              enterprise.getWorkQueue().getResponderToClaimManagr().add(request);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                ClaimsAccountCreate b = new ClaimsAccountCreate(userAccount, userProcessContainer, enterprise, request);
                userProcessContainer.add("BankAccountCreate", b);
                layout.next(userProcessContainer);
            }
            else{
                JOptionPane.showMessageDialog(null, "Bank Account already created!");
                return;

            }
        }
    }//GEN-LAST:event_viewRespondersActionPerformed

    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed

    }//GEN-LAST:event_refreshTestJButtonActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
       userProcessContainer.remove(this);
        CardLayout cardlayout = (CardLayout) userProcessContainer.getLayout();
        cardlayout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void TA12KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TA12KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_TA12KeyPressed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        String query=TA2.getText();
        TA1.append(" You: "+query+"\n");
        //query.trim();
        query=query.toLowerCase();
        if(query.contains("clear screen")||query.contains("delete")||query.contains("cls"))
        {
            TA1.setText("");
            TA2.setText("");
        }
        else if(query.contains("hi")||query.contains("hello")||query.contains("helloji")||query.contains("hello") ||query.contains("hai") ||query.contains("hii"))
        {
            Random rand=new Random();
            int a=rand.nextInt(3);
            if(a==0)
            {
                ai("How may I be of assistance?");
            }
            else if(a==1)
            {
                ai("How can I help you?....");
            }
            else if(a==2)
            {
                ai("You need assistance?");
            }

        }
        else if((query.contains("when will my account get approved?")||query.contains("account")||query.contains("account status")) && !query.contains("login"))
        {
            Random rand=new Random();
            int a=rand.nextInt(1);
            if(a==0)
            {
                ai("Please wait, claims manager would approve your account shortly");
            }
            else if(a==1)
            {
                ai("once claim manager verifies it");
            }
        }

        else if(query.contains("when will i get my claim") && !(query.contains("claim")||query.contains("funds")||query.contains("i need money")))
        {
            Random rand=new Random();
            int a=rand.nextInt(1);
            if(a==0)
            {
                ai("your funds will be deposited shortly");

            }
            else if(a==1)
            {
                ai("your funds will be contributed by our proud volunteers");

            }
        }

        else if((query.contains("your name?")||query.contains("you name")||query.contains("who are you")) && query.contains("my name"))
        {
            Random rand=new Random();
            int a=rand.nextInt(1);
            if(a==0)
            {
                ai("My Name is AI... What are you doing?");
            }
            else if(a==1)
            {
                ai("My Name is AI... What do you think about our responders?");
            }
        }

        else if(query.contains("thank you"))
        {
            Random rand=new Random();
            int a=rand.nextInt(1);
            if(a==0)
            {
                ai("BTW... Thank you so much for talking the time to talk with me. Sorry, I have to go now :(   ");
            }
            else if(a==1)
            {
                ai("Oh, look at the time! I think I have to go now... Sorry :( ");
            }
        }

        else{
            Random rand=new Random();
            int a=rand.nextInt(4);
            if(a==0)
            {
                ai("Sorry,I'cant get you");
            }
            else if(a==1)
            {
                ai("Plase say it correctly");
            }
            else if(a==2)
            {
                ai("Please rephrase that");
            }
            else if(a==3)
            {
                ai("???");
            }
        }
    }//GEN-LAST:event_jButton8ActionPerformed
void ai(String s)
	{
		TA1.append(" Bot : "+s+"\n\n");
		TA2.setText("");
	}

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BotUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BotUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BotUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BotUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BotUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea TA1;
    private javax.swing.JTextArea TA10;
    private javax.swing.JTextArea TA11;
    private javax.swing.JTextArea TA12;
    private javax.swing.JTextArea TA2;
    private javax.swing.JTextArea TA3;
    private javax.swing.JTextArea TA4;
    private javax.swing.JTextArea TA7;
    private javax.swing.JTextArea TA8;
    private javax.swing.JTextArea TA9;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JButton refreshTestJButton;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JButton viewResponders;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
