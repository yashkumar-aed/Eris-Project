/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.NFRFAidManager.AidManagerWorkAreaJPanel;
/**
 *
 * @author yashk
 */
public class NFRFAidManagerRole extends Role{

    public NFRFAidManagerRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
    public JPanel createWorkArea(JPanel container, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new AidManagerWorkAreaJPanel(container, account, organization, business, enterprise);
    }
}
