/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RespondersRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.NFRFInsurance.NFRFInsurance;
import Business.NFRFInsurance.NFRFInsuranceAccountDirectory;
import Business.Network.Network;
import Business.Directory.Responders;
import java.util.Random;
import userinterface.friendbot.BotUI;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ResponderToNFRFInsurance;
import java.awt.CardLayout;
import java.io.File;
import java.util.Date;
import javax.swing.InputVerifier;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import userinterface.friendbot.BotUI;
/**
 *
 * @author yashk
 */
public class InsuranceDetails extends javax.swing.JPanel {

    /**
     * Creates new form InsuranceDetails
     */
    
    private Responders resp;
    private NFRFInsurance insurance; 
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private String documentUpload;
    private String firstName;
    private String lastName;
    private String emailId;
    private String requestedFunds;
    private int policynumber;
    private String address;
    private NFRFInsuranceAccountDirectory insuranceDirectory;
    private boolean flagC;
    private String username;
    private EcoSystem system;
    private Network network;
    private Enterprise enterprise;
    
    
    public InsuranceDetails(UserAccount userAccount, JPanel userProcessContainer, Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.userAccount = userAccount;
        this.resp = userAccount.getResponder();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
       // this.Ins
        
        txtUsername.setText(resp.getUsername());
        txtEmail.setText(resp.getEmailId());
        txtFirstName.setText(resp.getFirstName());
        txtLastName.setText(resp.getLastName());
        
        
//        
//        for(Network n : system.getNetworkList()){
//            if(n.getName().equals(userAccount.getNetwork())){
//                for(Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()){
//                    if(e.getEnterpriseType().equals(Enterprise.EnterpriseType.NFRF)){
//                       insuranceDirectory =  e.getInsuranceAccountDirectory();
//                    
//                    }
//                
//                }
//            
//            }
//        
//        }
        this.system = system;
        jButton1.setEnabled(true);
        
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtPolicyNumber = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtDoc = new javax.swing.JTextField();
        btnBrowse = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        agreeCheckBox = new javax.swing.JCheckBox();
        jPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TA1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        TA2 = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));
        jPanel1.setMaximumSize(new java.awt.Dimension(1245, 1000));
        jPanel1.setMinimumSize(new java.awt.Dimension(1245, 1000));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("INSURANCE DETAILS");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("USERNAME:");
        jLabel2.setPreferredSize(new java.awt.Dimension(699, 595));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("FIRST NAME:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("LAST NAME:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("EMAIL ID:");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setText("POLICY NUMBER:");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setText("ADDRESS:");

        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });

        txtDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocActionPerformed(evt);
            }
        });

        btnBrowse.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnBrowse.setText("Browse");
        btnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel17.setText("UPLOAD DOCUMENT:");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jButton1.setText("CONFIRM");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        agreeCheckBox.setText("*I agree the above information is correct to the best of knowledge.");
        agreeCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agreeCheckBoxActionPerformed(evt);
            }
        });

        jPanel.setBackground(new java.awt.Color(0, 0, 0));

        jScrollPane2.setBorder(null);
        jScrollPane2.setToolTipText("");

        TA1.setEditable(false);
        TA1.setColumns(20);
        TA1.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        TA1.setRows(5);
        TA1.setBorder(null);
        jScrollPane2.setViewportView(TA1);

        jScrollPane3.setBorder(null);
        jScrollPane3.setForeground(new java.awt.Color(122, 71, 221));
        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        TA2.setColumns(20);
        TA2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        TA2.setRows(5);
        TA2.setBorder(null);
        TA2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TA2KeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(TA2);

        jButton3.setText("SEND");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(317, 317, 317)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBack)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                                        .addComponent(txtFirstName)
                                        .addComponent(txtLastName)
                                        .addComponent(txtEmail)
                                        .addComponent(txtPolicyNumber)
                                        .addComponent(txtAddress))
                                    .addComponent(txtDoc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton1)
                                    .addComponent(btnBrowse))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 263, Short.MAX_VALUE)
                                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(464, 464, 464)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(369, 369, 369)
                        .addComponent(agreeCheckBox)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addComponent(btnBack)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtPolicyNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(71, 71, 71)
                        .addComponent(agreeCheckBox)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(btnBrowse)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(191, 191, 191))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1442, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 996, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 849, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 147, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocActionPerformed

    private void btnBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseActionPerformed
          JFileChooser file = new JFileChooser();
         file.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter extensionfilter =  new FileNameExtensionFilter("*.Images", "jpg","png");
        file.addChoosableFileFilter(extensionfilter);
        int result = file.showSaveDialog(null);

        if(result == JFileChooser.APPROVE_OPTION){
            File selectedFile = file.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            this.documentUpload = path;
            txtDoc.setText(path);
        }
        else if(result == JFileChooser.CANCEL_OPTION){
            System.out.println("No File Select");
        }
    }//GEN-LAST:event_btnBrowseActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
       userProcessContainer.remove(this);
        CardLayout cardlayout = (CardLayout) userProcessContainer.getLayout();
        cardlayout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.firstName = txtFirstName.getText();
        this.lastName = txtLastName.getText();
        this.emailId = txtEmail.getText();
        this.policynumber = Integer.parseInt(txtPolicyNumber.getText());
        this.address = txtAddress.getText();
        //this.requestedFunds= txtreqfunds.getText();
        
        
       if (flagC == true){
        NFRFInsurance nw = new NFRFInsurance();
        for(Network network: system.getNetworkList()){
            if(network.getName().equals(userAccount.getNetwork()))
            {
                for(Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()){
                    if(e.getEnterpriseType().equals(Enterprise.EnterpriseType.NFRF))
                    {
                            this.enterprise = e;
                               nw.setBranch(userAccount.getResponder().getBranch());
                               nw.setAddress(this.address);
                               nw.setEmailId(this.emailId);
                               nw.setLastName(lastName);
                               nw.setFirstName(firstName);
                               nw.setPolicyNumber(policynumber);
                               nw.setUsername(userAccount.getUsername());
                               nw.setDocPath(txtDoc.getText());
                               

                                ResponderToNFRFInsurance bminsure = new ResponderToNFRFInsurance( this.resp, userAccount, nw, insuranceDirectory);
                                bminsure.setStatus("Pending");
                                bminsure.setSender(userAccount);
                                bminsure.setRequestDate(new Date());
                               e.getWorkQueue().getResponderToNFRFInsurance().add(bminsure);
                               e.getInsuranceAccountDirectory().addInsurance(nw);
                        
                    }
                }
            }
        }
       this.resp.setTypeL(2);
       this.resp.setInsurance(nw);
       JOptionPane.showMessageDialog(null, "Successfully updated Insurance Profile");
        
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void agreeCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agreeCheckBoxActionPerformed
        // TODO add your handling code here:
        boolean checked = agreeCheckBox.isSelected();
        if(checked == true)
        {
            flagC= true;
        }
        else

        JOptionPane.showMessageDialog(null, "Please check for Declaration");
    }//GEN-LAST:event_agreeCheckBoxActionPerformed

    private void TA2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TA2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_TA2KeyPressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
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
    }//GEN-LAST:event_jButton3ActionPerformed

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
    private javax.swing.JTextArea TA2;
    private javax.swing.JCheckBox agreeCheckBox;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBrowse;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtDoc;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtPolicyNumber;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}