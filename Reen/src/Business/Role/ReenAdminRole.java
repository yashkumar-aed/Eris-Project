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
import userinterface.ReenAdminRole.ReenAdminWorkAreaJPanel;
import javax.swing.JPanel;
/**
 *
 * @author yashk
 */
public class ReenAdminRole extends Role {
    
     @Override
     public JPanel createWorkArea(JPanel container, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new ReenAdminWorkAreaJPanel(container, business,enterprise, account);
    }
}
